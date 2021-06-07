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

    open var order: Order? = null
        set(value) {
            field = value
            this.onOrderDataChanged()
        }

    open var buttonLabel: String?
        get() = txtBtnLabel.text?.toString()
        set(value) {
            txtBtnLabel.text = value
        }

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
        ).enqueue()
    }

    open fun updateOrder() {
        val orderId = order?.id ?: return
        ShopWidget.getOrder(orderId).enqueue()
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
        delegate?.onLoadingOrderStart()

        imgBtnPay.visibility = INVISIBLE
        rootPaymentQR.visibility = GONE
        pbBtnLoading.visibility = VISIBLE
    }

    protected open fun onLoadingEnd() {
        imgBtnPay.visibility = VISIBLE
        pbBtnLoading.visibility = GONE
    }

    protected open fun IRequest<Order>.enqueue() {
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