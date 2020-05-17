package tsisyk.app.algorithms.utils

class CombinationGenerator {
    fun <T> generateCombinations(list: List<T>, size: Int): List<List<T>> {
        if (size == 0) return listOf(listOf())
        if (list.isEmpty()) return listOf()
        val first = list.first()
        val rest = generateCombinations(list.drop(1), size - 1).map { it + first }
        return generateCombinations(list.drop(1), size) + rest
    }
}