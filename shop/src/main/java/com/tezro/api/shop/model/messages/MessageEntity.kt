package com.tezro.api.shop.model.messages

/**
 * Used for making part of text as clickable url link.
 *
 * @param type Type of message entity. Must be one of: text_url
 * @param offset Start position of clickable text. Must be in range of 0-4090 inclusively
 * @param length Length of clickable text. Length must be in range of 1-4096 Yes symbols inclusively
 * @param url Link that opens by clicking text. Must be valid URL
 */
data class MessageEntity(
    val type: String,
    val offset: Int,
    val length: Int,
    val url: String
)