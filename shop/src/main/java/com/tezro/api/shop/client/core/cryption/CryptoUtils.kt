package com.tezro.api.shop.client.core.cryption

import java.lang.StringBuilder
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

object CryptoUtils {

    private const val HMAC_ALGORITHM_NAME = "Hmac"

    fun ByteArray.toHexString(): String {
        val formatter = Formatter()
        for (b in this) formatter.format("%02x", b)
        return formatter.toString()
    }

    fun createHMACInstance(
            key: String,
            algorithm: String
    ): Mac {
        val algorithmName = algorithm.toUpperCase(Locale.ROOT)
        val algorithmFullName = StringBuilder().append(HMAC_ALGORITHM_NAME, algorithmName).toString()

        val keyBytes = key.toByteArray()
        val secretKeySpec = SecretKeySpec(keyBytes, algorithmFullName)
        val mac = Mac.getInstance(algorithmFullName)
        mac.init(secretKeySpec)
        return mac
    }

    fun calculateHexHMAC(
            data: String,
            key: String,
            algorithm: String,
    ): String {
        val mac = createHMACInstance(key, algorithm)
        val dataBytes = data.toByteArray()
        val encryptedData = mac.doFinal(dataBytes)
        return encryptedData.toHexString()
    }

    fun calculateHexHMAC(
            data: String,
            mac: Mac,
    ): String {
        mac.reset()

        val dataBytes = data.toByteArray()
        val encryptedData = mac.doFinal(dataBytes)
        return encryptedData.toHexString()
    }
}
