package romantsisyk.github.io.lib.algorithms.data_structures

class HeapManager {
    private val heap = mutableListOf<Int>()

    private fun getParentIndex(i: Int) = (i - 1) / 2
    private fun getLeftChildIndex(i: Int) = 2 * i + 1
    private fun getRightChildIndex(i: Int) = 2 * i + 2

    private fun hasParent(i: Int) = getParentIndex(i) >= 0
    private fun hasLeftChild(i: Int) = getLeftChildIndex(i) < heap.size
    private fun hasRightChild(i: Int) = getRightChildIndex(i) < heap.size

    private fun swap(i: Int, j: Int) {
        val temp = heap[i]
        heap[i] = heap[j]
        heap[j] = temp
    }

    fun insert(key: Int) {
        heap.add(key)
        heapifyUp(heap.size - 1)
    }

    private fun heapifyUp(index: Int) {
        var currentIndex = index
        while (hasParent(currentIndex) && heap[getParentIndex(currentIndex)] > heap[currentIndex]) {
            swap(getParentIndex(currentIndex), currentIndex)
            currentIndex = getParentIndex(currentIndex)
        }
    }

    fun extractMin(): Int? {
        if (heap.isEmpty()) return null
        val min = heap[0]
        heap[0] = heap.last()
        heap.removeAt(heap.size - 1)
        heapifyDown(0)
        return min
    }

    private fun heapifyDown(index: Int) {
        var currentIndex = index
        while (hasLeftChild(currentIndex)) {
            var smallerChildIndex = getLeftChildIndex(currentIndex)
            if (hasRightChild(currentIndex) && heap[getRightChildIndex(currentIndex)] < heap[smallerChildIndex]) {
                smallerChildIndex = getRightChildIndex(currentIndex)
            }

            if (heap[currentIndex] < heap[smallerChildIndex]) {
                break
            } else {
                swap(currentIndex, smallerChildIndex)
            }
            currentIndex = smallerChildIndex
        }
    }
}
