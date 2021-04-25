package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName

internal data class ConfirmDeliveryRequestBody(
    @SerializedName("comment") val comment: String?
)