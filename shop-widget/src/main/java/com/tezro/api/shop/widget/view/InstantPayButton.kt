package com.tezro.api.shop.widget.view

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
import com.tezro.api.shop.widget.R

open class InstantPayButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.style.Widget_MaterialComponents_Button
) : MaterialButton(context, attrs, defStyleAttr) {

    fun setClickListener(onClick: () -> String) {

    }

}