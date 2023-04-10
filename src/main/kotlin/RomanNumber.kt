class RomanNumber {
    companion object {
        @JvmStatic
        @Throws(IllegalArgumentException::class)
        fun isValid(romanNumber: String): Boolean {
            if (Regex("[iIvVxXlLcCdDmM]").findAll(romanNumber).count() != romanNumber.length) {
                throw IllegalArgumentException("$romanNumber includes incorrect symbol")
            }
            if (romanNumber.length !in 1..15) {
                throw IllegalArgumentException("Length of $romanNumber not in 1..15")
            }
            return Regex("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])\$").matches(romanNumber.uppercase())
        }

        @JvmStatic
        @Throws(IllegalArgumentException::class)
        fun convert(romanNumber: String): Int {
            if (!isValid(romanNumber)) {
                throw IllegalArgumentException("Incorrect roman number: $romanNumber")
            }
            val transferMap = mapOf<Char, Int>(
                'I' to 1,
                'V' to 5,
                'X' to 10,
                'L' to 50,
                'C' to 100,
                'D' to 500,
                'M' to 1000
            )

            var result: Int = 0
            var acc: Int = 0
            for (roman in romanNumber.uppercase()) {
                val arabic = transferMap[roman]
                if (arabic == null) {
                    throw IllegalArgumentException("$romanNumber includes non-roman numerals")
                } else {
                    if (arabic > acc) {
                        result -= acc
                    } else {
                        result += acc
                    }
                    acc = arabic
                }
            }
            result += acc
            return result
        }
    }
}