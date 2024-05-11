package romantsisyk.github.io.lib.algorithms.data_manipulation

class DataSorter {
    fun <T : Comparable<T>> bubbleSort(list: MutableList<T>): List<T> {
        var n = list.size
        do {
            var swapped = false
            for (i in 1 until n) {
                if (list[i - 1] > list[i]) {
                    list[i - 1] = list[i].also { list[i] = list[i - 1] }
                    swapped = true
                }
            }
            n--
        } while (swapped)
        return list
    }
}
