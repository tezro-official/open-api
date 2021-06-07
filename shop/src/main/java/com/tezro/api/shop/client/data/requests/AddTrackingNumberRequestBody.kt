package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName

internal data class AddTrackingNumberRequestBody(
    @SerializedName("trackingNumber") val trackingNumber: String,
    @SerializedName("trackingUrl") val trackingUrl: String?
)