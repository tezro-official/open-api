package com.tezro.api.shop.model.common


/**
 * Contains information about some order attributes.
 * Can be used to indicate product color, size or quantity.
 *
 * @param name The name of the attribute
 * @param value The value of the attribute
 */
data class Attribute(
    val name: String,
    val value: String
)