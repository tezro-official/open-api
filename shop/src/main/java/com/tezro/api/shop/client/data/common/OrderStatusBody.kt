package com.tezro.api.shop.client.data.common

import com.google.gson.annotations.SerializedName

enum class OrderStatusBody {
    @SerializedName("order_processing") ORDER_PROCESSING,
    @SerializedName("order_delivering") ORDER_DELIVERING,
    @SerializedName("order_delivered") ORDER_DELIVERED
}