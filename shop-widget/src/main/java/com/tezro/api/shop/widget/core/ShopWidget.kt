package com.tezro.api.shop.widget.core

import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.providers.Shop
import com.tezro.api.shop.service.IShopService
import java.util.*
import kotlin.properties.Delegates


object ShopWidget {

    private lateinit var keyId: String
    private var isTestMode: Boolean by Delegates.notNull()

    private val shopService: IShopService by lazy {
        requireInitialization()
        Shop.initShopService(keyId, secret = null, isTestMode)
    }

    fun init(keyId: String, isTestMode: Boolean) {
        ShopWidget.keyId = keyId
        ShopWidget.isTestMode = isTestMode
    }

    fun getOrder(orderId: String): IRequest<Order> {
        return shopService.getOrder(orderId)
    }

    fun createOrder(
        orderId: String,
        amount: String,
        currency: Order.Currency,
        confirmAmountUrl: String,
        expiryDate: Date? = null
    ): IRequest<Order> {
        return shopService.createOrder(orderId, amount, currency, confirmAmountUrl, expiryDate)
    }

    private fun requireInitialization() {
        if (ShopWidget::keyId.isInitialized) return

        throw IllegalStateException(
            """
            You must call ShopWidget.init(...) method before using any functionality provided by
            this class.
            """.trimIndent()
        )

    }

}