package com.tezro.api.core.client


/**
 * Delegate of the a request.
 *
 * @see Request.setSuccessListener
 * @see Request.setErrorListener
 * @see Request.enqueue
 * @see Error
 */
interface Request<T> {

    /**
     * Sets the current listener that will be invoked in case of a successful request.
     *
     * @param successListener Block of code that will be invoked in case of a success returning
     * a response
     */
    fun setSuccessListener(successListener: ((T) -> Unit)?): Request<T>


    /**
     * Sets the current listener that will be invoked in case of an error.
     *
     * @param errorListener Block of code that will be invoked in case of an error return error
     * body
     *
     * @see Error
     */
    fun setErrorListener(errorListener: ((Error) -> Unit)?): Request<T>


    /**
     * Enqueues the current request in the requests queue to be executed
     */
    fun enqueue()

}