package romantsisyk.github.io.lib.algorithms.data_structures

class ArrayResizer {
    inline fun <reified T> resizeArray(original: Array<T>, newSize: Int, fillValue: T? = null): Array<T?> {
        return Array(newSize) { index ->
            if (index < original.size) original[index] else fillValue
        }
    }
}
