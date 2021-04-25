package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName

internal data class OrdersPageResponseBody(
    @SerializedName("pagination") val pagination: PaginationResponseBody,
    @SerializedName("orders") val orders: List<OrderResponseBody>
)