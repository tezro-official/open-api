package com.tezro.api.shop.widget.views

import android.content.Context
import android.util.AttributeSet
import android.widget.*
import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.core.client.responses.Error
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.widget.R
import com.tezro.api.shop.widget.core.PaymentHelper
import com.tezro.api.shop.widget.core.ShopWidget
import com.tezro.api.shop.widget.views.utils.LazyView
import com.tezro.api.shop.widget.views.utils.QRGenerator
import java.util.*

open class TezroPayButton constructor(
    context: Context,
    attributeSet: AttributeSet
) : LinearLayout(context, attributeSet) {

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

    protected open val rootPaymentQR by LazyView<LinearLayout>(R.id.rootQRCode)
    protected open val imgPaymentQR by LazyView<ImageView>(R.id.imgPaymentQR)
    protected open val txtPaymentLabel by LazyView<TextView>(R.id.txtPaymentLabel)
    protected open val rootPayButton by LazyView<RelativeLayout>(R.id.rootPayButton)
    protected open val txtBtnLabel by LazyView<TextView>(R.id.txtBtnLabel)
    protected open val imgBtnPay by LazyView<ImageView>(R.id.imgBtnPay)
    protected open val pbBtnLoading by LazyView<ProgressBar>(R.id.pbBtnLoading)

    init { this.initializeView() }

    /**
     * Creates a new order with the provided data and proceeds the user to Tezro for payment.
     *
     * @param orderId The created order will have this value as an identifier. It must be unique
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
        if (this.order?.id == orderId) {
            this.updateOrder()
            return
        }

        ShopWidget.createOrder(
            orderId,
            name,
            amount,
            currency,
            confirmAmountUrl,
            expiryDate,
            photos,
            attributes
        ).handleRequest()
    }

    open fun updateOrder() {
        val orderId = order?.id ?: return
        ShopWidget.getOrder(orderId).handleRequest()
    }

    protected open fun initializeView() {
        inflate(context, R.layout.view_tezro_payment_button, this)

        rootPayButton.setOnClickListener {
            this.onPaymentRequested()
        }

        rootPaymentQR.setOnClickListener {
            this.onPaymentRequested()
        }
    }

    protected open fun onPaymentRequested() {
        val orderPaymentLink = order?.paymentLink
        if (orderPaymentLink == null) {
            delegate?.onRequestOrderInit()
            return
        }

        PaymentHelper.requestPaymentByLink(context, orderPaymentLink)
    }

    protected open fun onOrderDataChanged() {
        val paymentLink = order?.paymentLink
        if (paymentLink != null) {
            val qrCodeImage = QRGenerator.generateQRFromString(paymentLink)
            imgPaymentQR.setImageBitmap(qrCodeImage)
            rootPaymentQR.visibility = VISIBLE
        } else {
            rootPaymentQR.visibility = GONE
        }
    }

    protected open fun onLoadingStart() {
        rootPayButton.isEnabled = false
        delegate?.onLoadingOrderStart()
        imgBtnPay.visibility = INVISIBLE
        pbBtnLoading.visibility = VISIBLE
    }

    protected open fun onLoadingEnd() {
        imgBtnPay.visibility = VISIBLE
        pbBtnLoading.visibility = GONE
        rootPayButton.isEnabled = true
    }

    protected open fun IRequest<Order>.handleRequest() {
        onLoadingStart()

        setSuccessListener { newOrder ->
            order = newOrder
            delegate?.onLoadingOrderEnd(newOrder)
            onLoadingEnd()
        }.setErrorListener { error ->
            delegate?.onLoadingOrderError(error)
            onLoadingEnd()
        }.enqueue()
    }

    interface TezroPayButtonDelegate {
        fun onRequestOrderInit()
        fun onLoadingOrderStart()
        fun onLoadingOrderEnd(order: Order)
        fun onLoadingOrderError(error: Error)
    }

}