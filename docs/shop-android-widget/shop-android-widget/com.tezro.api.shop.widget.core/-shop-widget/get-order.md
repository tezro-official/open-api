---
title: getOrder
---
//[shop-android-widget](../../../index.html)/[com.tezro.api.shop.widget.core](../index.html)/[ShopWidget](index.html)/[getOrder](get-order.html)



# getOrder



[androidJvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [getOrder](get-order.html)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest&lt;Order, Error&gt;



Used to get information about an already existing order.



#### Return



Returns the request order



## Parameters


androidJvm

| | |
|---|---|
| orderId | The id of the order that must be requested |



## Throws


| | |
|---|---|
| [kotlin.IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html) | if the init method was not called |



