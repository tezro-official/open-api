//[shop-android-widget](../../../index.md)/[com.tezro.api.shop.widget.views](../index.md)/[TezroPayButton](index.md)/[isAutomaticRedirectEnabled](is-automatic-redirect-enabled.md)



# isAutomaticRedirectEnabled  
[androidJvm]  
Content  
open var [isAutomaticRedirectEnabled](is-automatic-redirect-enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true  
More info  


If set to false, users will have to click again on the button in order to be redirect to Tezro for payment process.



Be careful, users might think that your app is lagging if they click the first time and nothing happens, make sure to show some hints to users before using this flag.



Hint Example: The initial text of the button will be click to pay, when order is loaded, the text changes to the price and the currency. Users will notice that and click again to pay this sum.

  



