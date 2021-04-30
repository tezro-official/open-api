package com.tezro.api.shop.widget.core

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import com.tezro.api.shop.model.orders.Order

abstract class OrderUpdateReceiver : BroadcastReceiver() {

    abstract fun onOrderStatusUpdated(order: Order)

    final override fun onReceive(context: Context, intent: Intent) {
        val orderId = intent.getStringExtra(ORDER_ID_KEY) ?: return

        val pendingResult = this.goAsync()
        ShopWidget.getOrder(orderId).setSuccessListener { order ->
            this.onOrderStatusUpdated(order)
            pendingResult.finish()
        }.setErrorListener {
            pendingResult.finish()
        }.enqueue()
    }

    companion object {
        private const val TEZRO_ORDER_UPDATED_ACTION = "com.tezro.api.shop.widget.TEZRO_ORDER_UPDATED"
        private const val ORDER_ID_KEY = "orderId"

        fun registerOrderUpdateReceiver(context: Context, onOrderUpdate: (Order) -> Unit): OrderUpdateReceiver {
            val broadcastReceiver = object : OrderUpdateReceiver() {
                override fun onOrderStatusUpdated(order: Order) {
                    onOrderUpdate.invoke(order)
                }
            }

            val filter = IntentFilter(TEZRO_ORDER_UPDATED_ACTION)
            context.registerReceiver(broadcastReceiver, filter)

            return broadcastReceiver
        }

        fun unregisterOrderUpdateReceiver(context: Context, orderUpdateReceiver: OrderUpdateReceiver) {
            context.unregisterReceiver(orderUpdateReceiver)
        }

    }

}