package tsisyk.app.algorithms.utils

class SymmetricDifferenceFinder {
    fun <T> findSymmetricDifference(set1: Set<T>, set2: Set<T>): Set<T> {
        return (set1 union set2) - (set1 intersect set2)
    }
}