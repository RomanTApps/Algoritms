package romantsisyk.github.io.lib.algorithms.data_manipulation

class CurrencyConverter {
    private val exchangeRates = mapOf(
        "USD" to 1.0,
        "EUR" to 0.85,
        "JPY" to 110.0,
        "GBP" to 0.75
    )

    fun convert(amount: Double, fromCurrency: String, toCurrency: String): Double {
        val rateFrom = exchangeRates[fromCurrency] ?: throw IllegalArgumentException("Unknown currency $fromCurrency")
        val rateTo = exchangeRates[toCurrency] ?: throw IllegalArgumentException("Unknown currency $toCurrency")
        return amount * (rateFrom / rateTo)
    }
}
