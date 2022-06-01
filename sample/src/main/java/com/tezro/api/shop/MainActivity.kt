package com.tezro.api.shop

import android.app.Activity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import com.tezro.api.R
import com.tezro.api.shop.model.common.Attribute
import com.tezro.api.shop.model.common.Error
import com.tezro.api.shop.model.orders.Order
import com.tezro.api.shop.widget.views.TezroPayButton
import java.util.*

class MainActivity : Activity(), TezroPayButton.TezroPayButtonDelegate {

    private lateinit var tezroPayButton: TezroPayButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tezroPayButton = findViewById(R.id.btnTezroPay)
        tezroPayButton.delegate = this
        tezroPayButton.buttonLabel = "1 USD"


        val redirectEnabled: Switch = findViewById(R.id.switchAutoRedirectEnabled)
        tezroPayButton.isAutomaticRedirectEnabled = redirectEnabled.isChecked
        redirectEnabled.setOnCheckedChangeListener { _, isChecked ->
            tezroPayButton.isAutomaticRedirectEnabled = isChecked
        }

        val qrEnabled: Switch = findViewById(R.id.switchQREnabled)
        tezroPayButton.isQRCodeEnabled = qrEnabled.isChecked
        qrEnabled.setOnCheckedChangeListener { _, isChecked ->
            tezroPayButton.isQRCodeEnabled = isChecked
        }

        val silentUpdates: Switch = findViewById(R.id.switchSilentUpdates)
        tezroPayButton.isSilentUpdate = silentUpdates.isChecked
        silentUpdates.setOnCheckedChangeListener { _, isChecked ->
            tezroPayButton.isSilentUpdate = isChecked
        }
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
            // TODO: put your confirmAmountUrl here
            "https://dev-openapi.tezro.com/api/v1/webhook?amountItems=1&amountShipping=1&amountTotal=1",
            Date(System.currentTimeMillis() + 100000),
            listOf("https://prod-buydo.oss-accelerate.aliyuncs.com/9a537dfd2e9a493f8fef4d35d119a43b.jpg"),
            listOf(Attribute("Test", "123"))
        )
    }

    override fun onNewOrderDataLoaded(order: Order) {
        Toast.makeText(this, "status: ${order.status}", Toast.LENGTH_SHORT).show()
    }

    override fun onLoadingOrderError(error: Error) {
        Toast.makeText(this, "order loading error: $error", Toast.LENGTH_SHORT).show()
    }

}
