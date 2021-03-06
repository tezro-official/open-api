package com.tezro.api.shop.client.core

internal object ShopHttpData {

    const val DOMAIN = "openapi.tezro.com"
    const val TEST_URL = "https://dev-$DOMAIN/"
    const val PRODUCTION_URL = "https://$DOMAIN/"
    const val API_VERSION = "v1"

    const val ALGORITHM_NAME = "sha512"

    const val TIMESTAM_HEADER = "Timestamp"
    const val KEY_ID_HEADER = "KeyID"
    const val SIGNATURE_HEADER = "X-Tezro-Signature"
    const val ALGORITHM_HEADER = "Algorithm"

    const val ID_PATH = "id"

    const val API_PATH = "api/$API_VERSION"
    const val ORDER_MESSAGES_PATH = "$API_PATH/messages/{$ID_PATH}"
    const val ORDERS_PATH = "$API_PATH/orders"
    const val ORDER_INIT_PATH = "$ORDERS_PATH/init"
    const val ORDER_PATH = "$ORDERS_PATH/{$ID_PATH}"

    const val ORDER_SET_STATUS_PATH = "$ORDER_PATH/setStatus"
}