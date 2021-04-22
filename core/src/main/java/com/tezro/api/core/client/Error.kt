package com.tezro.api.core.client


/**
 * Contains details about a response error. This error can be thrown as an exception.
 *
 * @param message Error message returned by the server
 * @param errorCode Status code of the response
 *
 * @see Throwable
 * @see Request
 */
class Error(
    override val message: String,
    val errorCode: String
) : Throwable()