package tsisyk.app.algoritms.utils

import java.util.LinkedList

class QueueProcessor<T> {
    private val list = LinkedList<T>()

    fun enqueue(item: T) = list.addLast(item)

    fun dequeue(): T? = if (list.isEmpty()) null else list.removeFirst()

    fun peek(): T? = list.firstOrNull()

    fun isEmpty() = list.isEmpty()
}