package com.tezro.api.shop.service

import com.tezro.api.shop.client.data.responses.*
import com.tezro.api.shop.client.data.responses.AddressResponseBody
import com.tezro.api.shop.client.data.responses.GeoResponseBody
import com.tezro.api.shop.client.data.responses.OrderResponseBody
import com.tezro.api.shop.client.data.responses.OrdersPageResponseBody
import com.tezro.api.shop.client.data.responses.PaginationResponseBody
import com.tezro.api.shop.model.Pagination
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage
import com.tezro.api.shop.model.orders.address.Address
import com.tezro.api.shop.model.orders.address.Location
import java.lang.IllegalArgumentException
import java.text.SimpleDateFormat
import java.util.*

internal object ShopData {

    const val OFFSET_PARAMETER_NAME = "offset"
    const val LIMIT_PARAMETER_NAME = "limit"
    const val DIRECTION_PARAMETER_NAME = "sort"
    const val STATUS_PARAMETER_NAME = "status"

    const val DIRECTION_ASCENDING_PARAMETER = 1
    const val DIRECTION_DESCENDING_PARAMETER = -1

    const val ORDER_STATUS_RECEIVED_PARAMETER = "order_received"
    const val ORDER_STATUS_ADDRESS_CONFIRMED_PARAMETER = "address_confirmed"
    const val ORDER_STATUS_CONFIRMED_PARAMETER = "order_confirmed"
    const val ORDER_STATUS_CREATED_PARAMETER = "order_created"
    const val ORDER_STATUS_DELIVERED_PARAMETER = "order_delivered"
    const val ORDER_STATUS_DISPUTED_PARAMTER = "order_disputed"
    const val ORDER_STATUS_EXPIRED_PARAMETER = "order_expired"

    const val ETH_CURRENCY_PARAMETER = "ETH"
    const val BTC_CURRENCY_PARAMETER = "BTC"
    const val USDT_CURRENCY_PARAMETER = "USDT"
    const val EURT_CURRENCY_PARAMETER = "EURT"
    const val CNHT_CURRENCY_PARAMETER = "CNHT"
    const val XAUT_CURRENCY_PARAMETER = "XAUT"
    const val USD_CURRENCY_PARAMETER = "USD"
    const val EUR_CURRENCY_PARAMETER = "EUR"
    const val CNY_CURRENCY_PARAMETER = "CNY"

    const val DEFAULT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

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

    fun convertParameterToOrderStatus(status: String): Order.Status
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

    fun convertDirectionToParameter(direction: Pagination.Direction): Int
            = if (direction == Pagination.Direction.ASCENDING) {
                DIRECTION_ASCENDING_PARAMETER
            } else {
                DIRECTION_DESCENDING_PARAMETER
            }

    fun convertParameterToOrderCurrency(currency: String): Order.Currency
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

        return@run Order(
            orderId,
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
            phone
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

    fun convertBodyToPagination(paginationResponseBody: PaginationResponseBody): Pagination
        = paginationResponseBody.run {
            return@run Pagination(
                offset,
                count,
                total,
                prev,
                next
            )
        }

    fun convertBodyToAddress(addressResponseBody: AddressResponseBody): Address
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

    fun convertBodyToLocation(geoResponseBody: GeoResponseBody): Location
        = geoResponseBody.run {
            return@run Location(lat, lon)
        }

}