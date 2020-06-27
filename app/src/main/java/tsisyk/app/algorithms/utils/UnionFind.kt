package tsisyk.app.algorithms.utils

class UnionFind(size: Int) {
    private val parent = IntArray(size) { it }
    private val rank = IntArray(size) { 0 }

    fun find(node: Int): Int {
        if (parent[node] != node) {
            parent[node] = find(parent[node])  // Path compression
        }
        return parent[node]
    }

    fun union(node1: Int, node2: Int) {
        val root1 = find(node1)
        val root2 = find(node2)

        if (root1 != root2) {
            // Union by rank
            if (rank[root1] > rank[root2]) {
                parent[root2] = root1
            } else if (rank[root1] < rank[root2]) {
                parent[root1] = root2
            } else {
                parent[root2] = root1
                rank[root1] += 1
            }
        }
    }
}
