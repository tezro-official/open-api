package com.tezro.api.shop.model.input


/**
 * Controls collection results.
 *
 * @param offset Number of elements to skip
 * @param limit Number of elements to return
 * @param direction Sorting direction of elements
 *
 * @see Direction
 */
data class InputPagination(
    val offset: Long? = null,
    val limit: Long? = null,
    val direction: Direction? = null
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