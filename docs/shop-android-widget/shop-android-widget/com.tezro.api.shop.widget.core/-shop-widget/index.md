---
title: ShopWidget
---
//[shop-android-widget](../../../index.html)/[com.tezro.api.shop.widget.core](../index.html)/[ShopWidget](index.html)



# ShopWidget



[androidJvm]\
object [ShopWidget](index.html)

A helper that's used to manage orders.



## See also


androidJvm

| | |
|---|---|
| [com.tezro.api.shop.widget.core.ShopWidget](get-order.html) |  |



## Functions


| Name | Summary |
|---|---|
| [createOrder](create-order.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [createOrder](create-order.html)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: Order.Currency, confirmAmountUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expiryDate: [Date](https://developer.android.com/reference/kotlin/java/util/Date.html), photos: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;? = null, attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;Attribute&gt;? = null): IRequest&lt;Order, Error&gt;<br>Uses to create a new order with the provided data. |
| [getOrder](get-order.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [getOrder](get-order.html)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest&lt;Order, Error&gt;<br>Used to get information about an already existing order. |
| [init](init.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [init](init.html)(keyId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isTestMode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Must be called before requests through this helper. |

