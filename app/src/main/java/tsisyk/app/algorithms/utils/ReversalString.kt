package tsisyk.app.algorithms.utils

class  ReversalString() {

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

