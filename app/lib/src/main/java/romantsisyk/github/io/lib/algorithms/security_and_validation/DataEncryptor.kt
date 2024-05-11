package romantsisyk.github.io.lib.algorithms.security_and_validation

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

class DataEncryptor {
    private val key = "mySuperSecretKey".toByteArray()
    private val cipher = Cipher.getInstance("AES")

    fun encrypt(data: String): ByteArray {
        cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(key, "AES"))
        return cipher.doFinal(data.toByteArray())
    }

    fun decrypt(data: ByteArray): String {
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"))
        return String(cipher.doFinal(data))
    }
}
