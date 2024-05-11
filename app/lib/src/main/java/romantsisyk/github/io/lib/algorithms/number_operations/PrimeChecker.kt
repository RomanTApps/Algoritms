package romantsisyk.github.io.lib.algorithms.number_operations

class PrimeChecker {
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}