package com.tezro.api.shop.client.core

import com.tezro.api.core.cryption.CryptoUtils
import okhttp3.Interceptor
import okhttp3.Response

internal class ShopAuthInterceptor(
        private val keyId: String,
        secret: String
) : Interceptor{

    private val macAlgorithm by lazy {
        CryptoUtils.createHMACInstance(secret, ShopHttpData.ALGORITHM_NAME)
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()

        val currentTime = System.currentTimeMillis().toString()
        val endpoint = original.url().encodedPath()

        val body = original.body()
        val buffer = okio.Buffer()
        body?.writeTo(buffer)
        val bodyJsonString = buffer.readUtf8()

        val data = StringBuilder().append(
                currentTime,
                endpoint,
                bodyJsonString
        ).toString()

        val signature = CryptoUtils.calculateHexHMAC(
                data,
                macAlgorithm
        )

        val newRequest = original.newBuilder()
            .header(ShopHttpData.KEY_ID_HEADER, keyId)
            .header(ShopHttpData.ALGORITHM_HEADER, ShopHttpData.ALGORITHM_NAME)
            .header(ShopHttpData.SIGNATURE_HEADER, signature)
            .header(ShopHttpData.TIMESTAM_HEADER, currentTime)
            .method(original.method(), original.body())
            .build()

        return chain.proceed(newRequest)
    }

}