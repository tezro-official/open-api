package com.tezro.api.shop.service

import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Pagination
import com.tezro.api.shop.model.messages.MessageEntity
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage
import java.util.*


/**
 * A Service which is used to make requests to Tezro Open-Api to send or receive different
 * information about a shop and orders.
 *
 */
interface IShopService {


    /**
     * Sends message to customer that created a specific order.
     * Should be used when order's status is one of: confirmed, delivered, disputed.
     *
     * @param orderId Order's id to which messages should be sent
     * @param message Message body
     * @param entities Used for making part of text as clickable url link
     *
     * @return Nothing special, just void;)
     */
    fun sendMessage(
        orderId: String,
        message: String,
        entities: List<MessageEntity>?
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
     * @return Nothing special, just void;)
     */
    fun confirmDelivery(
        orderId: String,
        comment: String? = null
    ): IRequest<Void>


    /**
     * Initializes a new order.
     *
     * @param orderId The created order will have this value as an identifier. It must be unique
     * and length must be in a range of 1 to 20 symbols
     *
     * @param name Name of the order product or products
     * @param amount The amount that should be payed by the customer
     * @param currency The currency that will be accepted for payment
     * @param confirmAmountUrl Used for confirming order's amount and payment status. This must be
     * a valid url. Protocol is required (only `http` or `https`)
     *
     * @param expiryDate The date when this order will be no longer valid. Date must be later
     * than `current time + 1 min` and earlier than `current time + 24 hours`. If you don't provide
     * a date, it will be by default `1 hour` since creation
     *
     * @param photos List of photo urls of ordered products
     * @param attributes List of attributes about the order
     *
     * @return Detailed information about the created order
     *
     * @see Order.Status
     * @see Order.Currency
     * @see Order
     */
    fun createOrder(
        orderId: String,
        name: String,
        amount: String,
        currency: Order.Currency,
        confirmAmountUrl: String,
        expiryDate: Date,
        photos: List<String>?,
        attributes: List<Attribute>?
    ): IRequest<Order>


    /**
     * Request a list of orders.
     *
     * @param offset Number of elements to skip
     * @param limit Number of elements to return
     * @param direction Sorting direction of elements
     * @param status Filters the result collection to contain only orders of a specific status
     *
     * @return A collection of orders paged and filtered by the given parameters
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
     * @param orderId Order's id which should be returned
     *
     * @return The requested order
     *
     * @see Order
     */
    fun getOrder(orderId: String): IRequest<Order>


}