---
title: IRequest
---
//[shop](../../../index.html)/[com.tezro.api.shop.client.core.client.requests](../index.html)/[IRequest](index.html)



# IRequest



[jvm]\
interface [IRequest](index.html)&lt;[T](index.html), [R](index.html)&gt;

Delegate of the a request.



## See also


jvm

| | |
|---|---|
| [com.tezro.api.shop.client.core.client.requests.IRequest](enqueue.html) |  |
| [kotlin.Error](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-error/index.html) |  |



## Functions


| Name | Summary |
|---|---|
| [cancel](cancel.html) | [jvm]<br>abstract fun [cancel](cancel.html)()<br>Cancels the current request and removes it from requests queue. |
| [enqueue](enqueue.html) | [jvm]<br>abstract fun [enqueue](enqueue.html)()<br>Enqueues the current request in the requests queue to be executed. |
| [setErrorListener](set-error-listener.html) | [jvm]<br>abstract fun [setErrorListener](set-error-listener.html)(errorListener: ([R](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](index.html)&lt;[T](index.html), [R](index.html)&gt;<br>Sets the current listener that will be invoked in case of an error. |
| [setSuccessListener](set-success-listener.html) | [jvm]<br>abstract fun [setSuccessListener](set-success-listener.html)(successListener: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](index.html)&lt;[T](index.html), [R](index.html)&gt;<br>Sets the current listener that will be invoked in case of a successful request. |


## Inheritors


| Name |
|---|
| [Request](../-request/index.html) |

