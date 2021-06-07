package com.tezro.api.shop

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.tezro.api.R
import com.tezro.api.shop.widget.views.TezroPayButton
import com.tezro.api.core.client.responses.Error
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.orders.Order
import java.util.*

class MainActivity : Activity(), TezroPayButton.TezroPayButtonDelegate {

    private lateinit var tezroPayButton: TezroPayButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tezroPayButton = findViewById(R.id.btnTezroPay)
        tezroPayButton.delegate = this
        tezroPayButton.buttonLabel = "1 USD"
    }

    override fun onResume() {
        super.onResume()
        tezroPayButton.updateOrder()
    }

    override fun onRequestOrderInit() {
        Toast.makeText(this, "creating order", Toast.LENGTH_SHORT).show()
        tezroPayButton.initOrder(
            UUID.randomUUID().toString(),
            "Test order ${Random().nextInt()}",
            "1",
            Order.Currency.USD,
            "https://www.google.com",
            Date(System.currentTimeMillis() + 100000),
            listOf("https://prod-buydo.oss-accelerate.aliyuncs.com/9a537dfd2e9a493f8fef4d35d119a43b.jpg"),
            listOf(Attribute("Test", "123"))
        )
    }

    override fun onLoadingOrderStart() {
        Toast.makeText(this, "loading order", Toast.LENGTH_SHORT).show()
    }

    override fun onLoadingOrderEnd(order: Order) {
        Toast.makeText(this, "order loading finish with status: ${order.status}", Toast.LENGTH_SHORT).show()

    }

    override fun onLoadingOrderError(error: Error) {
        Toast.makeText(this, "order loading error: $error", Toast.LENGTH_SHORT).show()
    }

}
