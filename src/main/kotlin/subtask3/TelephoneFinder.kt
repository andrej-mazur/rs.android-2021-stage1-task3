package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? =
        number.indices
            .map { i -> i..i }
            .map { r ->
                when (number.substring(r)) {
                    "1" -> setOf("2", "4")
                    "2" -> setOf("1", "3", "5")
                    "3" -> setOf("2", "6")
                    "4" -> setOf("1", "5", "7")
                    "5" -> setOf("2", "4", "6", "8")
                    "6" -> setOf("3", "5", "9")
                    "7" -> setOf("4", "8")
                    "8" -> setOf("5", "7", "9", "0")
                    "9" -> setOf("6", "8")
                    "0" -> setOf("8")
                    else -> return null
                }.map {
                    number.replaceRange(r, it)
                }
            }.flatten().toTypedArray()
}
