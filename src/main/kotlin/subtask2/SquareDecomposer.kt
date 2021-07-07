package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decomposeNumber(number, squared(number))
    }

    private fun decomposeNumber(number: Int, remainder: Long): Array<Int>? {
        for (i in (1 until number).reversed()) {
            val squaredI = squared(i)
            when {
                remainder == squaredI -> {
                    return arrayOf(i)
                }
                remainder > squaredI -> {
                    decomposeNumber(i, remainder - squaredI)?.let { resultArray ->
                        return resultArray + i
                    }
                }
            }
        }
        return null
    }

    companion object {
        private fun squared(i: Int) = (i).toLong() * (i).toLong()
    }
}
