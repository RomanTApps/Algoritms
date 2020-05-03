package tsisyk.app.algoritms.utils

import java.util.LinkedList
import java.util.Queue
import java.util.Stack

class GraphTraversals {
    fun bfs(graph: Map<Int, List<Int>>, start: Int): List<Int> {
        val visited = mutableListOf<Int>()
        val queue: Queue<Int> = LinkedList()
        queue.add(start)
        while (queue.isNotEmpty()) {
            val vertex = queue.poll()
            if (vertex !in visited) {
                visited.add(vertex)
                queue.addAll(graph[vertex] ?: listOf())
            }
        }
        return visited
    }

    fun dfs(graph: Map<Int, List<Int>>, start: Int): List<Int> {
        val visited = mutableListOf<Int>()
        val stack: Stack<Int> = Stack()
        stack.push(start)
        while (stack.isNotEmpty()) {
            val vertex = stack.pop()
            if (vertex !in visited) {
                visited.add(vertex)
                graph[vertex]?.reversed()?.forEach { stack.push(it) }
            }
        }
        return visited
    }
}