package tsisyk.app.algorithms.utils

class PasswordStrengthChecker {
    fun checkStrength(password: String): String {
        val hasLetters = password.any { it.isLetter() }
        val hasDigits = password.any { it.isDigit() }
        val hasSpecial = password.any { !it.isLetterOrDigit() }
        val length = password.length

        return when {
            length >= 10 && hasLetters && hasDigits && hasSpecial -> "Strong"
            length >= 8 && hasLetters && hasDigits -> "Medium"
            else -> "Weak"
        }
    }
}