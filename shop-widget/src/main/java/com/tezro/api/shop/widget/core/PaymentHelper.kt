package com.tezro.api.shop.widget.core

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.tezro.api.shop.model.orders.Order

object PaymentHelper {

    fun requestPaymentByLink(context: Context, paymentLink: String) {
        context.openLink(paymentLink)
    }

    fun requestPaymentByOrder(context: Context, order: Order) {
        context.openLink(order.paymentLink)
    }

    private fun Context.openLink(link: String) {
        val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(linkIntent)
    }

}