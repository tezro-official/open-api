//[shop-android-widget](../../../../index.md)/[com.tezro.api.shop.widget.views](../../index.md)/[TezroPayButton](../index.md)/[TezroPayButtonDelegate](index.md)



# TezroPayButtonDelegate  
 [androidJvm] interface [TezroPayButtonDelegate](index.md)

Used to listen to different events and states of this button. To start listening, you must implement this interface and assign it to TezroPayButton.delegate.



Implementing methods is optional. You can implement only methods that you are interested in.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate///PointingToDeclaration/"></a>[com.tezro.api.shop.widget.views.TezroPayButton](../delegate.md)| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onLoadingOrderError/#com.tezro.api.core.client.responses.Error/PointingToDeclaration/"></a>[onLoadingOrderError](on-loading-order-error.md)| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onLoadingOrderError/#com.tezro.api.core.client.responses.Error/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onLoadingOrderError](on-loading-order-error.md)(error: Error)  <br>More info  <br>This method will be called if something goes wrong while loading order data.  <br><br><br>|
| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onLoadingOrderStart/#/PointingToDeclaration/"></a>[onLoadingOrderStart](on-loading-order-start.md)| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onLoadingOrderStart/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onLoadingOrderStart](on-loading-order-start.md)()  <br>More info  <br>This method will be called if order data was provided or the update method was called.  <br><br><br>|
| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onNewOrderDataLoaded/#com.tezro.api.shop.model.orders.Order/PointingToDeclaration/"></a>[onNewOrderDataLoaded](on-new-order-data-loaded.md)| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onNewOrderDataLoaded/#com.tezro.api.shop.model.orders.Order/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onNewOrderDataLoaded](on-new-order-data-loaded.md)(order: Order)  <br>More info  <br>This method will be called with the data of a new order when loading is finished.  <br><br><br>|
| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onRequestOrderInit/#/PointingToDeclaration/"></a>[onRequestOrderInit](on-request-order-init.md)| <a name="com.tezro.api.shop.widget.views/TezroPayButton.TezroPayButtonDelegate/onRequestOrderInit/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onRequestOrderInit](on-request-order-init.md)()  <br>More info  <br>This method will be called if the user clicks on the button but no order data was provided.  <br><br><br>|

