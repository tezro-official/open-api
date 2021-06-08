package com.tezro.api.shop.client.core.client.interceptor

import com.tezro.api.shop.client.core.ShopHttpData
import okhttp3.Interceptor
import okhttp3.Response

internal class ShopAuthInterceptor(
        private val keyId: String
) : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val currentTime = System.currentTimeMillis().toString()

        val newRequest = original.newBuilder()
            .header(ShopHttpData.KEY_ID_HEADER, keyId)
            .header(ShopHttpData.TIMESTAM_HEADER, currentTime)
            .method(original.method(), original.body())
            .build()

        return chain.proceed(newRequest)
    }

}