---
title: Request
---
//[shop](../../../index.html)/[com.tezro.api.shop.client.core.client.requests](../index.html)/[Request](index.html)



# Request



[jvm]\
class [Request](index.html)&lt;[T](index.html), [R](index.html)&gt; : [IRequest](../-i-request/index.html)&lt;[T](index.html), [R](index.html)&gt; , [IRequestDelegate](../-i-request-delegate/index.html)&lt;[T](index.html), [R](index.html)&gt;



## Constructors


| | |
|---|---|
| [Request](-request.html) | [jvm]<br>fun [Request](-request.html)() |


## Functions


| Name | Summary |
|---|---|
| [cancel](cancel.html) | [jvm]<br>open override fun [cancel](cancel.html)()<br>Cancels the current request and removes it from requests queue. |
| [enqueue](enqueue.html) | [jvm]<br>open override fun [enqueue](enqueue.html)()<br>Enqueues the current request in the requests queue to be executed. |
| [notifyError](notify-error.html) | [jvm]<br>open override fun [notifyError](notify-error.html)(error: [R](index.html)) |
| [notifySuccess](notify-success.html) | [jvm]<br>open override fun [notifySuccess](notify-success.html)(response: [T](index.html)) |
| [setCancelBlock](set-cancel-block.html) | [jvm]<br>open override fun [setCancelBlock](set-cancel-block.html)(cancelBlock: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Request](index.html)&lt;[T](index.html), [R](index.html)&gt; |
| [setEnqueueBlock](set-enqueue-block.html) | [jvm]<br>open override fun [setEnqueueBlock](set-enqueue-block.html)(enqueueBlock: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Request](index.html)&lt;[T](index.html), [R](index.html)&gt; |
| [setErrorListener](set-error-listener.html) | [jvm]<br>open override fun [setErrorListener](set-error-listener.html)(errorListener: ([R](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](../-i-request/index.html)&lt;[T](index.html), [R](index.html)&gt;<br>Sets the current listener that will be invoked in case of an error. |
| [setSuccessListener](set-success-listener.html) | [jvm]<br>open override fun [setSuccessListener](set-success-listener.html)(successListener: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?): [IRequest](../-i-request/index.html)&lt;[T](index.html), [R](index.html)&gt;<br>Sets the current listener that will be invoked in case of a successful request. |

