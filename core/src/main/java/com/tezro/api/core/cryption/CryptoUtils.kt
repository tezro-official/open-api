package com.tezro.api.core.cryption

import java.security.NoSuchAlgorithmException
import java.security.SignatureException
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

object CryptoUtils {

    private const val HMAC_SHA512 = "HmacSHA512"

    private fun toHexString(bytes: ByteArray): String? {
        val formatter = Formatter()
        for (b in bytes) {
            formatter.format("%02x", b)
        }
        return formatter.toString()
    }

    fun calculateHMAC(data: String, key: String): String? {
        val secretKeySpec = SecretKeySpec(key.toByteArray(), HMAC_SHA512)
        val mac: Mac = Mac.getInstance(HMAC_SHA512)
        mac.init(secretKeySpec)
        return toHexString(mac.doFinal(data.toByteArray()))
    }

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val hmac = calculateHMAC("data", "key")
        println(hmac)
    }
}