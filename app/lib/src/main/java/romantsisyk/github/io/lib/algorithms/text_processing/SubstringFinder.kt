package romantsisyk.github.io.lib.algorithms.text_processing

class SubstringFinder {
    fun findSubstrings(text: String, pattern: String): List<Int> {
        val positions = mutableListOf<Int>()
        var pos = text.indexOf(pattern)
        while (pos >= 0) {
            positions.add(pos)
            pos = text.indexOf(pattern, pos + 1)
        }
        return positions
    }
}
