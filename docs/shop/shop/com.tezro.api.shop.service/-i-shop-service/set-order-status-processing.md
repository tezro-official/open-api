---
title: setOrderStatusProcessing
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[setOrderStatusProcessing](set-order-status-processing.html)



# setOrderStatusProcessing



[jvm]\
abstract fun [setOrderStatusProcessing](set-order-status-processing.html)(orderExternalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attribute](../../com.tezro.api.shop.model.common/-attribute/index.html)&gt;?, comment: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Updates order's current status to processing and sends a notification to the customer.



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
| orderExternalId | Order's id which should be updated. Make sure to use order's external id rather than internal |
| attributes | List of attributes about the order |
| comment | A comment that will be added to the order with the new status and will be displayed in the payment unlocking request (optional). Length must be in range of 1-4096 symbols inclusively |




