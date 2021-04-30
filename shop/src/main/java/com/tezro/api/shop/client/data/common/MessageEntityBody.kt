package com.tezro.api.shop.client.data.common

import com.google.gson.annotations.SerializedName

internal data class MessageEntityBody(
    @SerializedName("type") val type: String,
    @SerializedName("offset") val offset: Int,
    @SerializedName("length") val length: Int,
    @SerializedName("url") val url: String
)