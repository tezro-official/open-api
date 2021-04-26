package com.tezro.api.shop.client.core

internal object ShopHttpData {

    const val TEST_URL = "https://test.openapi.tezro.com/api/v1/"
    const val PRODUCTION_URL = "https://openapi.tezro.com/api/v1/"

    const val APP_ID_HEADER = "AppID"
    const val KEY_ID_HEADER = "KeyID"
    const val SIGNATURE_HEADER = "X-Tezro-Signature"

    const val ID_PATH = "id"
    const val EOS_NAME_PATH = "eosName"

    const val ORDER_MESSAGES_PATH = "messages/{$ID_PATH}"


    const val ORDERS_PATH = "orders"
    const val INIT_ORDER_PATH = "$ORDERS_PATH/init"
    const val CONFIRM_DELIVERY_PATH = "$ORDERS_PATH/{$ID_PATH}/confirmDelivery"
    const val ORDER_PATH = "$ORDERS_PATH/{$EOS_NAME_PATH}/{$ID_PATH}"


}