package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName

internal data class InitOrderRequestBody(
    @SerializedName("orderId") val orderId: String,
    @SerializedName("amount") val amount: String,
    @SerializedName("currency") val currency: String,
    @SerializedName("confirmAmountUrl") val confirmAmountUrl: String?,
    @SerializedName("eosName") val eosName: String,
    @SerializedName("expiresAt") val expiresAt: String?
)