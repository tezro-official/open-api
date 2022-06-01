---
title: getOrders
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[getOrders](get-orders.html)



# getOrders



[jvm]\
abstract fun [getOrders](get-orders.html)(offset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, limit: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, direction: [Pagination.Direction](../../com.tezro.api.shop.model.common/-pagination/-direction/index.html)? = null, status: [Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.html)? = null): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[OrdersPage](../../com.tezro.api.shop.model.orders/-orders-page/index.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Request a list of orders.



#### Return



A collection of orders paged and filtered by the given parameters



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.model.orders.Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.html) |  |
| [com.tezro.api.shop.model.orders.OrdersPage](../../com.tezro.api.shop.model.orders/-orders-page/index.html) |  |
| [com.tezro.api.shop.model.common.Pagination.Direction](../../com.tezro.api.shop.model.common/-pagination/-direction/index.html) |  |



## Parameters


jvm

| | |
|---|---|
| offset | Number of elements to skip |
| limit | Number of elements to return |
| direction | Sorting direction of elements |
| status | Filters the result collection to contain only orders of a specific status |




