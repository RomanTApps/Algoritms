package romantsisyk.github.io.lib.algorithms.algorithms

class KadaneAlgorithm {
    fun findMaxSubArraySum(array: IntArray): Int {
        var maxCurrent = array[0]
        var maxGlobal = array[0]
        for (i in 1 until array.size) {
            maxCurrent = maxOf(array[i], maxCurrent + array[i])
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent
            }
        }
        return maxGlobal
    }
}
