---
title: initShopService
---
//[shop](../../../index.html)/[com.tezro.api.shop.providers](../index.html)/[Shop](index.html)/[initShopService](init-shop-service.html)



# initShopService



[jvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [initShopService](init-shop-service.html)(keyId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), secret: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, isTestMode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [IShopService](../../com.tezro.api.shop.service/-i-shop-service/index.html)



Creates a new instance of shop service.



Note: All components used by shop service are unique. Each time you create a new service instance, these components will be created as well.



For better performance, keep a single instance of this service through the life cycle of your app. Note that shop service does not keep any states and it's developer's responsibility to cancel and manage requests through the lifecycle of the app.



The reason that singleton instance management is not handled by this library is because different apps have different requirements. Also, this allows users to create and use different services with different parameters.



#### Return



Returns a new instance of shop service



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.service.IShopService](../../com.tezro.api.shop.service/-i-shop-service/index.html) |  |



## Parameters


jvm

| | |
|---|---|
| keyId | Retrieve from credentials in Tezro app |
| secret | Retrieve from credentials in Tezro app, not providing secret will disable some of the requests |
| isTestMode | Uses test service mode |




