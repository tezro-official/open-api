package com.tezro.api.shop.client.core

import com.tezro.api.shop.client.data.requests.InitOrderRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.client.data.requests.SetStatusRequestBody
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

    @POST(ShopHttpData.ORDER_INIT_PATH)
    fun initOrder(@Body body: InitOrderRequestBody): Call<OrderResponseBody>

    @GET(ShopHttpData.ORDERS_PATH)
    fun getOrders(@QueryMap parameters: MutableMap<String, Any>): Call<OrdersPageResponseBody>

    @GET(ShopHttpData.ORDER_PATH)
    fun getOrder(@Path(ShopHttpData.ID_PATH) orderId: String): Call<OrderResponseBody>

    @POST(ShopHttpData.ORDER_SET_STATUS_PATH)
    fun setOrderStatus(
        @Path(ShopHttpData.ID_PATH) orderId: String,
        @Body body: SetStatusRequestBody
    ): Call<Void>
}