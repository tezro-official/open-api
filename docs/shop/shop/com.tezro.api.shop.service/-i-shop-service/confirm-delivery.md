---
title: confirmDelivery -
---
//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[confirmDelivery](confirm-delivery.md)



# confirmDelivery  
[jvm]  
Content  
abstract fun [confirmDelivery](confirm-delivery.md)(orderExternalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), comment: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [IRequest](../../com.tezro.api.core.client.requests/-i-request/index.md)<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html), [Error](../../com.tezro.api.shop.model.common/-error/index.md)>  
More info  


Updates order's current status to delivered and sends a request to the customer to unlock payment.



#### Return  


Nothing special, just void;)



## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order](../../com.tezro.api.shop.model.orders/-order/external-id.md)| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>orderExternalId| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>Order's id which should be updated. Make sure to use order's external id rather than internal<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>comment| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>A comment that will be added to the order with the new status and will be displayed in the payment unlocking request (optional). Length must be in range of 1-4096 symbols inclusively<br><br>|
  
  



