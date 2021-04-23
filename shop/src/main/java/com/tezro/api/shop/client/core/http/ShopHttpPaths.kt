package com.tezro.api.shop.client.core.http

internal object ShopHttpPaths {

    const val ID_PATH = "id"
    const val EOS_NAME_PATH = "eosName"

    const val ORDER_MESSAGES_PATH = "messages/{$ID_PATH}"
    const val CONFIRM_DELIVERY_PATH = "orders/{$ID_PATH}/confirmDelivery"
    const val ORDERS_PATH = "orders"
    const val ORDER_PATH = "orders/{$EOS_NAME_PATH}/{$ID_PATH}"

}