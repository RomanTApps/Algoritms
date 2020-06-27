package tsisyk.app.algorithms.utils

class HistogramGenerator {
    fun generateHistogram(data: List<Int>): Map<Int, Int> {
        val histogram = mutableMapOf<Int, Int>()
        for (value in data) {
            histogram[value] = histogram.getOrDefault(value, 0) + 1
        }
        return histogram
    }
}
