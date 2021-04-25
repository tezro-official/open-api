//[shop](../../../index.md)/[com.tezro.api.shop.model.orders](../index.md)/[Order](index.md)



# Order  
 [jvm] data class [Order](index.md)

Contains detailed information about order

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.address.Address](../../com.tezro.api.shop.model.orders.address/-address/index.md)| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>[com.tezro.api.shop.model.orders.Order.Currency](-currency/index.md)| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>id| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Order's id<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>status| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Current status of the order<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>amount| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Item's amount<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>shippingAmount| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Shipping amount<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>totalAmount| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Sum of item and shipping amounts<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>eosName| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Shop's eos account name<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>currency| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Payment currency<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>expiryDate| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>ISO8601 DateTime string. If not provided by shop, will be expired in 1 hour after order created<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>paymentLink| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>The link that will open Tezro app for payment transaction<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>address| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Delivery address. Available after confirming address by the customer<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>transactionId| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Id of payment transaction. Available after confirming order by the customer<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>amountConfirmationUrl| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Url for confirming delivery address<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>customerFullName| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>First and Last name of the customer<br><br>|
| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a>customerPhoneNumber| <a name="com.tezro.api.shop.model.orders/Order///PointingToDeclaration/"></a><br><br>Phone number of the customer<br><br>|
  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.model.orders/Order.Currency///PointingToDeclaration/"></a>[Currency](-currency/index.md)| <a name="com.tezro.api.shop.model.orders/Order.Currency///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>enum [Currency](-currency/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Order.Currency](-currency/index.md)>   <br>More info  <br>Indicates the currency of an order.  <br><br><br>|
| <a name="com.tezro.api.shop.model.orders/Order.Status///PointingToDeclaration/"></a>[Status](-status/index.md)| <a name="com.tezro.api.shop.model.orders/Order.Status///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>enum [Status](-status/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Order.Status](-status/index.md)>   <br>More info  <br>Indicates the current status of an order.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.tezro.api.shop.model.orders/Order/address/#/PointingToDeclaration/"></a>[address](address.md)| <a name="com.tezro.api.shop.model.orders/Order/address/#/PointingToDeclaration/"></a> [jvm] val [address](address.md): [Address](../../com.tezro.api.shop.model.orders.address/-address/index.md)?Delivery address.   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/amount/#/PointingToDeclaration/"></a>[amount](amount.md)| <a name="com.tezro.api.shop.model.orders/Order/amount/#/PointingToDeclaration/"></a> [jvm] val [amount](amount.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Item's amount   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/amountConfirmationUrl/#/PointingToDeclaration/"></a>[amountConfirmationUrl](amount-confirmation-url.md)| <a name="com.tezro.api.shop.model.orders/Order/amountConfirmationUrl/#/PointingToDeclaration/"></a> [jvm] val [amountConfirmationUrl](amount-confirmation-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Url for confirming delivery address   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/currency/#/PointingToDeclaration/"></a>[currency](currency.md)| <a name="com.tezro.api.shop.model.orders/Order/currency/#/PointingToDeclaration/"></a> [jvm] val [currency](currency.md): [Order.Currency](-currency/index.md)Payment currency   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/customerFullName/#/PointingToDeclaration/"></a>[customerFullName](customer-full-name.md)| <a name="com.tezro.api.shop.model.orders/Order/customerFullName/#/PointingToDeclaration/"></a> [jvm] val [customerFullName](customer-full-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)First and Last name of the customer   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/customerPhoneNumber/#/PointingToDeclaration/"></a>[customerPhoneNumber](customer-phone-number.md)| <a name="com.tezro.api.shop.model.orders/Order/customerPhoneNumber/#/PointingToDeclaration/"></a> [jvm] val [customerPhoneNumber](customer-phone-number.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?Phone number of the customer   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/eosName/#/PointingToDeclaration/"></a>[eosName](eos-name.md)| <a name="com.tezro.api.shop.model.orders/Order/eosName/#/PointingToDeclaration/"></a> [jvm] val [eosName](eos-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Shop's eos account name   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/expiryDate/#/PointingToDeclaration/"></a>[expiryDate](expiry-date.md)| <a name="com.tezro.api.shop.model.orders/Order/expiryDate/#/PointingToDeclaration/"></a> [jvm] val [expiryDate](expiry-date.md): [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)ISO8601 DateTime string.   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/id/#/PointingToDeclaration/"></a>[id](id.md)| <a name="com.tezro.api.shop.model.orders/Order/id/#/PointingToDeclaration/"></a> [jvm] val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Order's id   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/paymentLink/#/PointingToDeclaration/"></a>[paymentLink](payment-link.md)| <a name="com.tezro.api.shop.model.orders/Order/paymentLink/#/PointingToDeclaration/"></a> [jvm] val [paymentLink](payment-link.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The link that will open Tezro app for payment transaction   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/shippingAmount/#/PointingToDeclaration/"></a>[shippingAmount](shipping-amount.md)| <a name="com.tezro.api.shop.model.orders/Order/shippingAmount/#/PointingToDeclaration/"></a> [jvm] val [shippingAmount](shipping-amount.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?Shipping amount   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/status/#/PointingToDeclaration/"></a>[status](status.md)| <a name="com.tezro.api.shop.model.orders/Order/status/#/PointingToDeclaration/"></a> [jvm] val [status](status.md): [Order.Status](-status/index.md)Current status of the order   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/totalAmount/#/PointingToDeclaration/"></a>[totalAmount](total-amount.md)| <a name="com.tezro.api.shop.model.orders/Order/totalAmount/#/PointingToDeclaration/"></a> [jvm] val [totalAmount](total-amount.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Sum of item and shipping amounts   <br>|
| <a name="com.tezro.api.shop.model.orders/Order/transactionId/#/PointingToDeclaration/"></a>[transactionId](transaction-id.md)| <a name="com.tezro.api.shop.model.orders/Order/transactionId/#/PointingToDeclaration/"></a> [jvm] val [transactionId](transaction-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?Id of payment transaction.   <br>|

