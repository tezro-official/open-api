package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName
import com.tezro.api.shop.client.data.common.AttributeBody
import com.tezro.api.shop.client.data.common.OrderStatusBody

internal data class SetStatusRequestBody(
    @SerializedName("status") val status: OrderStatusBody,
    @SerializedName("attributes") val attributes: List<AttributeBody>?,
    @SerializedName("trackingNumber") val trackingNumber: String?,
    @SerializedName("trackingUrl") val trackingUrl: String?,
    @SerializedName("message") val message: String?
)
