---
title: sendMessage -
---
//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[sendMessage](send-message.md)



# sendMessage  
[jvm]  
Content  
abstract fun [sendMessage](send-message.md)(externalOrderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), entities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MessageEntity](../../com.tezro.api.shop.model.messages/-message-entity/index.md)>?): [IRequest](../../com.tezro.api.core.client.requests/-i-request/index.md)<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.md)>  
More info  


Sends message to customer that created a specific order. Should be used when order's status is one of: confirmed, delivered, disputed.



#### Return  


Nothing special, just void;)



## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/external-id.md)| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a>externalOrderId| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a><br><br>Order's id to which messages should be sent. Make sure to use order's external id rather than internal<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a>message| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a><br><br>Message body<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a>entities| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String#kotlin.collections.List[com.tezro.api.shop.model.messages.MessageEntity]?/PointingToDeclaration/"></a><br><br>Used for making part of text as clickable url link<br><br>|
  
  



