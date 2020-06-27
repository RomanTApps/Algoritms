package tsisyk.app.algorithms.utils

class MinMaxFinder {
    fun findMinMax(values: List<Int>): Pair<Int, Int> {
        if (values.isEmpty()) throw IllegalArgumentException("The list cannot be empty")
        var min = values[0]
        var max = values[0]
        for (value in values) {
            if (value < min) min = value
            if (value > max) max = value
        }
        return Pair(min, max)
    }
}
