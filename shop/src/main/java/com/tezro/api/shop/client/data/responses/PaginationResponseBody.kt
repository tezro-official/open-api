package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName

internal data class PaginationResponseBody(
    @SerializedName("offset") val offset: Long,
    @SerializedName("count") val count: Long,
    @SerializedName("total") val total: Long,
    @SerializedName("prev") val prev: Boolean,
    @SerializedName("next") val next: Boolean
)