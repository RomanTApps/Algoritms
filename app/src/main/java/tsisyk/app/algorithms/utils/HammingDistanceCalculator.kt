package tsisyk.app.algorithms.utils

class HammingDistanceCalculator {
    fun calculate(s1: String, s2: String): Int {
        if (s1.length != s2.length) throw IllegalArgumentException("Strings must be of equal length")
        return s1.zip(s2).count { (c1, c2) -> c1 != c2 }
    }
}