package com.tezro.api.core.client.requests

import com.tezro.api.core.client.responses.Error

class Request<T> : IRequest<T>, IRequestDelegate<T> {

    private var successListener: ((T) -> Unit)? = null
    private var errorListener: ((Error) -> Unit)? = null
    private lateinit var enqueueBlock: () -> Unit
    private lateinit var cancelBlock: () -> Unit

    override fun setSuccessListener(successListener: ((T) -> Unit)?): IRequest<T> = this.apply {
        this.successListener = successListener
    }

    override fun setErrorListener(errorListener: ((Error) -> Unit)?): IRequest<T> = this.apply {
        this.errorListener = errorListener
    }

    override fun enqueue() {
        enqueueBlock.invoke()
    }

    override fun cancel() {
        cancelBlock.invoke()
    }

    override fun notifySuccess(response: T) {
        successListener?.invoke(response)
    }

    override fun notifyError(error: Error) {
        errorListener?.invoke(error)
    }

    override fun setEnqueueBlock(enqueueBlock: () -> Unit) = this.apply {
        this.enqueueBlock = enqueueBlock
    }

    override fun setCancelBlock(cancelBlock: () -> Unit) = this.apply {
        this.cancelBlock = cancelBlock
    }

}