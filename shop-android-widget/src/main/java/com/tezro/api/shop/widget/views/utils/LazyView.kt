package com.tezro.api.shop.widget.views.utils

import android.view.View
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

internal class LazyView<T : View>(private val viewId: Int) : ReadWriteProperty<View, T> {

    private var view: T? = null

    override fun getValue(thisRef: View, property: KProperty<*>): T {
        if (this.view == null) {
            this.view = thisRef.findViewById(viewId)
        }

        return view!!
    }

    override fun setValue(thisRef: View, property: KProperty<*>, value: T) {
        this.view = value
    }

}