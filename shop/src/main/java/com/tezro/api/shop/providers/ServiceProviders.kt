package com.tezro.api.shop.providers

import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.core.ShopHttpData
import com.tezro.api.shop.service.IShopService
import com.tezro.api.shop.service.ShopService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object ServiceProviders {

    fun provideNewShopService(): IShopService {
        val retrofit = provideNewRetrofit()
        val shopHttpClient = retrofit.create(IShopHttpClient::class.java)
        return ShopService(shopHttpClient)
    }

    private fun provideNewRetrofit(): Retrofit {
        val baseUrl = if (TezroShop.isTestMode) ShopHttpData.TEST_URL
        else ShopHttpData.PRODUCTION_URL

        val gsonConverterFactory = GsonConverterFactory.create()
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

}