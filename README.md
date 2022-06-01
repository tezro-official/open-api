# Tezro OpenApi for JVM and Android
This repository contains the JVM implementation of Tezro OpenApi.
It offers an easy and simple integration with your app.

It also has a support for android. Check the sample app for usage examples.

## Getting Started

After creating an account in [**Tezro**](https://tezro.com/), you will be able to create and external shop through **Settings -> External Shop**.

You will get your own `KeyId` and `Secret` that you will be using inside your app.
If you are willing to make only public requests such as creating orders, getting a specific order data.. You only need a `KeyId` (Recommended for a client apps such as android or desktop).

For a detailed information on how to get your keys please visit our registration instruction below:

[**Registration**](./instructions/registration/registration.md)

## Installation

Our library is published to `mavenCentral`, so you need to include this repository in your project.

**Gradle**
```groovy
dependencies {
    implementation 'com.tezro.api:shop:1.0.0-beta01'
    //Include if you are willing to use our android ready-views
    implementation 'com.tezro.api:shop-android-widget:1.0.0-beta01'
}
```

**Maven**
```xml
<dependency>
    <groupId>com.tezro.api</groupId>
    <artifactId>shop</artifactId>
    <version>1.0.0-beta01</version>
</dependency>
<dependency>
    <groupId>com.tezro.api</groupId>
    <artifactId>shop-android-widget</artifactId>
    <version>1.0.0-beta01</version>
</dependency>
```

## Usage
For more information on how to use the api, please visit the instruction pages below:

[**Android**](./instructions/usage/shop-widget-usage.md)

[**JVM (Desktop/Backend)**](./instructions/usage/shop-usage.md)

### Documentations
For a detailed information about methods and objects, please visit our documentation pages below:

[**Android**](./docs/shop-android-widget/index.md)

[**JVM (Desktop/Backend)**](./docs/shop/index.md)
