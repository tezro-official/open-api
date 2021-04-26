package com.tezro.api.shop.providers

import com.tezro.api.shop.service.IShopService
import java.lang.IllegalStateException
import kotlin.properties.Delegates

object TezroShop {

    fun initShopService(
        appId: String,
        keyId: String,
        secret: String,
        eosAccount: String,
        isTestMode: Boolean
    ): IShopService = ServiceProviders.provideNewShopService(
        appId,
        keyId,
        secret,
        eosAccount,
        isTestMode
    )

}