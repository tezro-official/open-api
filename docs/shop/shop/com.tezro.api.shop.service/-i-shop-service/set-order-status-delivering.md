---
title: setOrderStatusDelivering
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[setOrderStatusDelivering](set-order-status-delivering.html)



# setOrderStatusDelivering



[jvm]\
abstract fun [setOrderStatusDelivering](set-order-status-delivering.html)(orderExternalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attribute](../../com.tezro.api.shop.model.common/-attribute/index.html)&gt;?, trackingNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), trackingUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, comment: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Updates order status to delivering. Adds a new tracking number and url to the order. This number will be used by the customer to track the location of the product during shipment.



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
| orderExternalId | Order's id which should be edited. Make sure to use order's external id rather than internal |
| attributes | List of attributes about the order |
| trackingNumber | The number that will be used to track the goods |
| trackingUrl | The url of the website where goods can be tracked |
| comment | A comment that will be added to the order with the new status and will be displayed in the payment unlocking request (optional). Length must be in range of 1-4096 symbols inclusively |




