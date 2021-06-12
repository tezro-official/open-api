# Usage - Android Widget

Before using this library you have to initialize it using your `KeyId`.

Initialization needs to happen only onces during your application's lifetime:
```kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ShopWidget.init(keyId = "your-key-id-goes-here", isTestMode = true)
    }
}
```

`isTestMode` indicates whether to use development or production API. To get a development `keyId` you need to download Tezro-dev version and retrieve them from there.

Integrating `TezroPayButton` to your view:
```xml
<com.tezro.api.shop.widget.views.TezroPayButton
    android:id="@+id/btnTezroPay"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
```

Customize the button (currently only through code, xml attributes will be available in future updates):
```kotlin
tezroPayButton.apply {
    buttonLabel = "1 USD"
    isAutomaticRedirectEnabled = true
    isQRCodeEnabled = false
    isSilentUpdate = false
    paymentQRLabel = "Scan this QR and pay!"
}
```

Follow this [**Link**](../../docs/shop-android-widget/shop-android-widget/com.tezro.api.shop.widget.views/-tezro-pay-button/index.md) to read more about these properties

Implement `TezroPayButton.TezroPayButtonDelegate` to listen to events:
```kotlin
override fun onRequestOrderInit() {
    //Indicates that user has clicked but no order data was provided
    tezroPayButton.initOrder(
        orderId = UUID.randomUUID().toString(),
        name = "Test order ${Random().nextInt()}",
        amount = "1",
        currency = Order.Currency.USD,
        confirmAmountUrl = "https://www.google.com",
        expiryDate = Date(System.currentTimeMillis() + 100000),
        photos = listOf("https://prod-buydo.oss-accelerate.aliyuncs.com/9a537dfd2e9a493f8fef4d35d119a43b.jpg"),
        attributes = listOf(Attribute("Color", "Red"))
    )
}

override fun onLoadingOrderStart() {
    //Called after `tezroPayButton.initOrder`, indicates that loading order has started
    showToast("Creating order...")
}

override fun onNewOrderDataLoaded(order: Order) {
    //Called when loading order finishes, this is a suitable place to check for new status
    when(order.status) {
        Order.Status.CREATED -> TODO()
        Order.Status.EXPIRED -> TODO()
        Order.Status.ADDRESS_CONFIRMED -> TODO()
        Order.Status.CONFIRMED -> TODO()
        Order.Status.DELIVERED -> TODO()
        Order.Status.RECEIVED -> TODO()
        Order.Status.DISPUTED -> TODO()
    }
}

override fun onLoadingOrderError(error: Error) {
    //Called when loading order fails, show error to the users
    showToast("Something went wrong $error...")
}
```

Assign it to your button using:
```kotlin
tezroPayButton.delegate = myDelegateImplementation
```

To update button data when users come back to your app, call this in your `onResume`:
```kotlin
override fun onResume() {
    super.onResume()
    tezroPayButton.updateOrder()
}
```

You can manually set orders to this button using:
```kotlin
tezroPayButton.order = myOrder
```
This is suitable if you want load your data using our JVM implementation while respecting your architecture rules.

`TezroPayButton` is an open class, all methods and properties are open so you can extend it and customize it the way it suits you.
```kotlin
class CustomTezroButton(
    context: Context,
    attributeSet: AttributeSet
) : TezroPayButton(context, attributeSet) {
   ... 
}
```

`TezroPayButton` uses XML resources for styles, colors and size. You can override these resources to customize your button within your resources.