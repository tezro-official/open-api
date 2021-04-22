package com.tezro.api.shop.model.response.orders

import com.tezro.api.shop.model.response.Pagination


/**
 * Contains detailed information about order page
 *
 * @param pagination Contains detailed information about the page
 * @param ordersList Contains orders
 *
 * @see Pagination
 * @see Order
 */
data class OrdersPage(
    val pagination: Pagination,
    val ordersList: List<Order>
)