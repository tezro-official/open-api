---
title: getOrder
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[getOrder](get-order.html)



# getOrder



[jvm]\
abstract fun [getOrder](get-order.html)(orderExternalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[Order](../../com.tezro.api.shop.model.orders/-order/index.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Request an order by its id.



#### Return



The requested order



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/external-id.html) |  |



## Parameters


jvm

| | |
|---|---|
| orderExternalId | Order's id which should be returned. Make sure to use order's external id rather than internal |




