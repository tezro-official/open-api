package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName
import com.tezro.api.shop.client.data.common.AttributeBody

internal data class OrderResponseBody(
    @SerializedName("orderId") val orderId: String,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("amount") val amount: String,
    @SerializedName("shippingAmount") val shippingAmount: String?,
    @SerializedName("totalAmount") val totalAmount: String,
    @SerializedName("eosName") val eosName: String,
    @SerializedName("currency") val currency: String,
    @SerializedName("expiresAt") val expiresAt: String,
    @SerializedName("link") val link: String,
    @SerializedName("address") val address: AddressResponseBody?,
    @SerializedName("transactionId") val transactionId: String?,
    @SerializedName("confirmAmountUrl") val confirmAmountUrl: String,
    @SerializedName("fullName") val fullName: String?,
    @SerializedName("phone") val phone: String?,
    @SerializedName("photos") val photos: List<String>?,
    @SerializedName("attributes") val attributes: List<AttributeBody>?
)
