---
title: Status
---
//[shop](../../../../index.html)/[com.tezro.api.shop.model.orders](../../index.html)/[Order](../index.html)/[Status](index.html)



# Status



[jvm]\
enum [Status](index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Order.Status](index.html)&gt; 

Indicates the current status of an order.



## Entries


| | |
|---|---|
| [DISPUTED](-d-i-s-p-u-t-e-d/index.html) | [jvm]<br>[DISPUTED](-d-i-s-p-u-t-e-d/index.html)()<br>Indicates that the customer has disputed order. |
| [RECEIVED](-r-e-c-e-i-v-e-d/index.html) | [jvm]<br>[RECEIVED](-r-e-c-e-i-v-e-d/index.html)()<br>Indicates that the customer has confirmed delivery and unlocked payment. If not, payment will be unlocked automatically in 45 days after delivery confirmation by shop. |
| [DELIVERED](-d-e-l-i-v-e-r-e-d/index.html) | [jvm]<br>[DELIVERED](-d-e-l-i-v-e-r-e-d/index.html)()<br>Indicates that the shop has notified customer about successful delivery. |
| [CONFIRMED](-c-o-n-f-i-r-m-e-d/index.html) | [jvm]<br>[CONFIRMED](-c-o-n-f-i-r-m-e-d/index.html)()<br>Indicates that the customer has paid using escrow service in Tezro App. |
| [ADDRESS_CONFIRMED](-a-d-d-r-e-s-s_-c-o-n-f-i-r-m-e-d/index.html) | [jvm]<br>[ADDRESS_CONFIRMED](-a-d-d-r-e-s-s_-c-o-n-f-i-r-m-e-d/index.html)()<br>Indicates that the customer has entered order's delivery address in Tezro App. |
| [EXPIRED](-e-x-p-i-r-e-d/index.html) | [jvm]<br>[EXPIRED](-e-x-p-i-r-e-d/index.html)()<br>Indicates that the order has expired. If customer not payed order through escrow service for the right time. |
| [CREATED](-c-r-e-a-t-e-d/index.html) | [jvm]<br>[CREATED](-c-r-e-a-t-e-d/index.html)()<br>Indicates that the order was successfully created when user clicked to Pay button in shop's site. |


## Properties


| Name | Summary |
|---|---|
| [name](../-currency/-e-t-h/index.html#-372974862%2FProperties%2F-880856229) | [jvm]<br>val [name](../-currency/-e-t-h/index.html#-372974862%2FProperties%2F-880856229): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-currency/-e-t-h/index.html#-739389684%2FProperties%2F-880856229) | [jvm]<br>val [ordinal](../-currency/-e-t-h/index.html#-739389684%2FProperties%2F-880856229): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

