package com.tezro.api.shop.client.data.requests

import com.google.gson.annotations.SerializedName
import com.tezro.api.shop.client.data.common.MessageEntityBody

internal data class SendMessageRequestBody(
    @SerializedName("message") val message: String,
    @SerializedName("entities") val entities: List<MessageEntityBody>?
)