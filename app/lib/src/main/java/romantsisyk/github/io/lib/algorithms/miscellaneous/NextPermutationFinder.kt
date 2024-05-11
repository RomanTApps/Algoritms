package romantsisyk.github.io.lib.algorithms.miscellaneous

class NextPermutationFinder {
    fun nextPermutation(array: IntArray): Boolean {
        var i = array.size - 2
        while (i >= 0 && array[i] >= array[i + 1]) i--
        if (i == -1) return false  // No next permutation

        var j = array.size - 1
        while (array[j] <= array[i]) j--
        swap(array, i, j)

        var k = i + 1
        var l = array.size - 1
        while (k < l) {
            swap(array, k, l)
            k++
            l--
        }
        return true
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}
