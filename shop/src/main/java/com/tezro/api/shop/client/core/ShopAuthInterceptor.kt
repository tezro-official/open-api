package com.tezro.api.shop.client.core

import okhttp3.Interceptor
import okhttp3.Response

internal class ShopAuthInterceptor(
    private val appId: String,
    private val keyId: String,
    private val secret: String
) : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()

        val newRequest = original.newBuilder()
            .header(ShopHttpData.APP_ID_HEADER, appId)
            .header(ShopHttpData.KEY_ID_HEADER, keyId)
            .header(ShopHttpData.SIGNATURE_HEADER, secret)
            .method(original.method(), original.body())
            .build()

        return chain.proceed(newRequest)
    }

}