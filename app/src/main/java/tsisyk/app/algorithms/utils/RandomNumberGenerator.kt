package tsisyk.app.algorithms.utils

import kotlin.random.Random

class RandomNumberGenerator {
    fun generateRandomNumber(from: Int, to: Int): Int = Random.nextInt(from, to)
}