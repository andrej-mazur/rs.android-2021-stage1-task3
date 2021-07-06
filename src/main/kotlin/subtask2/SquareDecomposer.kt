package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decomposeNumber(number, squared(number))
    }

    private fun decomposeNumber(number: Int, remainder: Long): Array<Int>? {
        for (i in (1 until number).reversed()) {
            val squaredI = squared(i)
            if (remainder == squaredI) {
                return arrayOf(i)
            } else if (remainder > squaredI) {
                decomposeNumber(i, remainder - squaredI)?.let { array ->
                    return array + arrayOf(i)
                }
            }
        }
        return null
    }

    private fun squared(i: Int) = (i).toLong() * (i).toLong()
}
