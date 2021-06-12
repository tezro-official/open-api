# Usage - JVM (Desktop/Backend)
Before using this library you have to initialize it using your `KeyId` and `Secret` if you are willing to call private methods.

Create a new instance of shop service:
```kotlin
val shopService = Shop.initShopService(
    keyId = "your-key-id-goes-here",
    secret = "your_secret_goes_here",
    isTestMode = true
)
```

`isTestMode` indicates whether to use development or production API. To get a development `keyId` and `secret` you need to download Tezro-dev version and retrieve them from there.

`initShopService` will always give you a new instance of `IShopService`. Creating a new instance might not be cheap so it is recommended to implement singleton pattern.

Once you create an instance of the service, you can call any method depending on the access level you provide `(KeyId + Secret = Full Access`.

Here's an example of creating a new order:
```kotlin
//Create a request
val request = shopService.createOrder(
    orderId = UUID.randomUUID().toString(),
    name = "Test order ${Random().nextInt()}",
    amount = "1",
    currency = Order.Currency.USD,
    confirmAmountUrl = "https://www.google.com",
    expiryDate = Date(System.currentTimeMillis() + 100000),
    photos = listOf("https://prod-buydo.oss-accelerate.aliyuncs.com/9a537dfd2e9a493f8fef4d35d119a43b.jpg"),
    attributes = listOf(Attribute("Color", "Red"))
)
        
//Set up listeners to your request and enqueue it        
request.setSuccessListener { order ->  
    //Handle your new order
}.setErrorListener { error ->  
    //Handle errors
}.enqueue()

//To cancel your request call
request.cancel()
```

The request will run on a background thread, so no need to worry about blocking the current thread.
Follow this **[Link](../../docs/shop/shop/com.tezro.api.shop.service/-i-shop-service/index.md)** to check all methods that you can call through this service.
