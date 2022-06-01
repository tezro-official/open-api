---
title: onNewOrderDataLoaded
---
//[shop-android-widget](../../../../index.html)/[com.tezro.api.shop.widget.views](../../index.html)/[TezroPayButton](../index.html)/[TezroPayButtonDelegate](index.html)/[onNewOrderDataLoaded](on-new-order-data-loaded.html)



# onNewOrderDataLoaded



[androidJvm]\
open fun [onNewOrderDataLoaded](on-new-order-data-loaded.html)(order: Order)



This method will be called with the data of a new order when loading is finished. Always called after the first TezroPayButton.initOrder() call or if initOrder is called with a different orderId. If there was an update request, and order data didn't change, this method won't be called.



## See also


androidJvm

| | |
|---|---|
| [com.tezro.api.shop.widget.views.TezroPayButton](../update-order.html) |  |
| com.tezro.api.shop.model.orders.Order |  |



## Parameters


androidJvm

| | |
|---|---|
| order | The new order object with new data |




