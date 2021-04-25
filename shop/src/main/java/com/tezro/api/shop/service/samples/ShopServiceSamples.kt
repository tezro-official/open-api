package com.tezro.api.shop.service.samples

import com.tezro.api.shop.model.Pagination
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.service.IShopService


internal class ShopServiceSamples(private val shopService: IShopService) {

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


    fun getOrder() {
        //The id of the order to be queried
        val orderId = "#@#KDsdkwo1231-asdklasdlqw"

        //Eos name of your shop, can be retrieved from Tezro app
        val eosName = "e.wewsd213"

        //Make a request through shopsService
        shopService.getOrder(
            eosName,
            orderId
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