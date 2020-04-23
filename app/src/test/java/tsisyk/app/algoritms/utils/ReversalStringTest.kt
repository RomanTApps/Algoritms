package tsisyk.app.algoritms.utils

import org.junit.Assert.assertEquals
import org.junit.Test


class ReversalStringTest {

    var SUT = ReversalString()

    @Test
    fun reverse_roman() {
         var testWord = "Roman"
        assertEquals( SUT.reverseString(testWord), "namoR")
    }

    @Test
    fun reverse_null() {
         var testWord = null
        assertEquals( SUT.reverseString(testWord), null)
    }

    @Test
    fun reverse_null_as_string() {
         var testWord = "null"
        assertEquals( SUT.reverseString(testWord), "llun")
    }

    @Test
    fun reverse_empty_string() {
         var testWord = ""
        assertEquals( SUT.reverseString(testWord), "")
    }
}