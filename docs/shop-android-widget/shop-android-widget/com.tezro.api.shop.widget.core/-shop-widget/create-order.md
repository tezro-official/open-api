---
title: createOrder
---
//[shop-android-widget](../../../index.html)/[com.tezro.api.shop.widget.core](../index.html)/[ShopWidget](index.html)/[createOrder](create-order.html)



# createOrder



[androidJvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [createOrder](create-order.html)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: Order.Currency, confirmAmountUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expiryDate: [Date](https://developer.android.com/reference/kotlin/java/util/Date.html), photos: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;? = null, attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;Attribute&gt;? = null): IRequest&lt;Order, Error&gt;



Uses to create a new order with the provided data.



#### Return



Detailed information about the created order



## See also


androidJvm

| | |
|---|---|
| com.tezro.api.shop.model.orders.Order.Status |  |
| com.tezro.api.shop.model.orders.Order.Currency |  |
| com.tezro.api.shop.model.common.Attribute |  |
| com.tezro.api.shop.model.orders.Order |  |



## Parameters


androidJvm

| | |
|---|---|
| orderId | The created order will have this value as an identifier. It must be unique and length must be in a range of 1 to 20 symbols |
| name | Name of the order product or products |
| amount | The amount that should be payed by the customer |
| currency | The currency that will be accepted for payment |
| confirmAmountUrl | Used for confirming order's amount and payment status. This must be a valid url. Protocol is required (only http or https) |
| expiryDate | The date when this order will be no longer valid. Date must be later than current time + 1 min and earlier than current time + 24 hours. If you don't provide a date, it will be by default 1 hour since creation |
| photos | List of photo urls of ordered products |
| attributes | List of attributes about the order |



## Throws


| | |
|---|---|
| [kotlin.IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html) | if the init method was not called |



