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
        isTestMode: Boolean
    ) {
        this.appId = appId
        this.keyId = keyId
        this.secret = secret
        this.eosAccount = eosAccount
        this.isTestMode = isTestMode
    }

    fun createShopService(): IShopService
        = ServiceProviders.provideNewShopService()

}