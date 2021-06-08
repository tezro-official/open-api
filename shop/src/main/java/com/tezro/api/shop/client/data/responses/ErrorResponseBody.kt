package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName

internal data class ErrorResponseBody(
    @SerializedName("error") val error: String,
    @SerializedName("statusCode") val statusCode: Int,
    @SerializedName("message") val message: Any
)