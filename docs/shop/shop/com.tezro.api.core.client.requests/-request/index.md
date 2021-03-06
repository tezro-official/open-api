---
title: Request -
---
//[shop](../../../index.md)/[com.tezro.api.core.client.requests](../index.md)/[Request](index.md)



# Request  
 [jvm] class [Request](index.md)<[T](index.md), [R](index.md)> : [IRequest](../-i-request/index.md)<[T](index.md), [R](index.md)> , [IRequestDelegate](../-i-request-delegate/index.md)<[T](index.md), [R](index.md)>    


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.core.client.requests/Request/cancel/#/PointingToDeclaration/"></a>[cancel](cancel.md)| <a name="com.tezro.api.core.client.requests/Request/cancel/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [cancel](cancel.md)()  <br>More info  <br>Cancels the current request and removes it from requests queue.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/enqueue/#/PointingToDeclaration/"></a>[enqueue](enqueue.md)| <a name="com.tezro.api.core.client.requests/Request/enqueue/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [enqueue](enqueue.md)()  <br>More info  <br>Enqueues the current request in the requests queue to be executed.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/notifyError/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[notifyError](notify-error.md)| <a name="com.tezro.api.core.client.requests/Request/notifyError/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [notifyError](notify-error.md)(error: [R](index.md))  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/notifySuccess/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[notifySuccess](notify-success.md)| <a name="com.tezro.api.core.client.requests/Request/notifySuccess/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [notifySuccess](notify-success.md)(response: [T](index.md))  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/setCancelBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[setCancelBlock](set-cancel-block.md)| <a name="com.tezro.api.core.client.requests/Request/setCancelBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [setCancelBlock](set-cancel-block.md)(cancelBlock: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Request](index.md)<[T](index.md), [R](index.md)>  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/setEnqueueBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[setEnqueueBlock](set-enqueue-block.md)| <a name="com.tezro.api.core.client.requests/Request/setEnqueueBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [setEnqueueBlock](set-enqueue-block.md)(enqueueBlock: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Request](index.md)<[T](index.md), [R](index.md)>  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/setErrorListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[setErrorListener](set-error-listener.md)| <a name="com.tezro.api.core.client.requests/Request/setErrorListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [setErrorListener](set-error-listener.md)(errorListener: ([R](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](../-i-request/index.md)<[T](index.md), [R](index.md)>  <br>More info  <br>Sets the current listener that will be invoked in case of an error.  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/Request/setSuccessListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[setSuccessListener](set-success-listener.md)| <a name="com.tezro.api.core.client.requests/Request/setSuccessListener/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [setSuccessListener](set-success-listener.md)(successListener: ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](../-i-request/index.md)<[T](index.md), [R](index.md)>  <br>More info  <br>Sets the current listener that will be invoked in case of a successful request.  <br><br><br>|

