package com.tezro.api.shop.model


/**
 * Contains detailed information about pages.
 *
 * @param offset Skipped items count
 * @param count Current items count
 * @param total Total items count
 * @param hasPrevious Indicates if there are previous pages of elements
 * @param hasNext Indicates if there are next pages of elements
 *
 * @constructor Creates pagination data object
 */
data class Pagination internal constructor(
    val offset: Long,
    val count: Long,
    val total: Long,
    val hasPrevious: Boolean,
    val hasNext: Boolean
) {

    /**
     * Controls sorting direction in collections.
     */
    enum class Direction {

        /**
         * Used to sort in straight order (A-z or 1-9).
         */
        ASCENDING,


        /**
         * Used to sort in reverse order (z-A or 9-1).
         */
        DESCENDING

    }

}