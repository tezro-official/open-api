//[shop-widget](../../../../index.md)/[com.tezro.api.shop.widget.core](../../index.md)/[OrderUpdateReceiver](../index.md)/[Companion](index.md)



# Companion  
 [androidJvm] object [Companion](index.md)   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a>[registerOrderUpdateReceiver](register-order-update-receiver.md)| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [registerOrderUpdateReceiver](register-order-update-receiver.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), onOrderUpdate: (Order) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [OrderUpdateReceiver](../index.md)  <br>More info  <br>Registers a broadcast receiver inside a specific context  <br><br><br>|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/unregisterOrderUpdateReceiver/#android.content.Context#com.tezro.api.shop.widget.core.OrderUpdateReceiver/PointingToDeclaration/"></a>[unregisterOrderUpdateReceiver](unregister-order-update-receiver.md)| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/unregisterOrderUpdateReceiver/#android.content.Context#com.tezro.api.shop.widget.core.OrderUpdateReceiver/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [unregisterOrderUpdateReceiver](unregister-order-update-receiver.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), orderUpdateReceiver: [OrderUpdateReceiver](../index.md))  <br>More info  <br>Unregisters a broad cast receiver inside a specific context  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/ORDER_ID_KEY/#/PointingToDeclaration/"></a>[ORDER_ID_KEY](-o-r-d-e-r_-i-d_-k-e-y.md)| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/ORDER_ID_KEY/#/PointingToDeclaration/"></a> [androidJvm] const val [ORDER_ID_KEY](-o-r-d-e-r_-i-d_-k-e-y.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The key that will be used to read orderId from intent   <br>|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/TEZRO_ORDER_UPDATED_ACTION/#/PointingToDeclaration/"></a>[TEZRO_ORDER_UPDATED_ACTION](-t-e-z-r-o_-o-r-d-e-r_-u-p-d-a-t-e-d_-a-c-t-i-o-n.md)| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/TEZRO_ORDER_UPDATED_ACTION/#/PointingToDeclaration/"></a> [androidJvm] const val [TEZRO_ORDER_UPDATED_ACTION](-t-e-z-r-o_-o-r-d-e-r_-u-p-d-a-t-e-d_-a-c-t-i-o-n.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Broadcast action that will be invoked by Tezro app when order is updated   <br>|

