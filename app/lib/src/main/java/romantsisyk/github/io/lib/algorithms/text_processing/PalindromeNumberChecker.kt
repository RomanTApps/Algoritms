package romantsisyk.github.io.lib.algorithms.text_processing

class PalindromeNumberChecker {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        return str == str.reversed()
    }
}