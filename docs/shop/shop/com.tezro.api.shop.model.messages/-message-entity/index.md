---
title: MessageEntity -
---
//[shop](../../../index.md)/[com.tezro.api.shop.model.messages](../index.md)/[MessageEntity](index.md)



# MessageEntity  
 [jvm] data class [MessageEntity](index.md)(**type**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **offset**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **length**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Used for making part of text as clickable url link.

   


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a>type| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a><br><br>Type of message entity. Must be one of: text_url<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a>offset| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a><br><br>Start position of clickable text. Must be in range of 0-4090 inclusively<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a>length| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a><br><br>Length of clickable text. Length must be in range of 1-4096 Yes symbols inclusively<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a>url| <a name="com.tezro.api.shop.model.messages/MessageEntity///PointingToDeclaration/"></a><br><br>Link that opens by clicking text. Must be valid URL<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>[MessageEntity](-message-entity.md)| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a> [jvm] fun [MessageEntity](-message-entity.md)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))Type of message entity.   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/length/#/PointingToDeclaration/"></a>[length](length.md)| <a name="com.tezro.api.shop.model.messages/MessageEntity/length/#/PointingToDeclaration/"></a> [jvm] val [length](length.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Length of clickable text.   <br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/offset/#/PointingToDeclaration/"></a>[offset](offset.md)| <a name="com.tezro.api.shop.model.messages/MessageEntity/offset/#/PointingToDeclaration/"></a> [jvm] val [offset](offset.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Start position of clickable text.   <br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/type/#/PointingToDeclaration/"></a>[type](type.md)| <a name="com.tezro.api.shop.model.messages/MessageEntity/type/#/PointingToDeclaration/"></a> [jvm] val [type](type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Type of message entity.   <br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/url/#/PointingToDeclaration/"></a>[url](url.md)| <a name="com.tezro.api.shop.model.messages/MessageEntity/url/#/PointingToDeclaration/"></a> [jvm] val [url](url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Link that opens by clicking text.   <br>|

