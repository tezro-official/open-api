---
title: PaymentHelper
---
//[shop-android-widget](../../../index.html)/[com.tezro.api.shop.widget.core](../index.html)/[PaymentHelper](index.html)



# PaymentHelper



[androidJvm]\
object [PaymentHelper](index.html)

A helper that's used to proceed the user to order payment.



## See also


androidJvm

| | |
|---|---|
| com.tezro.api.shop.model.orders.Order |  |



## Functions


| Name | Summary |
|---|---|
| [requestPaymentByLink](request-payment-by-link.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [requestPaymentByLink](request-payment-by-link.html)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), paymentLink: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Opens Tezro app or web browser if the app is not installed. Proceeds the user to order payment. |
| [requestPaymentByOrder](request-payment-by-order.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [requestPaymentByOrder](request-payment-by-order.html)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), order: Order)<br>Opens Tezro app or web browser if the app is not installed. Proceeds the user to order payment. |

