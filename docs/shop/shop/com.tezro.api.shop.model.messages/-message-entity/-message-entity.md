---
title: MessageEntity
---
//[shop](../../../index.html)/[com.tezro.api.shop.model.messages](../index.html)/[MessageEntity](index.html)/[MessageEntity](-message-entity.html)



# MessageEntity



[jvm]\
fun [MessageEntity](-message-entity.html)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Parameters


jvm

| | |
|---|---|
| type | Type of message entity. Must be one of: text_url |
| offset | Start position of clickable text. Must be in range of 0-4090 inclusively |
| length | Length of clickable text. Length must be in range of 1-4096 Yes symbols inclusively |
| url | Link that opens by clicking text. Must be valid URL |




