package tsisyk.app.algorithms.utils

class AnagramChecker {
    fun areAnagrams(s1: String, s2: String): Boolean {
        return s1.toCharArray().sorted() == s2.toCharArray().sorted()
    }
}