package com.tezro.api.shop.client.core.client.requests

class Request<T, R> : IRequest<T, R>, IRequestDelegate<T, R> {

    private var successListener: ((T) -> Unit)? = null
    private var errorListener: ((R) -> Unit)? = null
    private lateinit var enqueueBlock: () -> Unit
    private lateinit var cancelBlock: () -> Unit

    override fun setSuccessListener(successListener: ((T) -> Unit)?): IRequest<T, R> = this.apply {
        this.successListener = successListener
    }

    override fun setErrorListener(errorListener: ((R) -> Unit)?): IRequest<T, R> = this.apply {
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

    override fun notifyError(error: R) {
        errorListener?.invoke(error)
    }

    override fun setEnqueueBlock(enqueueBlock: () -> Unit) = this.apply {
        this.enqueueBlock = enqueueBlock
    }

    override fun setCancelBlock(cancelBlock: () -> Unit) = this.apply {
        this.cancelBlock = cancelBlock
    }

}