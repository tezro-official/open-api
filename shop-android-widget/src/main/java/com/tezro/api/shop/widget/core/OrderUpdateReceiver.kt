package com.tezro.api.shop.widget.core

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import com.tezro.api.shop.model.orders.Order


/**
 * Used to receive broadcasts from Tezro app when order status is updated.
 *
 * @see Order
 */
abstract class OrderUpdateReceiver : BroadcastReceiver() {


    /**
     * Called when order status is updated and order data is loaded from the server
     *
     * @param order The order that was updated
     * @see Order
     */
    abstract fun onOrderStatusUpdated(order: Order)


    /**
     * Default onReceiveMethod. Called when your app receives a broadcast from Tezro.
     * Reads orderId from the intent and loads order from the server.
     *
     * @param context The context that called this broadcast
     * @param intent The intent that contains data from Tezro app
     */
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


        /**
         * Broadcast action that will be invoked by Tezro app when order is updated
         */
        const val TEZRO_ORDER_UPDATED_ACTION = "com.tezro.api.shop.widget.TEZRO_ORDER_UPDATED"


        /**
         * The key that will be used to read orderId from intent
         */
        const val ORDER_ID_KEY = "orderId"


        /**
         * Registers a broadcast receiver inside a specific context
         *
         * @param context The context that will register the receiver
         * @param onOrderUpdate The callback that will be invoked when order is loaded from the server
         *
         * @return Broadcast receiver that was registered. Must be used to unregister the receiver
         * to stop receiving broadcasts
         */
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


        /**
         * Unregisters a broad cast receiver inside a specific context
         *
         * @param context The context that registered the receiver and will unregister it
         * @param orderUpdateReceiver The receiver that will be unregistered
         */
        fun unregisterOrderUpdateReceiver(context: Context, orderUpdateReceiver: OrderUpdateReceiver) {
            context.unregisterReceiver(orderUpdateReceiver)
        }

    }

}