package romantsisyk.github.io.lib.algorithms.text_processing

class PermutationGenerator {
    fun <T> generatePermutations(list: List<T>): List<List<T>> {
        if (list.size == 1) return listOf(list)
        val perms = mutableListOf<List<T>>()
        val sub = list[0]
        for (perm in generatePermutations(list.drop(1))) {
            for (i in 0..perm.size) {
                val newPerm = perm.toMutableList()
                newPerm.add(i, sub)
                perms.add(newPerm)
            }
        }
        return perms
    }
}