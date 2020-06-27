package tsisyk.app.algorithms.utils

class TimeComplexityCalculator {
    fun calculateOperationsCount(operations: List<String>, n: Int): Map<String, Int> {
        return operations.map { op ->
            op to when (op) {
                "constant" -> 1
                "logarithmic" -> Math.log(n.toDouble()).toInt()
                "linear" -> n
                "quadratic" -> n * n
                "cubic" -> n * n * n
                "exponential" -> Math.pow(2.0, n.toDouble()).toInt()
                else -> throw IllegalArgumentException("Unknown operation type: $op")
            }
        }.toMap()
    }
}
