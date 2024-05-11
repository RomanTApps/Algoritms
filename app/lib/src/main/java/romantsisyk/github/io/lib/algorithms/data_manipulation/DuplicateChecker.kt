package romantsisyk.github.io.lib.algorithms.data_manipulation

class DuplicateChecker {
    fun <T> hasDuplicates(elements: List<T>): Boolean {
        val set = mutableSetOf<T>()
        for (element in elements) {
            if (element in set) return true
            set.add(element)
        }
        return false
    }
}
