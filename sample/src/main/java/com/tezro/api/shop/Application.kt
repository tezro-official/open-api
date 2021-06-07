package com.tezro.api.shop

import android.app.Application
import com.tezro.api.shop.widget.core.ShopWidget

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        ShopWidget.init("47d5af68-0857-4856-a072-63fa53ea87f2", true)
    }
}