---
title: MessageEntity
---
//[shop](../../../index.html)/[com.tezro.api.shop.model.messages](../index.html)/[MessageEntity](index.html)



# MessageEntity



[jvm]\
data class [MessageEntity](index.html)(val type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Used for making part of text as clickable url link.



## Parameters


jvm

| | |
|---|---|
| type | Type of message entity. Must be one of: text_url |
| offset | Start position of clickable text. Must be in range of 0-4090 inclusively |
| length | Length of clickable text. Length must be in range of 1-4096 Yes symbols inclusively |
| url | Link that opens by clicking text. Must be valid URL |



## Constructors


| | |
|---|---|
| [MessageEntity](-message-entity.html) | [jvm]<br>fun [MessageEntity](-message-entity.html)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [length](length.html) | [jvm]<br>val [length](length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [offset](offset.html) | [jvm]<br>val [offset](offset.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [type](type.html) | [jvm]<br>val [type](type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [url](url.html) | [jvm]<br>val [url](url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

