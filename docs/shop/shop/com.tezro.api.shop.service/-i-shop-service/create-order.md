---
title: createOrder -
---
//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[createOrder](create-order.md)



# createOrder  
[jvm]  
Content  
abstract fun [createOrder](create-order.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: [Order.Currency](../../com.tezro.api.shop.model.orders/-order/-currency/index.md), confirmAmountUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expiryDate: [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html), photos: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>?, attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Attribute](../../com.tezro.api.shop.model.common/-attribute/index.md)>?): [IRequest](../../com.tezro.api.core.client.requests/-i-request/index.md)<[Order](../../com.tezro.api.shop.model.orders/-order/index.md), [Error](../../com.tezro.api.shop.model.common/-error/index.md)>  
More info  


Initializes a new order.



#### Return  


Detailed information about the created order



## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.md)| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order.Currency](../../com.tezro.api.shop.model.orders/-order/-currency/index.md)| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.common.Attribute](../../com.tezro.api.shop.model.common/-attribute/index.md)| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/index.md)| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>orderId| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>The created order will have this value as an internalId. It must be unique and length must be in a range of 1 to 20 symbols<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>name| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>Name of the order product or products<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>amount| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>The amount that should be payed by the customer<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>currency| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>The currency that will be accepted for payment<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>confirmAmountUrl| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>Used for confirming order's amount and payment status. This must be a valid url. Protocol is required (only http or https)<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>expiryDate| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>The date when this order will be no longer valid. Date must be later than current time + 1 min and earlier than current time + 24 hours. If you don't provide a date, it will be by default 1 hour since creation<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>photos| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>List of photo urls of ordered products<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>attributes| <a name="com.tezro.api.shop.service/IShopService/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a><br><br>List of attributes about the order<br><br>|
  
  



