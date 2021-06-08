//[shop-android-widget](../../../index.md)/[com.tezro.api.shop.widget.core](../index.md)/[ShopWidget](index.md)



# ShopWidget  
 [androidJvm] object [ShopWidget](index.md)

A helper that's used to manage orders.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.widget.core/ShopWidget///PointingToDeclaration/"></a>[com.tezro.api.shop.widget.core.ShopWidget](get-order.md)| <a name="com.tezro.api.shop.widget.core/ShopWidget///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.widget.core/ShopWidget/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[createOrder](create-order.md)| <a name="com.tezro.api.shop.widget.core/ShopWidget/createOrder/#kotlin.String#kotlin.String#kotlin.String#com.tezro.api.shop.model.orders.Order.Currency#kotlin.String#java.util.Date#kotlin.collections.List[kotlin.String]?#kotlin.collections.List[com.tezro.api.shop.model.common.Attribute]?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  <br>  <br>fun [createOrder](create-order.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currency: Order.Currency, confirmAmountUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expiryDate: [Date](https://developer.android.com/reference/kotlin/java/util/Date.html), photos: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>? = null, attributes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<Attribute>? = null): IRequest<Order>  <br>More info  <br>Uses to create a new order with the provided data.  <br><br><br>|
| <a name="com.tezro.api.shop.widget.core/ShopWidget/getOrder/#kotlin.String/PointingToDeclaration/"></a>[getOrder](get-order.md)| <a name="com.tezro.api.shop.widget.core/ShopWidget/getOrder/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  <br>  <br>fun [getOrder](get-order.md)(orderId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): IRequest<Order>  <br>More info  <br>Used to get information about an already existing order.  <br><br><br>|
| <a name="com.tezro.api.shop.widget.core/ShopWidget/init/#kotlin.String#kotlin.Boolean/PointingToDeclaration/"></a>[init](init.md)| <a name="com.tezro.api.shop.widget.core/ShopWidget/init/#kotlin.String#kotlin.Boolean/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  <br>  <br>fun [init](init.md)(keyId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isTestMode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>Must be called before requests through this helper.  <br><br><br>|

