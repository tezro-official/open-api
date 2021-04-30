package com.tezro.api.shop.client.core

import com.tezro.api.shop.client.data.requests.ConfirmDeliveryRequestBody
import com.tezro.api.shop.client.data.requests.InitOrderRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.client.data.responses.OrderResponseBody
import com.tezro.api.shop.client.data.responses.OrdersPageResponseBody
import retrofit2.Call
import retrofit2.http.*

internal interface IShopHttpClient {

    @POST(ShopHttpData.ORDER_MESSAGES_PATH)
    fun sendMessage(
        @Path(ShopHttpData.ID_PATH) orderId: String,
        @Body body: SendMessageRequestBody
    ): Call<Void>

    @POST(ShopHttpData.CONFIRM_DELIVERY_PATH)
    fun confirmDelivery(
        @Path(ShopHttpData.ID_PATH) orderId: String,
        @Body body: ConfirmDeliveryRequestBody
    ): Call<Void>

    @POST(ShopHttpData.INIT_ORDER_PATH)
    fun initOrder(@Body body: InitOrderRequestBody): Call<OrderResponseBody>

    @GET(ShopHttpData.ORDERS_PATH)
    fun getOrders(@QueryMap parameters: MutableMap<String, Any>): Call<OrdersPageResponseBody>

    @GET(ShopHttpData.ORDER_PATH)
    fun getOrder(@Path(ShopHttpData.ID_PATH) orderId: String): Call<OrderResponseBody>

}