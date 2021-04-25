package com.tezro.api.shop.client.data.responses

import com.google.gson.annotations.SerializedName

internal data class GeoResponseBody(
    @SerializedName("lat") val lat: Double,
    @SerializedName("lon") val lon: Double
)