package romantsisyk.github.io.lib.algorithms.data_manipulation

class MatrixOperations {
    fun addMatrices(m1: Array<Array<Int>>, m2: Array<Array<Int>>): Array<Array<Int>> {
        return Array(m1.size) { i ->
            Array(m1[0].size) { j ->
                m1[i][j] + m2[i][j]
            }
        }
    }

    fun multiplyMatrices(m1: Array<Array<Int>>, m2: Array<Array<Int>>): Array<Array<Int>> {
        val result = Array(m1.size) { Array(m2[0].size) { 0 } }
        for (i in m1.indices) {
            for (j in m2[0].indices) {
                for (k in m1[0].indices) {
                    result[i][j] += m1[i][k] * m2[k][j]
                }
            }
        }
        return result
    }
}