---
title: TezroPayButtonDelegate
---
//[shop-android-widget](../../../../index.html)/[com.tezro.api.shop.widget.views](../../index.html)/[TezroPayButton](../index.html)/[TezroPayButtonDelegate](index.html)



# TezroPayButtonDelegate



[androidJvm]\
interface [TezroPayButtonDelegate](index.html)

Used to listen to different events and states of this button. To start listening, you must implement this interface and assign it to TezroPayButton.delegate.



Implementing methods is optional. You can implement only methods that you are interested in.



## See also


androidJvm

| | |
|---|---|
| [com.tezro.api.shop.widget.views.TezroPayButton](../delegate.html) |  |



## Functions


| Name | Summary |
|---|---|
| [onLoadingOrderError](on-loading-order-error.html) | [androidJvm]<br>open fun [onLoadingOrderError](on-loading-order-error.html)(error: Error)<br>This method will be called if something goes wrong while loading order data. |
| [onLoadingOrderStart](on-loading-order-start.html) | [androidJvm]<br>open fun [onLoadingOrderStart](on-loading-order-start.html)()<br>This method will be called if order data was provided or the update method was called. To provide data you must call TezroPayButton.initOrder(). To update data you must call TezroPayButton.updateOrder(). |
| [onNewOrderDataLoaded](on-new-order-data-loaded.html) | [androidJvm]<br>open fun [onNewOrderDataLoaded](on-new-order-data-loaded.html)(order: Order)<br>This method will be called with the data of a new order when loading is finished. Always called after the first TezroPayButton.initOrder() call or if initOrder is called with a different orderId. If there was an update request, and order data didn't change, this method won't be called. |
| [onRequestOrderInit](on-request-order-init.html) | [androidJvm]<br>open fun [onRequestOrderInit](on-request-order-init.html)()<br>This method will be called if the user clicks on the button but no order data was provided. To provide data you must call TezroPayButton.initOrder(). |

