package com.tezro.api.shop.client.core.service

import com.google.gson.Gson
import com.tezro.api.core.client.requests.IRequest
import com.tezro.api.core.client.requests.IRequestDelegate
import com.tezro.api.core.client.requests.Request
import com.tezro.api.shop.client.data.responses.ErrorResponseBody
import com.tezro.api.shop.service.ShopData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.tezro.api.shop.model.common.Error


abstract class RetrofitService  {

    protected open fun <T, R> Call<T>.toServiceRequest(converter: (T) -> R): IRequest<R, Error> {
        val request = Request<R, Error>()

        return request.setCancelBlock(this::cancel).setEnqueueBlock {
            val callback = createCallback(request, converter)
            enqueue(callback)
        }
    }

    protected open fun <T, R> createCallback(
        requestDelegate: IRequestDelegate<R, Error>,
        converter: (T) -> R
    ): Callback<T> = object : Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            val responseBody = response.body()

            if (responseBody == null) {
                val errorBody = response.errorBody()

                val error = if (errorBody != null) {
                    val errorJson = errorBody.string()
                    val errorBody = Gson().fromJson(errorJson, ErrorResponseBody::class.java)
                    ShopData.convertBodyToError(errorBody)
                } else {
                    Error(DEFAULT_ERROR_MESSAGE, response.code(), DEFAULT_ERROR_MESSAGE)
                }

                requestDelegate.notifyError(error)
                return
            }

            val result = converter.invoke(responseBody)
            requestDelegate.notifySuccess(result)
        }

        override fun onFailure(call: Call<T>, t: Throwable) {
            val error = Error(DEFAULT_ERROR_MESSAGE, DEFAULT_ERROR_CODE, DEFAULT_ERROR_MESSAGE)
            requestDelegate.notifyError(error)
        }
    }

    companion object {
        const val DEFAULT_ERROR_MESSAGE = "UNKNOWN_ERROR"
        const val DEFAULT_ERROR_CODE = -1
    }

}