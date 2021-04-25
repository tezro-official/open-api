package com.tezro.api.shop.service

import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.core.service.RetrofitService
import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.data.requests.ConfirmDeliveryRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.model.Pagination
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.model.orders.OrdersPage

internal class ShopService (
    private val shopHttpClient: IShopHttpClient
) : RetrofitService(), IShopService {

    override fun sendMessage(orderId: String, message: String): IRequest<Void> {
        val sendMessageBody = SendMessageRequestBody(message)
        val call = shopHttpClient.sendMessage(orderId, sendMessageBody)
        return call.toServiceRequest { it }
    }

    override fun confirmDelivery(orderId: String, comment: String?): IRequest<Void> {
        val confirmDeliveryBody = ConfirmDeliveryRequestBody(comment)
        val call = shopHttpClient.confirmDelivery(orderId, confirmDeliveryBody)
        return call.toServiceRequest { it }
    }

    override fun getOrders(
            offset: Long?,
            limit: Long?,
            direction: Pagination.Direction?,
            status: Order.Status?
    ): IRequest<OrdersPage> {
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

    override fun getOrder(eosName: String, orderId: String): IRequest<Order> {
        val call = shopHttpClient.getOrder(eosName, orderId)
        return call.toServiceRequest(ShopData::convertBodyToOrder)
    }


}