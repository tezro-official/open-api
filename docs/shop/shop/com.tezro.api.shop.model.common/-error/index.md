---
title: Error
---
//[shop](../../../index.html)/[com.tezro.api.shop.model.common](../index.html)/[Error](index.html)



# Error



[jvm]\
data class [Error](index.html)(val error: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val message: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))

Contains details about a response error. This error can be thrown as an exception.



## See also


jvm

| | |
|---|---|
| [kotlin.Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |  |



## Parameters


jvm

| | |
|---|---|
| message | Error message returned by the server |
| statusCode | Status code of the response |



## Constructors


| | |
|---|---|
| [Error](-error.html) | [jvm]<br>fun [Error](-error.html)(error: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), message: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [error](error.html) | [jvm]<br>val [error](error.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [message](message.html) | [jvm]<br>val [message](message.html): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [statusCode](status-code.html) | [jvm]<br>val [statusCode](status-code.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

