package com.tezro.api.shop.service

import com.tezro.api.shop.client.core.service.RetrofitService
import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.core.client.requests.IRequest
import com.tezro.api.shop.client.data.common.OrderStatusBody
import com.tezro.api.shop.client.data.requests.InitOrderRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.client.data.requests.SetStatusRequestBody
import com.tezro.api.shop.model.common.Pagination
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Error
import com.tezro.api.shop.model.messages.MessageEntity
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

internal class ShopService constructor(
    private val shopHttpClient: IShopHttpClient
) : RetrofitService(), IShopService {

    override fun sendMessage(
        externalOrderId: String,
        message: String,
        entities: List<MessageEntity>?
    ): IRequest<Void, Error> {
        val messageEntities = entities?.map(ShopData::convertMessageEntityToBody)
        val sendMessageBody = SendMessageRequestBody(message, messageEntities)
        val call = shopHttpClient.sendMessage(externalOrderId, sendMessageBody)
        return call.toServiceRequest { it }
    }

    override fun setOrderStatusDelivered(
        orderExternalId: String,
        attributes: List<Attribute>?,
        comment: String?
    ): IRequest<Void, Error> = this.setOrderStatus(
        orderExternalId,
        OrderStatusBody.ORDER_DELIVERED,
        attributes,
        comment
    )

    override fun createOrder(
        orderId: String,
        name: String,
        amount: String,
        currency: Order.Currency,
        confirmAmountUrl: String,
        expiryDate: Date,
        photos: List<String>?,
        attributes: List<Attribute>?
    ): IRequest<Order, Error> {
        val orderCurrency = ShopData.convertOrderCurrencyToParameter(currency)
        val orderAttributes = attributes?.map(ShopData::convertAttributeToBody)

        val expiryDateFormat = SimpleDateFormat(ShopData.DEFAULT_DATE_FORMAT, Locale.getDefault())
        val expiryDateFormatted = expiryDateFormat.format(expiryDate)

        val initOrderBody = InitOrderRequestBody(
            orderId,
            name,
            amount,
            orderCurrency,
            confirmAmountUrl,
            expiryDateFormatted,
            photos,
            orderAttributes
        )

        val call = shopHttpClient.initOrder(initOrderBody)
        return call.toServiceRequest(ShopData::convertBodyToOrder)
    }

    override fun getOrders(
            offset: Long?,
            limit: Long?,
            direction: Pagination.Direction?,
            status: Order.Status?
    ): IRequest<OrdersPage, Error> {
        val parametersMap = HashMap<String, Any>()

        if (offset != null) {
            parametersMap[ShopData.OFFSET_PARAMETER_NAME] = offset
        }

        if (limit != null) {
            parametersMap[ShopData.LIMIT_PARAMETER_NAME] = limit
        }

        if (direction != null) {
            val directionParameter = ShopData.convertDirectionToParameter(direction)
            parametersMap[ShopData.DIRECTION_PARAMETER_NAME] = directionParameter
        }

        if (status != null) {
            val statusParameter = ShopData.convertOrderStatusToParameter(status)
            parametersMap[ShopData.STATUS_PARAMETER_NAME] = statusParameter
        }

        val call = shopHttpClient.getOrders(parametersMap)
        return call.toServiceRequest(ShopData::convertBodyToOrdersPage)
    }

    override fun getOrder(orderExternalId: String): IRequest<Order, Error> {
        val call = shopHttpClient.getOrder(orderExternalId)
        return call.toServiceRequest(ShopData::convertBodyToOrder)
    }

    override fun setOrderStatusDelivering(
        orderExternalId: String,
        attributes: List<Attribute>?,
        trackingNumber: String,
        trackingUrl: String?,
        comment: String?
    ): IRequest<Void, Error> {
        val orderAttributes = attributes?.map(ShopData::convertAttributeToBody)

        val setStatusDeliveryBody = SetStatusRequestBody(
            OrderStatusBody.ORDER_DELIVERING,
            orderAttributes,
            trackingNumber,
            trackingUrl,
            comment
        )

        val call = shopHttpClient.setOrderStatus(orderExternalId, setStatusDeliveryBody)
        return call.toServiceRequest { it }
    }

    override fun setOrderStatusProcessing(
        orderExternalId: String,
        attributes: List<Attribute>?,
        comment: String?
    ): IRequest<Void, Error> = this.setOrderStatus(
        orderExternalId,
        OrderStatusBody.ORDER_PROCESSING,
        attributes,
        comment
    )

    private fun setOrderStatus(
        orderExternalId: String,
        statusBody: OrderStatusBody,
        attributes: List<Attribute>?,
        comment: String?
    ): IRequest<Void, Error> {
        val orderAttributes = attributes?.map(ShopData::convertAttributeToBody)

        val setOrderStatusBody = SetStatusRequestBody(
            statusBody,
            orderAttributes,
            trackingNumber = null,
            trackingUrl = null,
            comment
        )

        val call = shopHttpClient.setOrderStatus(orderExternalId, setOrderStatusBody)
        return call.toServiceRequest { it }
    }
}
