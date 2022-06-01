package com.tezro.api.shop.service

import com.tezro.api.shop.client.core.client.requests.IRequest
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Error
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
     * @param externalOrderId Order's id to which messages should be sent. Make sure to use
     * order's external id rather than internal
     * @param message Message body
     * @param entities Used for making part of text as clickable url link
     *
     * @return Nothing special, just void;)
     *
     * @see Order.externalId
     */
    fun sendMessage(
        externalOrderId: String,
        message: String,
        entities: List<MessageEntity>?
    ): IRequest<Void, Error>


    /**
     * Updates order's current status to delivered and sends a request to the customer to
     * unlock payment.
     *
     * @param orderExternalId Order's id which should be updated. Make sure to use
     * order's external id rather than internal
     * @param comment A comment that will be added to the order with the new status and will be
     * displayed in the payment unlocking request (optional). Length must be in range of 1-4096
     * symbols inclusively
     * @param attributes List of attributes about the order
     *
     * @return Nothing special, just void;)
     *
     * @see Order.externalId
     */
    fun setOrderStatusDelivered(
        orderExternalId: String,
        attributes: List<Attribute>?,
        comment: String?
    ): IRequest<Void, Error>


    /**
     * Initializes a new order.
     *
     * @param orderId The created order will have this value as an internalId. It must be unique
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
     * @see Attribute
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
    ): IRequest<Order, Error>


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
    ): IRequest<OrdersPage, Error>


    /**
     * Request an order by its id.
     *
     * @param orderExternalId Order's id which should be returned. Make sure to use
     * order's external id rather than internal
     *
     * @return The requested order
     *
     * @see Order
     * @see Order.externalId
     */
    fun getOrder(orderExternalId: String): IRequest<Order, Error>


    /**
     * Updates order status to delivering.
     * Adds a new tracking number and url to the order. This number will be used by the customer
     * to track the location of the product during shipment.
     *
     * @param orderExternalId Order's id which should be edited. Make sure to use
     * order's external id rather than internal
     * @param attributes List of attributes about the order
     * @param trackingNumber The number that will be used to track the goods
     * @param trackingUrl The url of the website where goods can be tracked
     * @param comment A comment that will be added to the order with the new status and will be
     * displayed in the payment unlocking request (optional). Length must be in range of 1-4096
     * symbols inclusively
     *
     * @return Nothing special, just void;)
     *
     * @see Order.externalId
     */
    fun setOrderStatusDelivering(
        orderExternalId: String,
        attributes: List<Attribute>?,
        trackingNumber: String,
        trackingUrl: String?,
        comment: String?
    ): IRequest<Void, Error>

    /**
     * Updates order's current status to processing and sends a notification to the customer.
     *
     * @param orderExternalId Order's id which should be updated. Make sure to use
     * order's external id rather than internal
     * @param attributes List of attributes about the order
     * @param comment A comment that will be added to the order with the new status and will be
     * displayed in the payment unlocking request (optional). Length must be in range of 1-4096
     * symbols inclusively
     *
     * @return Nothing special, just void;)
     *
     * @see Order.externalId
     */
    fun setOrderStatusProcessing(
        orderExternalId: String,
        attributes: List<Attribute>?,
        comment: String?
    ): IRequest<Void, Error>
}
