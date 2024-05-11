package romantsisyk.github.io.lib.algorithms.text_processing

class  ReversalString {

    fun reverseString( string: String?): String? {
        var reversedString = ""
            if (string != null) {
                for (char in string) {
                    reversedString = char.toString() + reversedString
                }
                return reversedString
            } else return null
        }

}

