package com.tezro.api.shop.service

import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.core.client.responses.SimpleResponse
import com.tezro.api.core.service.core.IService
import com.tezro.api.shop.model.Pagination
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage
import com.tezro.api.shop.service.samples.ShopServiceSamples


/**
 * A Service which is used to make requests to Tezro Open-Api to send or receive different
 * information about a shop and orders.
 *
 */
interface IShopService : IService {


    /**
     * Sends message to customer that created a specific order.
     * Should be used when order's status is one of: confirmed, delivered, disputed.
     *
     * @param orderId Order's id to which messages should be sent
     * @param message Message body
     *
     * @return nothing special, just void
     *
     * @sample com.tezro.api.shop.service.samples.ShopServiceSamples.sendMessageToCustomer
     *
     * @see SimpleResponse
     */
    fun sendMessage(
        orderId: String,
        message: String
    ): IRequest<Void>


    /**
     * Updates order's current status to delivered and sends a request to the customer to
     * unlock payment.
     *
     * @param orderId Order's id which should be updated
     * @param comment A comment that will be added to the order with the new status and will be
     * displayed in the payment unlocking request (optional). Length must be in range of 1-4096
     * symbols inclusively
     *
     * @return nothing special, just void
     *
     * @sample ShopServiceSamples.confirmOrderDelivery
     *
     * @see SimpleResponse
     */
    fun confirmDelivery(
        orderId: String,
        comment: String? = null
    ): IRequest<Void>


    /**
     * Request a list of orders.
     *
     * @param offset Number of elements to skip
     * @param limit Number of elements to return
     * @param direction Sorting direction of elements
     * @param status Filters the result collection to contain only orders of a specific status
     *
     * @return a collection of orders paged and filtered by the given parameters
     *
     * @sample ShopServiceSamples.getOrdersPage
     *
     * @see Order.Status
     * @see OrdersPage
     * @see Pagination.Direction
     */
    fun getOrders(
        offset: Long? = null,
        limit: Long? = null,
        direction: Pagination.Direction? = null,
        status: Order.Status? = null
    ): IRequest<OrdersPage>


    /**
     * Request an order by its id.
     *
     * @param eosName Shop's eosName, can be retrieved from Tezro App
     * @param orderId Order's id which should be returned
     *
     * @return the requested order
     *
     * @sample ShopServiceSamples.getOrder
     *
     * @see Order
     */
    fun getOrder(
        eosName: String,
        orderId: String
    ): IRequest<Order>


}