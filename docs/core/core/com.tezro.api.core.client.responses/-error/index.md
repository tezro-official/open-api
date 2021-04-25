//[core](../../../index.md)/[com.tezro.api.core.client.responses](../index.md)/[Error](index.md)



# Error  
 [jvm] class [Error](index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **statusCode**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)

Contains details about a response error. This error can be thrown as an exception.

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a>[kotlin.Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a>message| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a><br><br>Error message returned by the server<br><br>|
| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a>statusCode| <a name="com.tezro.api.core.client.responses/Error///PointingToDeclaration/"></a><br><br>Status code of the response<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.tezro.api.core.client.responses/Error/Error/#kotlin.String#kotlin.Int/PointingToDeclaration/"></a>[Error](-error.md)| <a name="com.tezro.api.core.client.responses/Error/Error/#kotlin.String#kotlin.Int/PointingToDeclaration/"></a> [jvm] fun [Error](-error.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))Error message returned by the server   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="kotlin/Throwable/addSuppressed/#kotlin.Throwable/PointingToDeclaration/"></a>[addSuppressed](index.md#282858770%2FFunctions%2F971615585)| <a name="kotlin/Throwable/addSuppressed/#kotlin.Throwable/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [addSuppressed](index.md#282858770%2FFunctions%2F971615585)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html))  <br><br><br>|
| <a name="kotlin/Throwable/fillInStackTrace/#/PointingToDeclaration/"></a>[fillInStackTrace](index.md#-1102069925%2FFunctions%2F971615585)| <a name="kotlin/Throwable/fillInStackTrace/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [fillInStackTrace](index.md#-1102069925%2FFunctions%2F971615585)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br><br><br>|
| <a name="kotlin/Throwable/getLocalizedMessage/#/PointingToDeclaration/"></a>[getLocalizedMessage](index.md#1043865560%2FFunctions%2F971615585)| <a name="kotlin/Throwable/getLocalizedMessage/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [getLocalizedMessage](index.md#1043865560%2FFunctions%2F971615585)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|
| <a name="kotlin/Throwable/getStackTrace/#/PointingToDeclaration/"></a>[getStackTrace](index.md#2050903719%2FFunctions%2F971615585)| <a name="kotlin/Throwable/getStackTrace/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [getStackTrace](index.md#2050903719%2FFunctions%2F971615585)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)>  <br><br><br>|
| <a name="kotlin/Throwable/getSuppressed/#/PointingToDeclaration/"></a>[getSuppressed](index.md#672492560%2FFunctions%2F971615585)| <a name="kotlin/Throwable/getSuppressed/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getSuppressed](index.md#672492560%2FFunctions%2F971615585)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)>  <br><br><br>|
| <a name="kotlin/Throwable/initCause/#kotlin.Throwable/PointingToDeclaration/"></a>[initCause](index.md#-418225042%2FFunctions%2F971615585)| <a name="kotlin/Throwable/initCause/#kotlin.Throwable/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [initCause](index.md#-418225042%2FFunctions%2F971615585)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br><br><br>|
| <a name="kotlin/Throwable/printStackTrace/#/PointingToDeclaration/"></a>[printStackTrace](index.md#-1769529168%2FFunctions%2F971615585)| <a name="kotlin/Throwable/printStackTrace/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [printStackTrace](index.md#-1769529168%2FFunctions%2F971615585)()  <br>open fun [printStackTrace](index.md#1841853697%2FFunctions%2F971615585)(p0: [PrintStream](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html))  <br>open fun [printStackTrace](index.md#1175535278%2FFunctions%2F971615585)(p0: [PrintWriter](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html))  <br><br><br>|
| <a name="kotlin/Throwable/setStackTrace/#kotlin.Array[java.lang.StackTraceElement]/PointingToDeclaration/"></a>[setStackTrace](index.md#2135801318%2FFunctions%2F971615585)| <a name="kotlin/Throwable/setStackTrace/#kotlin.Array[java.lang.StackTraceElement]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [setStackTrace](index.md#2135801318%2FFunctions%2F971615585)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)>)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.core.client.responses/Error/cause/#/PointingToDeclaration/"></a>[cause](index.md#-1836236043%2FProperties%2F971615585)| <a name="com.tezro.api.core.client.responses/Error/cause/#/PointingToDeclaration/"></a> [jvm] open val [cause](index.md#-1836236043%2FProperties%2F971615585): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?   <br>|
| <a name="com.tezro.api.core.client.responses/Error/message/#/PointingToDeclaration/"></a>[message](message.md)| <a name="com.tezro.api.core.client.responses/Error/message/#/PointingToDeclaration/"></a> [jvm] open override val [message](message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Error message returned by the server   <br>|
| <a name="com.tezro.api.core.client.responses/Error/statusCode/#/PointingToDeclaration/"></a>[statusCode](status-code.md)| <a name="com.tezro.api.core.client.responses/Error/statusCode/#/PointingToDeclaration/"></a> [jvm] val [statusCode](status-code.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Status code of the response   <br>|

