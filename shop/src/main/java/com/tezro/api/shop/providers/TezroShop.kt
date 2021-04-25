package com.tezro.api.shop.providers

import com.tezro.api.shop.service.IShopService
import kotlin.properties.Delegates

object TezroShop {

    internal lateinit var appId: String
    internal lateinit var keyId: String
    internal lateinit var secret: String
    internal lateinit var eosAccount: String
    internal var isTestMode: Boolean by Delegates.notNull()

    fun init(
        appId: String,
        keyId: String,
        secret: String,
        eosAccount: String,
        isTest: Boolean
    ) {
        TezroShop.appId = appId
        TezroShop.keyId = keyId
        TezroShop.secret = secret
        TezroShop.eosAccount = eosAccount
        isTestMode = isTest
    }

    fun createShopService(): IShopService
        = ServiceProviders.provideNewShopService()

}