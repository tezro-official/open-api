package com.tezro.api.shop

import com.tezro.api.shop.model.Pagination
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.providers.TezroShop
import com.tezro.api.shop.service.IShopService
import org.junit.Test
import java.util.*


internal class ShopServiceSamples {

    private val shopService: IShopService = TezroShop.initShopService(
        "",
        "",
        "",
        "",
        true
    )

    @Test
    fun getOrdersPage() {
        //How many elements to query
        val pageSize = 50L

        //How many elements to skip
        var skippedElementsCount = 0L

        //Indicates whether this is the last page or not
        var allData = false

        //Make a request through shopsService
        shopService.getOrders(
            offset = skippedElementsCount,
            limit = pageSize,
            direction = Pagination.Direction.ASCENDING,
            status = Order.Status.CREATED
        ).setSuccessListener { ordersPage ->
            //Do something with ordersPage
            //...

            //Example:
            //Check if this is the last page of data
            allData = !ordersPage.pagination.hasNext

            //Update how many elements to skip
            skippedElementsCount += ordersPage.pagination.count
        }.setErrorListener { error ->
            //Handle request error
            print("Error loading orders page: ${error.message} with code ${error.statusCode}")
        }.enqueue()
    }


    @Test
    fun initOrder() {
        //The id of the order to be created
        val orderId = UUID.randomUUID().toString()

        //The amount to be payed by the customer
        val amount = "5.99"

        //The currency of the payment
        val currency = Order.Currency.USD

        //The url that will receive a POST request by Tezro Open-Api when payment is confirmed
        val confirmAmountUrl = "https://test.mybackend.me/tezro/confirmAmount"

        //Order expiry calendar
        val expiryDateCalendar = Calendar.getInstance().apply {
            //Expire after 23 hours from now
            add(Calendar.HOUR, 23)
        }

        //Order expiry date
        val expiryDate = expiryDateCalendar.time

        //Make a request through shopsService
        shopService.createOrder(
            orderId,
            amount,
            currency,
            confirmAmountUrl,
            expiryDate
        ).setSuccessListener { order ->
            //Do something with order
            //...

            //Example:
            //Check the current status of this order
            when (order.status) {
                //If the status is created, it means that the payment is not yet sent by the customer
                Order.Status.CREATED -> {
                    print("Order waiting for payment")

                    //Show payment link to the users in order to open Tezro app for payment
                    print("Click on ${order.paymentLink} to pay through Tezro")
                }

                //If the status is confirmed, it means that the payment was successful
                Order.Status.CONFIRMED -> {
                    print("Payment was successful!")
                }

                //Else, do something, for example print the current status
                else -> {
                    print("Current status: ${order.status.name}")
                }
            }

        }.setErrorListener { error ->
            //Handle request error
            print("Error loading order: ${error.message} with code ${error.statusCode}")
        }.enqueue()
    }


    @Test
    fun getOrder() {
        //The id of the order to be queried
        val orderId = "#@#KDsdkwo1231-asdklasdlqw"

        //Make a request through shopsService
        shopService.getOrder(orderId).setSuccessListener { order ->
            //Do something with order
            //...

            //Example:
            //Check the current status of this order
            when (order.status) {
                //If the status is created, it means that the payment is not yet sent by the customer
                Order.Status.CREATED -> {
                    print("Order waiting for payment")

                    //Show payment link to the users in order to open Tezro app for payment
                    print("Click on ${order.paymentLink} to pay through Tezro")
                }

                //If the status is confirmed, it means that the payment was successful
                Order.Status.CONFIRMED -> {
                    print("Payment was successful!")
                }

                //Else, do something, for example print the current status
                else -> {
                    print("Current status: ${order.status.name}")
                }
            }
        }.setErrorListener { error ->
            //Handle request error
            print("Error loading order: ${error.message} with code ${error.statusCode}")
        }.enqueue()
    }


    @Test
    fun sendMessageToCustomer() {
        //The id of the order to which this message will be attached
        val orderId = "#@#KDsdkwo1231-asdklasdlqw"

        //Your message to the customer
        val message = "Your order is being processed"

        //Make a request through shopsService
        shopService.sendMessage(
            orderId,
            message
        ).setSuccessListener { simpleResponse ->
            //Message was successfully sent, show success
            print("Success!")
        }.setErrorListener { error ->
            //Handle request error
            print("Error sending message: ${error.message} with code ${error.statusCode}")
        }.enqueue()
    }


    @Test
    fun confirmOrderDelivery() {
        //The id of the order that was shipped
        val orderId = "#@#KDsdkwo1231-asdklasdlqw"

        //Make a request through shopsService
        shopService.confirmDelivery(orderId).setSuccessListener { simpleResponse ->
            //Order's status was successfully updated, show success
            print("Success!")
        }.setErrorListener { error ->
            //Handle request error
            print("Error sending message: ${error.message} with code ${error.statusCode}")
        }.enqueue()
    }


}