package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName
import com.tezro.api.shop.client.data.common.AttributeBody

internal data class InitOrderRequestBody(
    @SerializedName("orderId") val orderId: String,
    @SerializedName("name") val name: String,
    @SerializedName("amount") val amount: String,
    @SerializedName("currency") val currency: String,
    @SerializedName("confirmAmountUrl") val confirmAmountUrl: String?,
    @SerializedName("expiresAt") val expiresAt: String?,
    @SerializedName("photos") val photos: List<String>?,
    @SerializedName("attributes") val attributes: List<AttributeBody>?
)