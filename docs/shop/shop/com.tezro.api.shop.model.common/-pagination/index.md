---
title: Pagination
---
//[shop](../../../index.html)/[com.tezro.api.shop.model.common](../index.html)/[Pagination](index.html)



# Pagination



[jvm]\
data class [Pagination](index.html)

Contains detailed information about pages.



## Parameters


jvm

| | |
|---|---|
| offset | Skipped items count |
| count | Current items count |
| total | Total items count |
| hasPrevious | Indicates if there are previous pages of elements |
| hasNext | Indicates if there are next pages of elements |



## Types


| Name | Summary |
|---|---|
| [Direction](-direction/index.html) | [jvm]<br>enum [Direction](-direction/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Pagination.Direction](-direction/index.html)&gt; <br>Controls sorting direction in collections. |


## Properties


| Name | Summary |
|---|---|
| [count](count.html) | [jvm]<br>val [count](count.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [hasNext](has-next.html) | [jvm]<br>val [hasNext](has-next.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasPrevious](has-previous.html) | [jvm]<br>val [hasPrevious](has-previous.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [offset](offset.html) | [jvm]<br>val [offset](offset.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [total](total.html) | [jvm]<br>val [total](total.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

