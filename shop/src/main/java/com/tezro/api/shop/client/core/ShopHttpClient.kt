package com.tezro.api.shop.client.core

import com.tezro.api.core.client.SimpleResponse
import com.tezro.api.shop.client.core.requests.SendMessageRequestBody
import com.tezro.api.shop.model.input.InputPagination
import com.tezro.api.shop.model.response.orders.Order
import com.tezro.api.shop.model.response.orders.OrdersPage
import retrofit2.Call
import retrofit2.http.*

internal interface ShopHttpClient {

    @POST("/api/v1/messages/{id}")
    fun sendMessage(@Path("id") orderId: String, @Body body: SendMessageRequestBody): Call<SimpleResponse>

    @POST("/api/v1/orders/{id}/confirmDelivery")
    fun confirmDelivery(@Path("id") orderId: String, @Body body: SendMessageRequestBody): Call<SimpleResponse>

    @GET("/api/v1/orders")
    fun getOrders(@QueryMap parameters: Map<String, Any>): Call<OrdersPage>

    @GET("/api/v1/orders/{eosName}/{id}")
    fun getOrder(@Path("eosName") eosName: String, @Path("id") orderId: String): Call<Order>

}