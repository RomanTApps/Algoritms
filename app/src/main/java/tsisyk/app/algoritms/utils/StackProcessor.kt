package tsisyk.app.algoritms.utils

class StackProcessor<T> {
    private val stack = mutableListOf<T>()

    fun push(item: T) = stack.add(item)

    fun pop(): T? = if (stack.isNotEmpty()) stack.removeAt(stack.size - 1) else null

    fun peek(): T? = stack.lastOrNull()

    fun isEmpty() = stack.isEmpty()
}