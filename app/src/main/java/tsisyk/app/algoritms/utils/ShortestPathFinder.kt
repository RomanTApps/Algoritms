package tsisyk.app.algoritms.utils

import java.util.PriorityQueue

class ShortestPathFinder {
    // Dijkstra's algorithm
    fun dijkstra(graph: Map<Int, List<Pair<Int, Int>>>, source: Int): Map<Int, Int> {
        val distances = mutableMapOf<Int, Int>().withDefault { Int.MAX_VALUE }
        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
        priorityQueue.add(Pair(source, 0))
        distances[source] = 0

        while (priorityQueue.isNotEmpty()) {
            val (u, distU) = priorityQueue.poll()
            if (distU > distances.getValue(u)) continue
            graph[u]?.forEach { (v, weight) ->
                val distV = distances.getValue(u) + weight
                if (distV < distances.getValue(v)) {
                    distances[v] = distV
                    priorityQueue.add(Pair(v, distV))
                }
            }
        }
        return distances
    }
}