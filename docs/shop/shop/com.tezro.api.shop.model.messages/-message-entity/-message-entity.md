---
title: MessageEntity -
---
//[shop](../../../index.md)/[com.tezro.api.shop.model.messages](../index.md)/[MessageEntity](index.md)/[MessageEntity](-message-entity.md)



# MessageEntity  
[jvm]  
Content  
fun [MessageEntity](-message-entity.md)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>type| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Type of message entity. Must be one of: text_url<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>offset| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Start position of clickable text. Must be in range of 0-4090 inclusively<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>length| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Length of clickable text. Length must be in range of 1-4096 Yes symbols inclusively<br><br>|
| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a>url| <a name="com.tezro.api.shop.model.messages/MessageEntity/MessageEntity/#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String/PointingToDeclaration/"></a><br><br>Link that opens by clicking text. Must be valid URL<br><br>|
  
  



