package com.tezro.api.shop.service

import com.tezro.api.shop.client.data.common.AttributeBody
import com.tezro.api.shop.client.data.common.MessageEntityBody
import com.tezro.api.shop.client.data.responses.*
import com.tezro.api.shop.client.data.responses.AddressResponseBody
import com.tezro.api.shop.client.data.responses.GeoResponseBody
import com.tezro.api.shop.client.data.responses.OrderResponseBody
import com.tezro.api.shop.client.data.responses.OrdersPageResponseBody
import com.tezro.api.shop.client.data.responses.PaginationResponseBody
import com.tezro.api.shop.model.common.Pagination
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.messages.MessageEntity
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage
import com.tezro.api.shop.model.orders.address.Address
import com.tezro.api.shop.model.orders.address.Location
import java.lang.IllegalArgumentException
import java.text.SimpleDateFormat
import com.tezro.api.shop.model.common.Error
import java.util.*

internal object ShopData {

    const val OFFSET_PARAMETER_NAME = "offset"
    const val LIMIT_PARAMETER_NAME = "limit"
    const val DIRECTION_PARAMETER_NAME = "sort"
    const val STATUS_PARAMETER_NAME = "status"

    const val DEFAULT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

    private const val DIRECTION_ASCENDING_PARAMETER = 1
    private const val DIRECTION_DESCENDING_PARAMETER = -1

    private const val ORDER_STATUS_RECEIVED_PARAMETER = "order_received"
    private const val ORDER_STATUS_ADDRESS_CONFIRMED_PARAMETER = "address_confirmed"
    private const val ORDER_STATUS_CONFIRMED_PARAMETER = "order_confirmed"
    private const val ORDER_STATUS_CREATED_PARAMETER = "order_created"
    private const val ORDER_STATUS_DELIVERED_PARAMETER = "order_delivered"
    private const val ORDER_STATUS_DISPUTED_PARAMTER = "order_disputed"
    private const val ORDER_STATUS_EXPIRED_PARAMETER = "order_expired"

    private const val ETH_CURRENCY_PARAMETER = "ETH"
    private const val BTC_CURRENCY_PARAMETER = "BTC"
    private const val USDT_CURRENCY_PARAMETER = "USDT"
    private const val EURT_CURRENCY_PARAMETER = "EURT"
    private const val CNHT_CURRENCY_PARAMETER = "CNHT"
    private const val XAUT_CURRENCY_PARAMETER = "XAUT"
    private const val USD_CURRENCY_PARAMETER = "USD"
    private const val EUR_CURRENCY_PARAMETER = "EUR"
    private const val CNY_CURRENCY_PARAMETER = "CNY"

    fun convertOrderStatusToParameter(orderStatus: Order.Status): String
            = when(orderStatus) {
                Order.Status.RECEIVED -> ORDER_STATUS_RECEIVED_PARAMETER
                Order.Status.ADDRESS_CONFIRMED -> ORDER_STATUS_ADDRESS_CONFIRMED_PARAMETER
                Order.Status.CONFIRMED -> ORDER_STATUS_CONFIRMED_PARAMETER
                Order.Status.CREATED -> ORDER_STATUS_CREATED_PARAMETER
                Order.Status.DELIVERED -> ORDER_STATUS_DELIVERED_PARAMETER
                Order.Status.DISPUTED -> ORDER_STATUS_DISPUTED_PARAMTER
                Order.Status.EXPIRED -> ORDER_STATUS_EXPIRED_PARAMETER
            }

    fun convertDirectionToParameter(direction: Pagination.Direction): Int
            = if (direction == Pagination.Direction.ASCENDING) {
                DIRECTION_ASCENDING_PARAMETER
            } else {
                DIRECTION_DESCENDING_PARAMETER
            }

    fun convertOrderCurrencyToParameter(currency: Order.Currency): String
            = when(currency) {
                Order.Currency.ETH -> ETH_CURRENCY_PARAMETER
                Order.Currency.BTC -> BTC_CURRENCY_PARAMETER
                Order.Currency.USDT -> USDT_CURRENCY_PARAMETER
                Order.Currency.EURT -> EURT_CURRENCY_PARAMETER
                Order.Currency.CNHT -> CNHT_CURRENCY_PARAMETER
                Order.Currency.XAUT -> XAUT_CURRENCY_PARAMETER
                Order.Currency.USD -> USD_CURRENCY_PARAMETER
                Order.Currency.EUR -> EUR_CURRENCY_PARAMETER
                Order.Currency.CNY -> CNY_CURRENCY_PARAMETER
            }

