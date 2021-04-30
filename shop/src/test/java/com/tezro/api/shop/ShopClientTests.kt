package com.tezro.api.shop

import com.google.gson.Gson
import com.tezro.api.core.client.responses.Error
import com.tezro.api.shop.client.core.IShopHttpClient
import com.tezro.api.shop.client.core.ShopAuthInterceptor
import com.tezro.api.shop.client.data.requests.ConfirmDeliveryRequestBody
import com.tezro.api.shop.client.data.requests.InitOrderRequestBody
import com.tezro.api.shop.client.data.requests.SendMessageRequestBody
import com.tezro.api.shop.providers.ServiceProviders
import com.tezro.api.shop.service.ShopData
import okhttp3.OkHttpClient
import org.junit.Test
import java.net.HttpURLConnection


internal class ShopClientTests {

    private val shopClient by lazy {
        val authenticationInterceptor = ShopAuthInterceptor(
                "47d5af68-0857-4856-a072-63fa53ea87f2",
                "fv0p/ss/YA4/SKV4k9JVJClND1uIRYi+lRwqMMbeRxE4f+4K3R0PzRVt0STXMWQWP/KhhzQ=="
        )

        val okHttpClient = OkHttpClient.Builder().addInterceptor(authenticationInterceptor).build()

        val retrofit = ServiceProviders.provideNewRetrofit(true, okHttpClient)

        retrofit.create(IShopHttpClient::class.java)
    }



    @Test
    fun testAuth() {
        val response = shopClient.getOrders(HashMap()).execute()

        println(response)
        assert(response.code() == HttpURLConnection.HTTP_OK)
    }


    @Test
    fun initOrder() {
        val orderBody = InitOrderRequestBody(
                "ssss",
                "12",
                "USD",
                "https://www.google.com",
                null
        )

        val response = shopClient.initOrder(orderBody).execute()
        val responseBody = response.body()
        val actualBody = responseBody?.let(ShopData::convertBodyToOrder)

        val errorJson = response.errorBody()?.string()
        val error = Gson().fromJson(errorJson, Error::class.java)

        println(response)
        println(actualBody)
        println(errorJson)
        println(error)

        assert(response.code() == HttpURLConnection.HTTP_OK)
    }


    @Test
    fun getOrder() {
        val response = shopClient.getOrder("ssss").execute()

        val responseBody = response.body()
        val actualBody = responseBody?.let(ShopData::convertBodyToOrder)


        val errorJson = response.errorBody()?.string()
        val error = Gson().fromJson(errorJson, Error::class.java)

        println(response)
        println(actualBody)
        println(errorJson)
        println(error)

        assert(response.code() == HttpURLConnection.HTTP_OK)
    }

    @Test
    fun getOrders() {
        val response = shopClient.getOrders(HashMap()).execute()
        val responseBody = response.body()
        val actualBody = responseBody?.let(ShopData::convertBodyToOrdersPage)

        val errorJson = response.errorBody()?.string()
        val error = Gson().fromJson(errorJson, Error::class.java)

        println(response)
        println(actualBody)
        println(errorJson)
        println(error)

        assert(response.code() == HttpURLConnection.HTTP_OK)
    }

    @Test
    fun sendMessageToCustomer() {
        val sendMessageBody = SendMessageRequestBody("Hi dear customer!")
        val response = shopClient.sendMessage(
                "ss22ss",
                sendMessageBody
        ).execute()

        val responseBody = response.body()

        val errorJson = response.errorBody()?.string()
        val error = Gson().fromJson(errorJson, Error::class.java)

        println(response)
        println(responseBody)
        println(errorJson)
        println(error)

        assert(response.code() == HttpURLConnection.HTTP_OK)
    }


    @Test
    fun confirmOrderDelivery() {
        val sendMessageBody = ConfirmDeliveryRequestBody("Thanks for payment!")
        val response = shopClient.confirmDelivery(
                "ssss",
                sendMessageBody,
        ).execute()

        val responseBody = response.body()

        val errorJson = response.errorBody()?.string()
        val error = Gson().fromJson(errorJson, Error::class.java)

        println(response)
        println(responseBody)
        println(errorJson)
        println(error)

        assert(response.code() == HttpURLConnection.HTTP_CREATED)
    }

    @Test
    fun testDDOS() {
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()
        shopClient.getOrder("ssss").execute()

        val response = shopClient.getOrder("ssss").execute()

        val responseBody = response.body()
        val actualBody = responseBody?.let(ShopData::convertBodyToOrder)


        println(response)
        println(responseBody)
        println(actualBody)

        assert(response.code() == HttpURLConnection.HTTP_OK)
    }


}