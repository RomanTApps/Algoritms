package romantsisyk.github.io.lib.algorithms.number_operations

import kotlin.random.Random

class RandomNumberGenerator {
    fun generateRandomNumber(from: Int, to: Int): Int = Random.nextInt(from, to)
}