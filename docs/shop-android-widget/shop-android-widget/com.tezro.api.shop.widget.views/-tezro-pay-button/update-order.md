---
title: updateOrder
---
//[shop-android-widget](../../../index.html)/[com.tezro.api.shop.widget.views](../index.html)/[TezroPayButton](index.html)/[updateOrder](update-order.html)



# updateOrder



[androidJvm]\
open fun [updateOrder](update-order.html)()



Call this method to check for order updates. Typically called in onResume when users return to the app.



It will use the data of the loaded order to request updates, which means if an order is not loaded yet, this method will do nothing.




