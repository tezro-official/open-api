//[shop-widget](../../../../index.md)/[com.tezro.api.shop.widget.core](../../index.md)/[OrderUpdateReceiver](../index.md)/[Companion](index.md)/[registerOrderUpdateReceiver](register-order-update-receiver.md)



# registerOrderUpdateReceiver  
[androidJvm]  
Content  
fun [registerOrderUpdateReceiver](register-order-update-receiver.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), onOrderUpdate: (Order) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [OrderUpdateReceiver](../index.md)  
More info  


Registers a broadcast receiver inside a specific context



#### Return  


Broadcast receiver that was registered. Must be used to unregister the receiver to stop receiving broadcasts



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a>context| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The context that will register the receiver<br><br>|
| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a>onOrderUpdate| <a name="com.tezro.api.shop.widget.core/OrderUpdateReceiver.Companion/registerOrderUpdateReceiver/#android.content.Context#kotlin.Function1[com.tezro.api.shop.model.orders.Order,kotlin.Unit]/PointingToDeclaration/"></a><br><br>The callback that will be invoked when order is loaded from the server<br><br>|
  
  



