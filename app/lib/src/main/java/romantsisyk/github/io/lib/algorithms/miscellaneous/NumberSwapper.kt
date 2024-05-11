package romantsisyk.github.io.lib.algorithms.miscellaneous

class NumberSwapper {
    fun swapNumbers(a: Int, b: Int): Pair<Int, Int> {
        var x = a
        var y = b
        x = x xor y
        y = x xor y
        x = x xor y
        return Pair(x, y)
    }
}
