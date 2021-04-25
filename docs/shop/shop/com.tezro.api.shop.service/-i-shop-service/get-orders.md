//[shop](../../../index.md)/[com.tezro.api.shop.service](../index.md)/[IShopService](index.md)/[getOrders](get-orders.md)



# getOrders  
[jvm]  
Content  
abstract fun [getOrders](get-orders.md)(offset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, limit: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, direction: [Pagination.Direction](../../com.tezro.api.shop.model/-pagination/-direction/index.md)? = null, status: [Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.md)? = null): IRequest<[OrdersPage](../../com.tezro.api.shop.model.orders/-orders-page/index.md)>  
More info  


Request a list of orders.



#### Return  


a collection of orders paged and filtered by the given parameters



## Samples  
 [jvm] ShopServiceSamples.getOrdersPage   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order.Status](../../com.tezro.api.shop.model.orders/-order/-status/index.md)| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.OrdersPage](../../com.tezro.api.shop.model.orders/-orders-page/index.md)| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>[com.tezro.api.shop.model.Pagination.Direction](../../com.tezro.api.shop.model/-pagination/-direction/index.md)| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>offset| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a><br><br>Number of elements to skip<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>limit| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a><br><br>Number of elements to return<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>direction| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a><br><br>Sorting direction of elements<br><br>|
| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a>status| <a name="com.tezro.api.shop.service/IShopService/getOrders/#kotlin.Long?#kotlin.Long?#com.tezro.api.shop.model.Pagination.Direction?#com.tezro.api.shop.model.orders.Order.Status?/PointingToDeclaration/"></a><br><br>Filters the result collection to contain only orders of a specific status<br><br>|
  
  



