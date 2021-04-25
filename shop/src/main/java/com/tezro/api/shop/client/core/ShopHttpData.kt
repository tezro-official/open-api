package com.tezro.api.shop.client.core

internal object ShopHttpData {

    const val TEST_URL = "https://test.openapi.tezro.com/api/v1/"
    const val PRODUCTION_URL = "https://openapi.tezro.com/api/v1/"

    const val ID_PATH = "id"
    const val EOS_NAME_PATH = "eosName"

    const val ORDER_MESSAGES_PATH = "messages/{$ID_PATH}"
    const val CONFIRM_DELIVERY_PATH = "orders/{$ID_PATH}/confirmDelivery"
    const val ORDERS_PATH = "orders"
    const val ORDER_PATH = "orders/{$EOS_NAME_PATH}/{$ID_PATH}"
}