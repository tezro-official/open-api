package com.tezro.api.shop.client.core

import com.tezro.api.shop.client.data.requests.ConfirmDeliveryRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.client.data.responses.OrderResponseBody
import com.tezro.api.shop.client.data.responses.OrdersPageResponseBody
import retrofit2.Call
import retrofit2.http.*

internal interface IShopHttpClient {

    @POST(ORDER_MESSAGES_PATH)
    fun sendMessage(
        @Path(ID_PATH) orderId: String,
        @Body body: SendMessageRequestBody
    ): Call<Void>

    @POST(CONFIRM_DELIVERY_PATH)
    fun confirmDelivery(
        @Path(ID_PATH) orderId: String,
        @Body body: ConfirmDeliveryRequestBody
    ): Call<Void>

    @GET(ORDERS_PATH)
    fun getOrders(@QueryMap parameters: Map<String, Any>): Call<OrdersPageResponseBody>

    @GET(ORDER_PATH)
    fun getOrder(
        @Path(EOS_NAME_PATH) eosName: String,
        @Path(ID_PATH) orderId: String
    ): Call<OrderResponseBody>

    companion object {
        const val ID_PATH = "id"
        const val EOS_NAME_PATH = "eosName"

        const val ORDER_MESSAGES_PATH = "messages/{$ID_PATH}"
        const val CONFIRM_DELIVERY_PATH = "orders/{$ID_PATH}/confirmDelivery"
        const val ORDERS_PATH = "orders"
        const val ORDER_PATH = "orders/{$EOS_NAME_PATH}/{$ID_PATH}"
    }

}