package tsisyk.app.algoritms.utils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class PalidromeTest{

    var SUT = Palidrome()

    @Test
    fun palidrome_roman() {
        var testWord = "Roman"
        SUT.isPalidrome(testWord)
        assertNotEquals(SUT.isPalidrome(testWord) , testWord)
    }

    @Test
    fun palidrome_elen() {
        var testWord = "elen"
        SUT.isPalidrome(testWord)
        assertNotEquals(SUT.isPalidrome(testWord) , testWord)
    }

    @Test
    fun palidrome_olo() {
        var testWord = "polop"
        SUT.isPalidrome(testWord)
        assertEquals(SUT.isPalidrome(testWord) , testWord)
    }

}

