package com.tezro.api.shop.widget.core

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.orders.Order


/**
 * A helper that's used to proceed the user to order payment.
 *
 * @see Order
 */
object PaymentHelper {


    /**
     * Opens Tezro app or web browser if the app is not installed.
     * Proceeds the user to order payment.
     *
     * @param context Activity or application from where Tezro app will be opened
     * @param paymentLink Payment URL from the order to be payed
     */
    @JvmStatic
    fun requestPaymentByLink(context: Context, paymentLink: String) {
        context.openLink(paymentLink)
    }


    /**
     * Opens Tezro app or web browser if the app is not installed.
     * Proceeds the user to order payment.
     *
     * @param context Activity or application from where Tezro app will be opened
     * @param order The order that should be payed
     */
    @JvmStatic
    fun requestPaymentByOrder(context: Context, order: Order) {
        context.openLink(order.paymentLink)
    }


    /**
     * Opens applications and searches fro apps with payment scheme.
     * @param link The link to be opened
     */
    @JvmStatic
    private fun Context.openLink(link: String) {
        val linkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(linkIntent)
    }

}