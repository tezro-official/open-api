---
title: sendMessage
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[sendMessage](send-message.html)



# sendMessage



[jvm]\
abstract fun [sendMessage](send-message.html)(externalOrderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), entities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MessageEntity](../../com.tezro.api.shop.model.messages/-message-entity/index.html)&gt;?): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Sends message to customer that created a specific order. Should be used when order's status is one of: confirmed, delivered, disputed.



#### Return



Nothing special, just void;)



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/external-id.html) |  |



## Parameters


jvm

| | |
|---|---|
| externalOrderId | Order's id to which messages should be sent. Make sure to use order's external id rather than internal |
| message | Message body |
| entities | Used for making part of text as clickable url link |




