package romantsisyk.github.io.lib.algorithms.number_operations

class RomanConverter {
    fun toRoman(num: Int): String {
        val numbers = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romans = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        var number = num
        val roman = StringBuilder()

        for ((index, value) in numbers.withIndex()) {
            while (number >= value) {
                roman.append(romans[index])
                number -= value
            }
        }

        return roman.toString()
    }

    fun fromRoman(roman: String): Int {
        val values = mapOf('M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50, 'X' to 10, 'V' to 5, 'I' to 1)
        var total = 0
        var prevValue = 0

        for (char in roman.reversed()) {
            val value = values[char] ?: throw IllegalArgumentException("Invalid Roman numeral: $char")
            total += if (value < prevValue) -value else value
            prevValue = value
        }

        return total
    }
}
