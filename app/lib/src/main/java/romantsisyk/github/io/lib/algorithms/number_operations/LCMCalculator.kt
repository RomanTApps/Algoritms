package romantsisyk.github.io.lib.algorithms.number_operations

class LCMCalculator {
    fun computeLCM(a: Int, b: Int): Int {
        fun gcd(x: Int, y: Int): Int {
            if (y == 0) return x
            return gcd(y, x % y)
        }
        return a * (b / gcd(a, b))
    }
}
