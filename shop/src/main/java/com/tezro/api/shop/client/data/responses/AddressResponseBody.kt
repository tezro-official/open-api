package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName

internal data class AddressResponseBody(
    @SerializedName("id") val id: String,
    @SerializedName("address") val address: String,
    @SerializedName("city") val city: String,
    @SerializedName("region") val region: String,
    @SerializedName("country") val country: String,
    @SerializedName("postal") val postal: String,
    @SerializedName("geo") val geo: GeoResponseBody?,
    @SerializedName("comment") val comment: String?
)