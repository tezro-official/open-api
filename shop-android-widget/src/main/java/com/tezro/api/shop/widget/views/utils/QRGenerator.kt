package com.tezro.api.shop.widget.views.utils

import android.graphics.Bitmap
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder


internal object QRGenerator {

    fun generateQRFromString(string: String): Bitmap {
        val barcodeEncoder = BarcodeEncoder()
        return barcodeEncoder.encodeBitmap(string, BarcodeFormat.QR_CODE, 400, 400)
    }

}