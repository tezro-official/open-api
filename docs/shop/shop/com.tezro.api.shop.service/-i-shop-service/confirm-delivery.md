//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[confirmDelivery](confirm-delivery.md)



# confirmDelivery  
[jvm]  
Content  
abstract fun [confirmDelivery](confirm-delivery.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), comment: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): IRequest<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html)>  
More info  


Updates order's current status to delivered and sends a request to the customer to unlock payment.



#### Return  


nothing special, just void



## Samples  
 [jvm] ShopServiceSamples.confirmOrderDelivery   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>com.tezro.api.core.client.responses.SimpleResponse| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>orderId| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>Order's id which should be updated<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>comment| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a><br><br>A comment that will be added to the order with the new status and will be displayed in the payment unlocking request (optional). Length must be in range of 1-4096 symbols inclusively<br><br>|
  
  



