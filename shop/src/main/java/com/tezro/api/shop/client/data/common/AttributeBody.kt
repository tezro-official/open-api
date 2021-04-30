package com.tezro.api.shop.client.data.common

import com.google.gson.annotations.SerializedName

internal data class AttributeBody(
    @SerializedName("name") val name: String,
    @SerializedName("value") val value: String
)