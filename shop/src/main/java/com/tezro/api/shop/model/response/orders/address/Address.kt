package com.tezro.api.shop.model.response.orders.address


/**
 * Contains detailed information about the address
 *
 * @param id Address id
 * @param addressLine Full address (Street, building, apartment)
 * @param city Name of the city
 * @param region Name of the region or state
 * @param country Name of the country
 * @param postalCode Zip or postal code of the address line
 * @param location Geo location of the address line
 *
 * @see Location
 */
data class Address internal constructor(
    val id: String,
    val addressLine: String,
    val city: String,
    val region: String,
    val country: String,
    val postalCode: String,
    val location: Location?
)