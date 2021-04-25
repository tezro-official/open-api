package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName

internal data class SendMessageRequestBody(
    @SerializedName("message") val message: String
)