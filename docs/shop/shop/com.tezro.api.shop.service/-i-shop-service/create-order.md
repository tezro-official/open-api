---
title: createOrder
---
//[shop](../../../index.html)/[com.tezro.api.shop.service](../index.html)/[IShopService](index.html)/[createOrder](create-order.html)



# createOrder



[jvm]\
abstract fun [createOrder](create-order.html)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: [Order.Currency](../../com.tezro.api.shop.model.orders/-order/-currency/index.html), confirmAmountUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expiryDate: [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html), photos: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;?, attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attribute](../../com.tezro.api.shop.model.common/-attribute/index.html)&gt;?): [IRequest](../../com.tezro.api.shop.client.core.client.requests/-i-request/index.html)&lt;[Order](../../com.tezro.api.shop.model.orders/-order/index.html), [Error](../../com.tezro.api.shop.model.common/-error/index.html)&gt;



Initializes a new order.



#### Return



Detailed information about the created order



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.model.orders.Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.html) |  |
| [com.tezro.api.shop.model.orders.Order.Currency](../../com.tezro.api.shop.model.orders/-order/-currency/index.html) |  |
| [com.tezro.api.shop.model.common.Attribute](../../com.tezro.api.shop.model.common/-attribute/index.html) |  |
| [com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/index.html) |  |



## Parameters


jvm

| | |
|---|---|
| orderId | The created order will have this value as an internalId. It must be unique and length must be in a range of 1 to 20 symbols |
| name | Name of the order product or products |
| amount | The amount that should be payed by the customer |
| currency | The currency that will be accepted for payment |
| confirmAmountUrl | Used for confirming order's amount and payment status. This must be a valid url. Protocol is required (only http or https) |
| expiryDate | The date when this order will be no longer valid. Date must be later than current time + 1 min and earlier than current time + 24 hours. If you don't provide a date, it will be by default 1 hour since creation |
| photos | List of photo urls of ordered products |
| attributes | List of attributes about the order |




