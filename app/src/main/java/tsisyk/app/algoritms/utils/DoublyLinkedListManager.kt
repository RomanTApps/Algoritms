package tsisyk.app.algoritms.utils

class DoublyLinkedListManager<T> {
    data class Node<T>(var value: T, var prev: Node<T>? = null, var next: Node<T>? = null)

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun insertAtFront(value: T) {
        val newNode = Node(value, next = head)
        if (head != null) {
            head!!.prev = newNode
        } else {
            tail = newNode
        }
        head = newNode
    }

    fun insertAtEnd(value: T) {
        if (tail == null) {
            insertAtFront(value)
            return
        }
        val newNode = Node(value, prev = tail)
        tail!!.next = newNode
        tail = newNode
    }

    fun remove(value: T) {
        var current = head
        while (current != null) {
            if (current.value == value) {
                if (current.prev != null) {
                    current.prev!!.next = current.next
                } else {
                    head = current.next
                }
                if (current.next != null) {
                    current.next!!.prev = current.prev
                } else {
                    tail = current.prev
                }
                return
            }
            current = current.next
        }
    }

    fun displayForward(): List<T> {
        val result = mutableListOf<T>()
        var current = head
        while (current != null) {
            result.add(current.value)
            current = current.next
        }
        return result
    }

    fun displayBackward(): List<T> {
        val result = mutableListOf<T>()
        var current = tail
        while (current != null) {
            result.add(current.value)
            current = current.prev
        }
        return result
    }
}
