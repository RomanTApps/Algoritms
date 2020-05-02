package tsisyk.app.algoritms.utils

class FactorialCalculator {
    fun factorial(n: Int): Long {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }
}