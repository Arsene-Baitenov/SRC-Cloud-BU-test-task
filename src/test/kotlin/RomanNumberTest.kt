import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class RomanNumberTest {
    @ParameterizedTest(name = "Function isValid should returns true for {0}")
    @ValueSource(strings = ["X", "xD", "MMMDcccLXxXVIII", "lii"])
    fun `Function isValid returns true on roman numbers`() {
        assertTrue(RomanNumber.isValid("X"))
    }

    @ParameterizedTest(name = "Function isValid should returns false for {0}")
    @ValueSource(strings = ["XXXX", "IL", "CMM", "DM", "CXCC"])
    fun `Function isValid returns false on incorrect roman numbers`(romanNumber: String) {
        assertFalse(RomanNumber.isValid(romanNumber))
    }

    @ParameterizedTest(name = "Function isValid should throws exception on {0}")
    @ValueSource(strings = ["XAB", "", "MMMDcccLXxXVIIII", "DF400"])
    fun `Function isValid throws exception on illegal args`(romanNumber: String) {
        assertThrows(IllegalArgumentException::class.java) { RomanNumber.isValid(romanNumber) }
    }

    @Test
    fun `Function convert returns arabic number on roman`() {
        val actual = RomanNumber.convert("MMMDcccLXxXVIII")
        assertEquals(3888, actual)
    }

    @ParameterizedTest(name = "Function convert should throws exception on {0}")
    @ValueSource(strings = ["XXXX", "XAB", "", "MMMDcccLXxXVIIII"])
    fun `Function convert throws exception on incorrect roman numbers`(romanNumber: String) {
        assertThrows(IllegalArgumentException::class.java) { RomanNumber.convert(romanNumber) }
    }
}