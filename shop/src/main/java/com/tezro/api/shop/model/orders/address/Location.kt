package com.tezro.api.shop.model.orders.address


/**
 * Contains detailed information about the geo location
 *
 * @param latitude the north–south position of the point
 * @param longitude the east–west position of the point
 */
data class Location internal constructor(
    val latitude: Double,
    val longitude: Double
)