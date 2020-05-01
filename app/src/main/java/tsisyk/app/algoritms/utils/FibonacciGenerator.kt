package tsisyk.app.algoritms.utils

class FibonacciGenerator {
    fun generateFibonacci(n: Int): List<Int> {
        val series = mutableListOf(0, 1)
        for (i in 2 until n) {
            series.add(series[i - 1] + series[i - 2])
        }
        return series
    }
}