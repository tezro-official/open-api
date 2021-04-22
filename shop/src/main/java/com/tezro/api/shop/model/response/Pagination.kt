package com.tezro.api.shop.model.response

import com.tezro.api.shop.model.input.InputPagination


/**
 * Collection response detailed information
 *
 * @param offset Skipped items count
 * @param count Current items count
 * @param total Total items count
 * @param hasPrevious Indicates if there are previous pages of elements
 * @param hasNext Indicates if there are next pages of elements
 *
 * @see InputPagination
 */
data class Pagination internal constructor(
    val offset: Long,
    val count: Long,
    val total: Long,
    val hasPrevious: Boolean,
    val hasNext: Boolean
)