package com.tezro.api.core.client.requests

/**
 * Delegate of the a request.
 *
 * @see IRequest.setSuccessListener
 * @see IRequest.setErrorListener
 * @see IRequest.enqueue
 * @see Error
 */
interface IRequest<T, R> {

    /**
     * Sets the current listener that will be invoked in case of a successful request.
     *
     * @param successListener Block of code that will be invoked in case of a success returning
     * a response
     */
    fun setSuccessListener(successListener: ((T) -> Unit)?): IRequest<T, R>


    /**
     * Sets the current listener that will be invoked in case of an error.
     *
     * @param errorListener Block of code that will be invoked in case of an error return error
     * body
     *
     * @see Error
     */
    fun setErrorListener(errorListener: ((R) -> Unit)?): IRequest<T, R>


    /**
     * Enqueues the current request in the requests queue to be executed.
     */
    fun enqueue()


    /**
     * Cancels the current request and removes it from requests queue.
     */
    fun cancel()

}