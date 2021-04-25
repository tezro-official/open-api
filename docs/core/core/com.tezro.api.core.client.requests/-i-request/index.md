//[core](../../../index.md)/[com.tezro.api.core.client.requests](../index.md)/[IRequest](index.md)



# IRequest  
 [jvm] interface [IRequest](index.md)<[T](index.md)>

Delegate of the a request.

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.core.client.requests/IRequest///PointingToDeclaration/"></a>[com.tezro.api.core.client.requests.IRequest](enqueue.md)| <a name="com.tezro.api.core.client.requests/IRequest///PointingToDeclaration/"></a>|
| <a name="com.tezro.api.core.client.requests/IRequest///PointingToDeclaration/"></a>[com.tezro.api.core.client.responses.Error](../../com.tezro.api.core.client.responses/-error/index.md)| <a name="com.tezro.api.core.client.requests/IRequest///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.core.client.requests/IRequest/cancel/#/PointingToDeclaration/"></a>[cancel](cancel.md)| <a name="com.tezro.api.core.client.requests/IRequest/cancel/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [cancel](cancel.md)()  <br>More info  <br>Cancels the current request and removes it from requests queue.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequest/enqueue/#/PointingToDeclaration/"></a>[enqueue](enqueue.md)| <a name="com.tezro.api.core.client.requests/IRequest/enqueue/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [enqueue](enqueue.md)()  <br>More info  <br>Enqueues the current request in the requests queue to be executed.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequest/setErrorListener/#kotlin.Function1[com.tezro.api.core.client.responses.Error,kotlin.Unit]?/PointingToDeclaration/"></a>[setErrorListener](set-error-listener.md)| <a name="com.tezro.api.core.client.requests/IRequest/setErrorListener/#kotlin.Function1[com.tezro.api.core.client.responses.Error,kotlin.Unit]?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [setErrorListener](set-error-listener.md)(errorListener: ([Error](../../com.tezro.api.core.client.responses/-error/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](index.md)<[T](index.md)>  <br>More info  <br>Sets the current listener that will be invoked in case of an error.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequest/setSuccessListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[setSuccessListener](set-success-listener.md)| <a name="com.tezro.api.core.client.requests/IRequest/setSuccessListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [setSuccessListener](set-success-listener.md)(successListener: ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](index.md)<[T](index.md)>  <br>More info  <br>Sets the current listener that will be invoked in case of a successful request.  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.tezro.api.core.client.requests/Request///PointingToDeclaration/"></a>[Request](../-request/index.md)|

