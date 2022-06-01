package com.tezro.api.shop

import android.app.Application
import com.tezro.api.shop.widget.core.ShopWidget

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        // TODO: put your key id here
        ShopWidget.init("<key_id>", true)
    }
}