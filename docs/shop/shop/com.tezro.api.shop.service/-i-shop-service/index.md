//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)



# IShopService  
 [jvm] interface [IShopService](index.md) : IService

A Service which is used to make requests to Tezro Open-Api to send or receive different information about a shop and orders.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.core.service.core/IService/cancelAllRequests/#/PointingToDeclaration/"></a>[cancelAllRequests](index.md#-1668778940%2FFunctions%2F823390186)| <a name="com.tezro.api.core.service.core/IService/cancelAllRequests/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [cancelAllRequests](index.md#-1668778940%2FFunctions%2F823390186)()  <br><br><br>|
| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[confirmDelivery](confirm-delivery.md)| <a name="com.tezro.api.shop.service/IShopService/confirmDelivery/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [confirmDelivery](confirm-delivery.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), comment: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): IRequest<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html)>  <br>More info  <br>Updates order's current status to delivered and sends a request to the customer to unlock payment.  <br><br><br>|
| <a name="com.tezro.api.shop.service/IShopService/getOrder/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[getOrder](get-order.md)| <a name="com.tezro.api.shop.service/IShopService/getOrder/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [getOrder](get-order.md)(eosName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest<[Order](../../com.tezro.api.shop.model.orders/-order/index.md)>  <br>More info  <br>Request an order by its id.  <br><br><br>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>[getOrders](get-orders.md)| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [getOrders](get-orders.md)(offset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, limit: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, direction: [Pagination.Direction](../../com.tezro.api.shop.model/-pagination/-direction/index.md)? = null, status: [Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.md)? = null): IRequest<[OrdersPage](../../com.tezro.api.shop.model.orders/-orders-page/index.md)>  <br>More info  <br>Request a list of orders.  <br><br><br>|
| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[sendMessage](send-message.md)| <a name="com.tezro.api.shop.service/IShopService/sendMessage/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [sendMessage](send-message.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest<[Void](https://docs.oracle.com/javase/8/docs/api/java/lang/Void.html)>  <br>More info  <br>Sends message to customer that created a specific order.  <br><br><br>|

