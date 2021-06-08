package com.tezro.api.shop.widget.views

import android.content.Context
import android.util.AttributeSet
import android.widget.*
import androidx.annotation.CallSuper
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Error
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.widget.R
import com.tezro.api.shop.widget.core.PaymentHelper
import com.tezro.api.shop.widget.core.ShopWidget
import com.tezro.api.shop.widget.views.utils.LazyView
import com.tezro.api.shop.widget.views.utils.QRGenerator
import java.util.*

/**
 * A custom view that is used to proceed users to Tezro to pay for orders.
 *
 * @param context The context where this view will live.
 * @param attributeSet Custom attributes typically given from XML code.
 */
open class TezroPayButton constructor(
    context: Context,
    attributeSet: AttributeSet
) : LinearLayout(context, attributeSet) {

    /**
     * A listener that receives multiple events and states from this View.
     * it can be implemented by your activity or fragment, or using anonymous expressions.
     *
     * If this delegate is not implemented, then you must explicitly provide data and listen to clicks.
     *
     * @see TezroPayButtonDelegate.onRequestOrderInit
     */
    open var delegate: TezroPayButtonDelegate? = null


    /**
     * If you already have an order object then there is no need to create one.
     * Use this setter to handle payment for a specific order.
     * This will update QR and the behaviour of the button.
     *
     * @see Order
     */
    open var order: Order? = null
        set(value) {
            field = value
            this.onOrderDataChanged()
        }


    /**
     * Changes the text that is shown inside payment button.
     * It is recommended to show the price and the currency here.
     *
     * @see Order.totalAmount
     * @see Order.currency
     */
    open var buttonLabel: String?
        get() = txtBtnLabel.text?.toString()
        set(value) {
            txtBtnLabel.text = value
        }


    /**
     * Changes the text that is shown above payment QR code.
     * It is recommended to show the default text.
     *
     * @see Order.paymentLink
     */
    open var paymentQRLabel: String?
        get() = txtPaymentLabel.text?.toString()
        set(value) {
            txtPaymentLabel.text = value
        }


    /**
     * If set to false, updates will be visible to the user. Which means updateOrder method
     * will show progressBars and will disable the pay button.
     *
     * Be careful, if this flag is set to false, onLoadingStart and onLoadingEnd will be called
     * during order updates.
     *
     * @see onLoadingStart
     * @see onLoadingEnd
     */
    open var isSilentUpdate: Boolean = true


    /**
     * If set to false, QR code root will no longer be visible, this means that only the button will
     * be displayed.
     */
    open var isQRCodeEnabled: Boolean = true
        set(value) {
            field = value
            this.onOrderDataChanged()
        }


    /**
     * If set to false, users will have to click again on the button in order to be redirect to Tezro
     * for payment process.
     *
     * Be careful, users might think that your app is lagging if they click the first time and nothing
     * happens, make sure to show some hints to users before using this flag.
     *
     * Hint Example: The initial text of the button will be click to pay, when order is loaded, the
     * text changes to the price and the currency. Users will notice that and click again to pay this
     * sum.
     */
    open var isAutomaticRedirectEnabled: Boolean = true


    /**
     * This is the root parent where the payment QR is contained.
     * It is by default invisible and will be visible if order is successfully loaded.
     *
     * @see imgPaymentQR
     */
    protected open val rootPaymentQR by LazyView<LinearLayout>(R.id.rootQRCode)


    /**
     * This is the imageView where the payment QR is displayed.
     * Its root parent is by default invisible and will be visible if order is successfully loaded.
     *
     * @see rootPaymentQR
     */
    protected open val imgPaymentQR by LazyView<ImageView>(R.id.imgPaymentQR)


    /**
     * This is the text label that is displayed above the QR image view.
     * Its root parent is by default invisible and will be visible if order is successfully loaded.
     *
     * To customize this text use TezroPayButton.paymentQRLabel.
     *
     * @see paymentQRLabel
     * @see rootPaymentQR
     */
    protected open val txtPaymentLabel by LazyView<TextView>(R.id.txtPaymentLabel)


    /**
     * This is the root parent where pay button is contained.
     * It is by default enabled and will be disabled if an order is loading.
     * Its text could be customized using TezroPayButton.buttonLabel.
     *
     * @see buttonLabel
     * @see txtBtnLabel
     */
    protected open val rootPayButton by LazyView<RelativeLayout>(R.id.rootPayButton)


    /**
     * This is the text of the pay button.
     * It could be customized using TezroPayButton.buttonLabel.
     *
     * @see buttonLabel
     */
    protected open val txtBtnLabel by LazyView<TextView>(R.id.txtBtnLabel)


    /**
     * This is the imageView where "Pay" icon is displayed.
     * It will be invisible if an order is loading and a progressBar will be visible instead.
     *
     * @see pbBtnLoading
     */
    protected open val imgBtnPay by LazyView<ImageView>(R.id.imgBtnPay)


    /**
     * This is the loading progressBar.
     * It will be visible if an order is loading instead of "Pay" icon.
     *
     * @see imgBtnPay
     */
    protected open val pbBtnLoading by LazyView<ProgressBar>(R.id.pbBtnLoading)


    /**
     * If you extend this class, make sure to call super.initializeView().
     */
    init { this.initializeView() }


    /**
     * Creates a new order with the provided data and proceeds the user to Tezro for payment.
     *
     * @param orderId The created order will have this value as internalId. It must be unique
     * and length must be in a range of 1 to 20 symbols
     *
     * @param name Name of the order product or products
     * @param amount The amount that should be payed by the customer
     * @param currency The currency that will be accepted for payment
     * @param confirmAmountUrl Used for confirming order's amount and payment status. This must be
     * a valid url. Protocol is required (only `http` or `https`)
     *
     * @param expiryDate The date when this order will be no longer valid. Date must be later
     * than `current time + 1 min` and earlier than `current time + 24 hours`. If you don't provide
     * a date, it will be by default `1 hour` since creation
     *
     * @param photos List of photo urls of ordered products
     * @param attributes List of attributes about the order
     *
     * @return Detailed information about the created order
     *
     * @see Order.Status
     * @see Order.Currency
     * @see Attribute
     * @see Order
     *
     * @throws IllegalStateException if the init method was not called
     */
    open fun initOrder(
        orderId: String,
        name: String,
        amount: String,
        currency: Order.Currency,
        confirmAmountUrl: String,
        expiryDate: Date = Date(),
        photos: List<String>? = null,
        attributes: List<Attribute>? = null
    ) {
        if (this.order?.internalId == orderId) {
            this.updateOrder()
            return
        }

        this.onLoadingStart()
        ShopWidget.createOrder(
            orderId,
            name,
            amount,
            currency,
            confirmAmountUrl,
            expiryDate,
            photos,
            attributes
        ).setSuccessListener { newOrder ->
            order = newOrder
            delegate?.onNewOrderDataLoaded(newOrder)
            this.onLoadingEnd()

            if (isAutomaticRedirectEnabled) this.onPaymentRequested()
        }.setErrorListener { error ->
            delegate?.onLoadingOrderError(error)
            this.onLoadingEnd()
        }.enqueue()
    }


    /**
     * Call this method to check for order updates. Typically called in onResume when users return
     * to the app.
     *
     * It will use the data of the loaded order to request updates, which means if an order is not
     * loaded yet, this method will do nothing.
     */
    open fun updateOrder() {
        val orderExternalId = order?.externalId ?: return
        val orderPaymentLink = order?.paymentLink ?: return

        if (!isSilentUpdate) this.onLoadingStart()
        ShopWidget.getOrder(orderExternalId).setSuccessListener { order ->
            val newOrder = order.copy(paymentLink = orderPaymentLink)
            if (this.order != newOrder) {
                this.order = newOrder
                delegate?.onNewOrderDataLoaded(newOrder)
            }

            this.onLoadingEnd()
        }.setErrorListener { error ->
            delegate?.onLoadingOrderError(error)
            this.onLoadingEnd()
        }.enqueue()
    }


    /**
     * Called to inflate views and setup listeners.
     * Make sure to call super.initializeView() before interacting with any views.
     */
    @CallSuper
    protected open fun initializeView() {
        inflate(context, R.layout.view_tezro_payment_button, this)

        rootPayButton.setOnClickListener {
            this.onPaymentRequested()
        }

        rootPaymentQR.setOnClickListener {
            this.onPaymentRequested()
        }
    }


    /**
     * This method will be called if the user clicks on QR code or payButton.
     * If order is already loaded, then this method will proceed the user to Tezro for payment.
     * If order is not loaded, then this method will call TezroPayButtonDelegate.onRequestOrderInit()
     *
     * @see TezroPayButtonDelegate.onRequestOrderInit
     */
    protected open fun onPaymentRequested() {
        val orderPaymentLink = order?.paymentLink
        if (orderPaymentLink == null) {
            delegate?.onRequestOrderInit()
            return
        }

        PaymentHelper.requestPaymentByLink(context, orderPaymentLink)
    }


    /**
     * This method is called if order finishes loading or it was set explicitly from outside.
     * If the order has a payment link, then a QR code will be displayed, otherwise it will be hidden.
     *
     * @see Order.paymentLink
     */
    protected open fun onOrderDataChanged() {
        val paymentLink = order?.paymentLink
        if (!paymentLink.isNullOrBlank() && isQRCodeEnabled) {
            val qrCodeImage = QRGenerator.generateQRFromString(paymentLink)
            imgPaymentQR.setImageBitmap(qrCodeImage)
            rootPaymentQR.visibility = VISIBLE
        } else {
            rootPaymentQR.visibility = GONE
        }
    }


    /**
     * This method is called if a loading request is executed.
     * It will disable clicks, and show progress bar until the execution is over.
     *
     * @see onLoadingEnd
     */
    protected open fun onLoadingStart() {
        rootPayButton.isEnabled = false
        rootPaymentQR.isEnabled = false
        delegate?.onLoadingOrderStart()
        imgBtnPay.visibility = INVISIBLE
        pbBtnLoading.visibility = VISIBLE
    }


    /**
     * This method is called if a loading request is over.
     * It will enable clicks, and hide the progress bar.
     *
     * @see onLoadingStart
     */
    protected open fun onLoadingEnd() {
        imgBtnPay.visibility = VISIBLE
        pbBtnLoading.visibility = GONE
        rootPayButton.isEnabled = true
        rootPaymentQR.isEnabled = true
    }


    /**
     * Used to listen to different events and states of this button.
     * To start listening, you must implement this interface and assign it to TezroPayButton.delegate.
     *
     * Implementing methods is optional. You can implement only methods that you are interested in.
     *
     * @see TezroPayButton.delegate
     */
    interface TezroPayButtonDelegate {

        /**
         * This method will be called if the user clicks on the button but no order data was provided.
         * To provide data you must call TezroPayButton.initOrder().
         *
         * @see TezroPayButton.initOrder
         */
        fun onRequestOrderInit() {}


        /**
         * This method will be called if order data was provided or the update method was called.
         * To provide data you must call TezroPayButton.initOrder().
         * To update data you must call TezroPayButton.updateOrder().
         *
         * @see TezroPayButton.initOrder
         * @see TezroPayButton.updateOrder
         */
        fun onLoadingOrderStart() {}


        /**
         * This method will be called with the data of a new order when loading is finished.
         * Always called after the first TezroPayButton.initOrder() call or if initOrder is called with a different orderId.
         * If there was an update request, and order data didn't change, this method won't be called.
         *
         * @param order The new order object with new data
         *
         * @see TezroPayButton.initOrder
         * @see TezroPayButton.updateOrder
         * @see Order
         */
        fun onNewOrderDataLoaded(order: Order) {}


        /**
         * This method will be called if something goes wrong while loading order data.
         *
         * @param error This object contains detailed information about the problem.
         *
         * @see TezroPayButton.initOrder
         * @see TezroPayButton.updateOrder
         * @see Error
         */
        fun onLoadingOrderError(error: Error) {}

    }

}