package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val numbers = mutableSetOf<String>()
        val numberArray = number.toCharArray();
        for ((index, digit) in numberArray.withIndex()) {
            val neighborDigits = neighborDigitsMap[digit] ?: return null
            for (neighborDigit in neighborDigits) {
                numbers.add(String(numberArray.copyOf().also { it[index] = neighborDigit }))
            }
        }
        return numbers.toTypedArray()
    }

    companion object {
        private val neighborDigitsMap = mapOf(
            '1' to setOf('2', '4'),
            '2' to setOf('1', '3', '5'),
            '3' to setOf('2', '6'),
            '4' to setOf('1', '5', '7'),
            '5' to setOf('2', '4', '6', '8'),
            '6' to setOf('3', '5', '9'),
            '7' to setOf('4', '8'),
            '8' to setOf('5', '7', '9', '0'),
            '9' to setOf('6', '8'),
            '0' to setOf('8')
        )
    }
}
