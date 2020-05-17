package tsisyk.app.algorithms.utils

class CycleDetector {
    fun hasCycle(graph: Map<Int, List<Int>>): Boolean {
        val visited = mutableSetOf<Int>()
        val stack = mutableSetOf<Int>()

        fun dfs(v: Int): Boolean {
            if (v in stack) return true
            if (v in visited) return false

            visited.add(v)
            stack.add(v)
            graph[v]?.forEach {
                if (dfs(it)) return true
            }
            stack.remove(v)
            return false
        }

        return graph.keys.any { !visited.contains(it) && dfs(it) }
    }
}
