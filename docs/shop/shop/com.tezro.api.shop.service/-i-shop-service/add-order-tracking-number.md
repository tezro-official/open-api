---
title: addOrderTrackingNumber -
---
//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[addOrderTrackingNumber](add-order-tracking-number.md)



# addOrderTrackingNumber  
[jvm]  
Content  
abstract fun [addOrderTrackingNumber](add-order-tracking-number.md)(orderExternalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), trackingNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), trackingUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [IRequest](../../com.tezro.api.core.client.requests/-i-request/index.md)<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.md)>  
More info  


Adds a new tracking number and url to the order. This number will be used by the customer to track the location of the product during shipment.



#### Return  


Nothing special, just void;)



## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/external-id.md)| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>orderExternalId| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>Order's id which should be edited. Make sure to use order's external id rather than internal<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>trackingNumber| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>The number that will be used to track the goods<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>trackingUrl| <a name="com.tezro.api.shop.service/IShopService/addOrderTrackingNumber/#kotlin.String#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>The url of the website where goods can be tracked<br><br>|
  
  



