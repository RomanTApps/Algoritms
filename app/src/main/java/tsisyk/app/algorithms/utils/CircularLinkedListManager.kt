package tsisyk.app.algorithms.utils

class CircularLinkedListManager<T> {
    data class Node<T>(var value: T, var next: Node<T>? = null)

    private var tail: Node<T>? = null

    fun insert(value: T) {
        val newNode = Node(value)
        if (tail == null) {
            tail = newNode
            newNode.next = newNode
        } else {
            newNode.next = tail!!.next
            tail!!.next = newNode
            tail = newNode
        }
    }

    fun remove(value: T) {
        if (tail == null) return

        var current = tail
        while (current!!.next != tail) {
            if (current.next!!.value == value) {
                current.next = current.next!!.next
                return
            }
            current = current.next
        }
        if (current.next!!.value == value) {
            if (current.next == tail) {
                if (current == tail) {
                    tail = null
                } else {
                    current.next = tail!!.next
                    tail = current
                }
            }
        }
    }

    fun display(): List<T> {
        val result = mutableListOf<T>()
        if (tail != null) {
            var current = tail!!.next
            do {
                result.add(current!!.value)
                current = current.next
            } while (current != tail!!.next)
        }
        return result
    }
}