    fun convertBodyToOrder(orderResponseBody: OrderResponseBody): Order = orderResponseBody.run {
        val orderStatus = convertParameterToOrderStatus(status)
        val orderCurrency = convertParameterToOrderCurrency(orderResponseBody.currency)

        val expiryDateFormat = SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.getDefault())
        val expiryDate = expiryDateFormat.parse(expiresAt)

        val shippingAddress = address?.let(::convertBodyToAddress)
        val orderAttributes = attributes?.map(::convertBodyToAttribute)

        return@run Order(
            id,
            orderId,
            name,
            orderStatus,
            amount,
            shippingAmount,
            totalAmount,
            eosName,
            orderCurrency,
            expiryDate,
            link,
            shippingAddress,
            transactionId,
            confirmAmountUrl,
            fullName,
            phone,
            photos,
            orderAttributes,
            trackingNumber
        )

    }

    fun convertBodyToOrdersPage(ordersPageResponseBody: OrdersPageResponseBody): OrdersPage
        = ordersPageResponseBody.run {
            val paginationDetails = convertBodyToPagination(pagination)
            val ordersList = orders.map(::convertBodyToOrder)

            return@run OrdersPage(
                paginationDetails,
                ordersList
            )
        }

    fun convertAttributeToBody(attribute: Attribute) = attribute.run {
        AttributeBody(name, value)
    }

    fun convertMessageEntityToBody(messageEntity: MessageEntity) = messageEntity.run {
        MessageEntityBody(type, offset, length, url)
    }

    fun convertBodyToError(errorResponseBody: ErrorResponseBody): Error
            = errorResponseBody.run {
        Error(
            error,
            statusCode,
            message.toString()
        )
    }

    private fun convertBodyToAttribute(attributeBody: AttributeBody) = attributeBody.run {
        Attribute(name, value)
    }

    private fun convertParameterToOrderCurrency(currency: String): Order.Currency
        = when(currency) {
            ETH_CURRENCY_PARAMETER -> Order.Currency.ETH
            BTC_CURRENCY_PARAMETER -> Order.Currency.BTC
            USDT_CURRENCY_PARAMETER -> Order.Currency.USDT
            EURT_CURRENCY_PARAMETER -> Order.Currency.EURT
            CNHT_CURRENCY_PARAMETER -> Order.Currency.CNHT
            XAUT_CURRENCY_PARAMETER -> Order.Currency.XAUT
            USD_CURRENCY_PARAMETER -> Order.Currency.USD
            EUR_CURRENCY_PARAMETER -> Order.Currency.EUR
            CNY_CURRENCY_PARAMETER -> Order.Currency.CNY
            else -> throw IllegalArgumentException("unknown order currency: $currency")
        }

    private fun convertParameterToOrderStatus(status: String): Order.Status
        = when(status) {
            ORDER_STATUS_RECEIVED_PARAMETER -> Order.Status.RECEIVED
            ORDER_STATUS_ADDRESS_CONFIRMED_PARAMETER -> Order.Status.ADDRESS_CONFIRMED
            ORDER_STATUS_CONFIRMED_PARAMETER -> Order.Status.CONFIRMED
            ORDER_STATUS_CREATED_PARAMETER -> Order.Status.CREATED
            ORDER_STATUS_DELIVERED_PARAMETER -> Order.Status.DELIVERED
            ORDER_STATUS_DISPUTED_PARAMTER -> Order.Status.DISPUTED
            ORDER_STATUS_EXPIRED_PARAMETER -> Order.Status.EXPIRED
            else -> throw IllegalArgumentException("Unknown order status: $status")
        }

    private fun convertBodyToPagination(paginationResponseBody: PaginationResponseBody): Pagination
        = paginationResponseBody.run {
            return@run Pagination(
                offset,
                count,
                total,
                prev,
                next
            )
        }

    private fun convertBodyToAddress(addressResponseBody: AddressResponseBody): Address
        = addressResponseBody.run {
            val location = geo?.let(::convertBodyToLocation)

            return@run Address(
                id,
                address,
                city,
                region,
                country,
                postal,
                location,
                comment
            )
        }

    private fun convertBodyToLocation(geoResponseBody: GeoResponseBody): Location
        = geoResponseBody.run {
            return@run Location(lat, lon)
        }

}