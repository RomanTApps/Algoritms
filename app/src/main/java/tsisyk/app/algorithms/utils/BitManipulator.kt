package tsisyk.app.algorithms.utils

class BitManipulator {
    fun countSetBits(n: Int): Int {
        var count = 0
        var number = n
        while (number != 0) {
            count += number and 1
            number = number shr 1
        }
        return count
    }

    fun toggleBits(n: Int): Int = n.inv()
}