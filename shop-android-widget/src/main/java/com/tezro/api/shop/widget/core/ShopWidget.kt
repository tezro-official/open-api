package com.tezro.api.shop.widget.core

import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Error
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.providers.Shop
import com.tezro.api.shop.service.IShopService
import java.util.*
import kotlin.properties.Delegates


/**
 * A helper that's used to manage orders.
 *
 * @see createOrder
 * @see getOrder
 */
object ShopWidget {


    /**
     * Shop's Key ID, must be retrieved from Tezro app.
     */
    private lateinit var keyId: String


    /**
     * Indicates where to use test or production API.
     */
    private var isTestMode: Boolean by Delegates.notNull()


    /**
     * Service that's used to make request to Tezro Open-API.
     */
    private val shopService: IShopService by lazy {
        requireInitialization()
        Shop.initShopService(keyId, secret = null, isTestMode)
    }


    /**
     * Must be called before requests through this helper.
     *
     * @param keyId Shop's Key ID, must be retrieved from Tezro app
     * @param isTestMode Indicates where to use test or production API
     */
    @JvmStatic
    fun init(keyId: String, isTestMode: Boolean) {
        ShopWidget.keyId = keyId
        ShopWidget.isTestMode = isTestMode
    }


    /**
     * Used to get information about an already existing order.
     *
     * @param orderId The id of the order that must be requested
     * @return Returns the request order
     *
     * @throws IllegalStateException if the init method was not called
     */
    @JvmStatic
    fun getOrder(orderId: String): IRequest<Order, Error>
        = shopService.getOrder(orderId)


    /**
     * Uses to create a new order with the provided data.
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
     * @see Attribute
     * @see Order
     *
     * @throws IllegalStateException if the init method was not called
     */
    @JvmStatic
    fun createOrder(
        orderId: String,
        name: String,
        amount: String,
        currency: Order.Currency,
        confirmAmountUrl: String,
        expiryDate: Date,
        photos: List<String>? = null,
        attributes: List<Attribute>? = null
    ): IRequest<Order, Error> = shopService.createOrder(
        orderId,
        name,
        amount,
        currency,
        confirmAmountUrl,
        expiryDate,
        photos,
        attributes
    )


    /**
     * Asserts that init method was called.
     * @throws IllegalStateException if the init method was not called
     */
    private fun requireInitialization() {
        if (ShopWidget::keyId.isInitialized) return

        throw IllegalStateException(
            """
            You must call ShopWidget.init(...) method before using any functionality provided by
            this class. One call to the method is enough during the lifetime of the app.
            """.trimIndent()
        )
    }

}