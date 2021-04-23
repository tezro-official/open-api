package com.tezro.api.shop.client

import com.tezro.api.core.client.Request
import com.tezro.api.core.client.SimpleResponse
import com.tezro.api.shop.model.input.InputPagination
import com.tezro.api.shop.model.response.orders.Order
import com.tezro.api.shop.model.response.orders.OrdersPage


/**
 * A client which is used to make requests to Tezro Open-Api to send or receive different
 * information about a shop or orders.
 *
 */
interface ShopClient {


    /**
     * Sends message to customer that created a specific order.
     * Should be used when order's status is one of: confirmed, delivered, disputed.
     *
     * @param orderId Order's id to which messages should be sent
     * @param message Message body
     *
     * @return simple response with status code and message
     * @see SimpleResponse
     */
    fun sendMessage(
        orderId: String,
        message: String
    ): Request<SimpleResponse>


    /**
     * Updates order's current status to delivered and sends a request to the customer to
     * unlock payment.
     *
     * @param orderId Order's id which should be updated
     * @param comment A comment that will be added to the order with the new status and will be
     * displayed in the payment unlocking request (optional). Length must be in range of 1-4096
     * symbols inclusively
     *
     * @return simple response with status code and message
     * @see SimpleResponse
     */
    fun confirmDelivery(
        orderId: String,
        comment: String? = null
    ): Request<SimpleResponse>


    /**
     * Request a list of orders.
     *
     * @param pagination Controls orders collection
     * @param status Filters the result collection to contain only orders of a specific status
     *
     * @return a collection of orders paged and filtered by the given parameters
     * @see InputPagination
     * @see Order.Status
     * @see OrdersPage
     */
    fun getOrders(
        pagination: InputPagination? = null,
        status: Order.Status? = null
    ): Request<OrdersPage>


    /**
     * Request an order by its id.
     *
     * @param eosName Shop's eosName, can be retrieved from Tezro App
     * @param orderId Order's id which should be returned
     *
     * @return the request order
     * @see Order
     */
    fun getOrder(
        eosName: String,
        orderId: String
    ): Request<Order>


}