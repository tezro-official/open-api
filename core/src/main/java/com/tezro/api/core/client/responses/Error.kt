package com.tezro.api.core.client.responses


/**
 * Contains details about a response error. This error can be thrown as an exception.
 *
 * @param message Error message returned by the server
 * @param statusCode Status code of the response
 *
 * @see Throwable
 */
data class Error(
    val error: String,
    val statusCode: Int,
    val message: Any
)