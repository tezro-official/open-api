package com.tezro.api.shop.client.core.http

import com.tezro.api.core.client.SimpleResponse
import com.tezro.api.shop.client.core.requests.SendMessageRequestBody
import com.tezro.api.shop.model.input.InputPagination
import com.tezro.api.shop.model.response.orders.Order
import com.tezro.api.shop.model.response.orders.OrdersPage
import retrofit2.Call
import retrofit2.http.*

internal interface ShopHttpClient {

    @POST(ShopHttpPaths.ORDER_MESSAGES_PATH)
    fun sendMessage(
        @Path(ShopHttpPaths.ID_PATH) orderId: String,
        @Body body: SendMessageRequestBody
    ): Call<SimpleResponse>

    @POST(ShopHttpPaths.CONFIRM_DELIVERY_PATH)
    fun confirmDelivery(
        @Path(ShopHttpPaths.ID_PATH) orderId: String,
        @Body body: SendMessageRequestBody
    ): Call<SimpleResponse>

    @GET(ShopHttpPaths.ORDERS_PATH)
    fun getOrders(@QueryMap parameters: Map<String, Any>): Call<OrdersPage>

    @GET(ShopHttpPaths.ORDER_PATH)
    fun getOrder(
        @Path(ShopHttpPaths.EOS_NAME_PATH) eosName: String,
        @Path(ShopHttpPaths.ID_PATH) orderId: String
    ): Call<Order>

}