---
title: IRequestDelegate
---
//[shop](../../../index.html)/[com.tezro.api.shop.client.core.client.requests](../index.html)/[IRequestDelegate](index.html)



# IRequestDelegate



[jvm]\
interface [IRequestDelegate](index.html)&lt;[T](index.html), [R](index.html)&gt;



## Functions


| Name | Summary |
|---|---|
| [notifyError](notify-error.html) | [jvm]<br>abstract fun [notifyError](notify-error.html)(error: [R](index.html)) |
| [notifySuccess](notify-success.html) | [jvm]<br>abstract fun [notifySuccess](notify-success.html)(response: [T](index.html)) |
| [setCancelBlock](set-cancel-block.html) | [jvm]<br>abstract fun [setCancelBlock](set-cancel-block.html)(cancelBlock: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [IRequestDelegate](index.html)&lt;[T](index.html), [R](index.html)&gt; |
| [setEnqueueBlock](set-enqueue-block.html) | [jvm]<br>abstract fun [setEnqueueBlock](set-enqueue-block.html)(enqueueBlock: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [IRequestDelegate](index.html)&lt;[T](index.html), [R](index.html)&gt; |


## Inheritors


| Name |
|---|
| [Request](../-request/index.html) |

