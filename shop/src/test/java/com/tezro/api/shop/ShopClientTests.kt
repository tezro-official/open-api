package com.tezro.api.shop

import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.core.ShopAuthInterceptor
import com.tezro.api.shop.providers.ServiceProviders
import okhttp3.OkHttpClient
import org.junit.Test
import java.net.HttpURLConnection


internal class ShopClientTests {

    @Test
    fun testAuth() {
        val authenticationInterceptor = ShopAuthInterceptor(
            "19b85f50-338f-4078-bd1e-ccdcb8fc2752",
            "47d5af68-0857-4856-a072-63fa53ea87f2",
            "fv0p/quJOqmzrRTuUawG6j/YA4/SKV4k9JVJClND1uIRYi+lRwqMMbeRxE4f+4K3R0PzRVt0STXMWQWP/KhhzQ=="
        )

        val okHttpClient = OkHttpClient.Builder().addInterceptor(authenticationInterceptor).build()

        val retrofit = ServiceProviders.provideNewRetrofit(true, okHttpClient)

        val shopClient = retrofit.create(IShopHttpClient::class.java)
        val response = shopClient.getOrders(HashMap()).execute()
        print(response)
        assert(response.code() == HttpURLConnection.HTTP_UNAUTHORIZED)
    }


    @Test
    fun initOrder() {

    }


    @Test
    fun getOrder() {

    }


    @Test
    fun sendMessageToCustomer() {

    }


    @Test
    fun confirmOrderDelivery() {

    }


}