package com.tezro.api.shop.model.response.orders

import com.tezro.api.shop.model.response.orders.address.Address


/**
 * Contains detailed information about order
 *
 * @param id Order's id
 * @param status Current status of the order
 * @param amount Item's amount
 * @param shippingAmount Shipping amount
 * @param totalAmount Sum of item and shipping amounts
 * @param eosName Shop's eos account name
 * @param currency Payment currency
 * @param expiryDate ISO8601 DateTime string. If not provided by shop, will be expired in 1 hour after
 * order created
 * @param paymentLink The link that will open Tezro app for payment transaction
 * @param address Delivery address. Available after confirming address by the customer
 * @param transactionId Id of payment transaction. Available after confirming order by the customer
 * @param amountConfirmationUrl Url for confirming delivery address
 * @param customerFullName First and Last name of the customer
 * @param customerPhoneNumber Phone number of the customer
 *
 * @see Address
 * @see Currency
 */
data class Order internal constructor(
    val id: String,
    val status: Status,
    val amount: String,
    val shippingAmount: String?,
    val totalAmount: String,
    val eosName: String,
    val currency: Currency,
    val expiryDate: String,
    val paymentLink: String,
    val address: Address?,
    val transactionId: String?,
    val amountConfirmationUrl: String,
    val customerFullName: String,
    val customerPhoneNumber: String?
) {


    /**
     * Indicates the current status of an order.
     */
    enum class Status {

        /**
         * Indicates that the order was successfully created when user clicked to Pay button in
         * shop's site.
         */
        CREATED,


        /**
         * Indicates that the order has expired. If customer not payed order through escrow service
         * for the right time.
         */
        EXPIRED,


        /**
         * Indicates that the customer has entered order's delivery address in Tezro App.
         */
        ADDRESS_CONFIRMED,


        /**
         * Indicates that the customer has paid using escrow service in Tezro App.
         */
        CONFIRMED,


        /**
         *  Indicates that the shop has notified customer about successful delivery.
         */
        DELIVERED,


        /**
         * Indicates that the customer has confirmed delivery and unlocked payment. If not, payment
         * will be unlocked automatically in 45 days after delivery confirmation by shop.
         */
        RECEIVED,


        /**
         * Indicates that the customer has disputed order.
         */
        DISPUTED

    }


    /**
     * Indicates the currency of an order.
     */
    enum class Currency {

        /**
         * Ethereum currency symbol.
         */
        ETH,

        /**
         * Bitcoin currency symbol.
         */
        BTC,

        /**
         * Tether USD currency symbol.
         */
        USDT,

        /**
         * Tether EUR currency symbol.
         */
        EURT,

        /**
         * Tether CNH currency symbol
         */
        CNHT,

        /**
         * Tether Gold currency symbol
         */
        XAUT,

        /**
         * United States Dollar currency symbol
         */
        USD,

        /**
         * Euro currency symbol
         */
        EUR,

        /**
         * Chinese Yuan currency symbol
         */
        CNY

    }

}