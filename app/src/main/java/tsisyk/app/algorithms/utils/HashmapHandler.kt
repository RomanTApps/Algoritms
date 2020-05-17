package tsisyk.app.algorithms.utils

class HashmapHandler<K, V> {
    private val buckets: Array<MutableList<Pair<K, V>>?> = arrayOfNulls(16)
    private fun hash(key: K): Int = key.hashCode() % buckets.size

    fun put(key: K, value: V) {
        val index = hash(key)
        val bucket = buckets[index]
        if (bucket == null) {
            buckets[index] = mutableListOf(Pair(key, value))
        } else {
            val pairIndex = bucket.indexOfFirst { it.first == key }
            if (pairIndex != -1) {
                bucket[pairIndex] = Pair(key, value)
            } else {
                bucket.add(Pair(key, value))
            }
        }
    }

    fun get(key: K): V? {
        val index = hash(key)
        buckets[index]?.forEach { if (it.first == key) return it.second }
        return null
    }

    fun remove(key: K): Boolean {
        val index = hash(key)
        val bucket = buckets[index]
        if (bucket != null) {
            val pairIndex = bucket.indexOfFirst { it.first == key }
            if (pairIndex != -1) {
                bucket.removeAt(pairIndex)
                return true
            }
        }
        return false
    }
}
