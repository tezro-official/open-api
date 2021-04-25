//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[sendMessage](send-message.md)



# sendMessage  
[jvm]  
Content  
abstract fun [sendMessage](send-message.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html)>  
More info  


Sends message to customer that created a specific order. Should be used when order's status is one of: confirmed, delivered, disputed.



#### Return  


nothing special, just void



## Samples  
 [jvm] ShopServiceSamples.sendMessageToCustomer   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>com.tezro.api.core.client.responses.SimpleResponse| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>orderId| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>Order's id to which messages should be sent<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>message| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>Message body<br><br>|
  
  



