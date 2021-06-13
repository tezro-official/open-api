---
title: IRequestDelegate -
---
//[shop](../../../index.md)/[com.tezro.api.core.client.requests](../index.md)/[IRequestDelegate](index.md)



# IRequestDelegate  
 [jvm] interface [IRequestDelegate](index.md)<[T](index.md), [R](index.md)>   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.core.client.requests/IRequestDelegate/notifyError/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[notifyError](notify-error.md)| <a name="com.tezro.api.core.client.requests/IRequestDelegate/notifyError/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [notifyError](notify-error.md)(error: [R](index.md))  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequestDelegate/notifySuccess/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[notifySuccess](notify-success.md)| <a name="com.tezro.api.core.client.requests/IRequestDelegate/notifySuccess/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [notifySuccess](notify-success.md)(response: [T](index.md))  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequestDelegate/setCancelBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[setCancelBlock](set-cancel-block.md)| <a name="com.tezro.api.core.client.requests/IRequestDelegate/setCancelBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [setCancelBlock](set-cancel-block.md)(cancelBlock: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [IRequestDelegate](index.md)<[T](index.md), [R](index.md)>  <br><br><br>|
| <a name="com.tezro.api.core.client.requests/IRequestDelegate/setEnqueueBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[setEnqueueBlock](set-enqueue-block.md)| <a name="com.tezro.api.core.client.requests/IRequestDelegate/setEnqueueBlock/#kotlin.Function0[kotlin.Unit]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [setEnqueueBlock](set-enqueue-block.md)(enqueueBlock: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [IRequestDelegate](index.md)<[T](index.md), [R](index.md)>  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.tezro.api.core.client.requests/Request///PointingToDeclaration/"></a>[Request](../-request/index.md)|

