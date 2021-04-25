package com.tezro.api.core.client.responses


/**
 * Contains details about a response.
 *
 * @param statusCode Status code of the response.
 * @param message A message returned by the server.
 */
class SimpleResponse(
    val statusCode: Int,
    val message: String
)