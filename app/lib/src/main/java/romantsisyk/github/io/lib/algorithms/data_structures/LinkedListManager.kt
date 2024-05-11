package romantsisyk.github.io.lib.algorithms.data_structures

class LinkedListManager<T> {
    data class Node<T>(var value: T, var next: romantsisyk.github.io.lib.algorithms.data_structures.LinkedListManager.Node<T>? = null)

    private var head: romantsisyk.github.io.lib.algorithms.data_structures.LinkedListManager.Node<T>? = null

    fun insert(value: T) {
        if (head == null) {
            head =
                romantsisyk.github.io.lib.algorithms.data_structures.LinkedListManager.Node(value)
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next =
                romantsisyk.github.io.lib.algorithms.data_structures.LinkedListManager.Node(value)
        }
    }

    fun remove(value: T) {
        if (head == null) return

        if (head?.value == value) {
            head = head?.next
            return
        }

        var current = head
        while (current?.next != null) {
            if (current.next?.value == value) {
                current.next = current.next?.next
                return
            }
            current = current.next
        }
    }

    fun find(value: T): romantsisyk.github.io.lib.algorithms.data_structures.LinkedListManager.Node<T>? {
        var current = head
        while (current != null) {
            if (current.value == value) {
                return current
            }
            current = current.next
        }
        return null
    }
}
