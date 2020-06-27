package tsisyk.app.algorithms.utils

class PalindromeNumberChecker {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        return str == str.reversed()
    }
}