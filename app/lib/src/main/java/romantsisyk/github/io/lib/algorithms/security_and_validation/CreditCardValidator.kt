package romantsisyk.github.io.lib.algorithms.security_and_validation

class CreditCardValidator {
    fun validate(cardNumber: String): Boolean {
        return cardNumber.reversed().mapIndexed { index, c ->
            val digit = c.toString().toInt()
            if (index % 2 == 1) digit * 2.let { if (it > 9) it - 9 else it } else digit
        }.sum() % 10 == 0
    }
}