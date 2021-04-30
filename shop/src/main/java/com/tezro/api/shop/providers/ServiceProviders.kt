package com.tezro.api.shop.providers

import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.core.interceptor.ShopSecretAuthInterceptor
import com.tezro.api.shop.client.core.ShopHttpData
import com.tezro.api.shop.client.core.interceptor.ShopAuthInterceptor
import com.tezro.api.shop.service.IShopService
import com.tezro.api.shop.service.ShopService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object ServiceProviders {

    internal fun provideNewShopService(
        keyId: String,
        secret: String?,
        isTestMode: Boolean
    ): IShopService {
        val authenticationInterceptor = this.provideAuthInterceptor(keyId, secret)

        val okHttpClient = OkHttpClient.Builder().addInterceptor(authenticationInterceptor).build()

        val retrofit = provideNewRetrofit(isTestMode, okHttpClient)

        val shopHttpClient = retrofit.create(IShopHttpClient::class.java)
        return ShopService(shopHttpClient)
    }

    internal fun provideNewRetrofit(isTestMode: Boolean, client: OkHttpClient): Retrofit {
        val baseUrl = if (isTestMode) ShopHttpData.TEST_URL
        else ShopHttpData.PRODUCTION_URL

        val gsonConverterFactory = GsonConverterFactory.create()
        return Retrofit.Builder().baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    internal fun provideAuthInterceptor(keyId: String, secret: String?): Interceptor
        = if (!secret.isNullOrBlank()) ShopSecretAuthInterceptor(keyId, secret)
        else ShopAuthInterceptor(keyId)

}