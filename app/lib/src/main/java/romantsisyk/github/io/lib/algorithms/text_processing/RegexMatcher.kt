package romantsisyk.github.io.lib.algorithms.text_processing

import java.util.regex.Pattern

class RegexMatcher {
    fun matches(pattern: String, input: String): Boolean {
        val regex = Pattern.compile(pattern)
        val matcher = regex.matcher(input)
        return matcher.find()
    }
}
