package tsisyk.app.algorithms.utils

class BaseConverter {
    fun toBinary(n: Int): String = n.toString(2)

    fun fromBinary(binaryStr: String): Int = binaryStr.toInt(2)

    fun toHexadecimal(n: Int): String = n.toString(16).toUpperCase()

    fun fromHexadecimal(hexStr: String): Int = hexStr.toInt(16)
}