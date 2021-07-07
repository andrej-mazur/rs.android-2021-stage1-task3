package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        for (k in 1..n) {
            if (m * 1L == factorial(n) / (factorial(k) * factorial(n - k))) {
                return k
            }
        }
        return null
    }

    companion object {
        private tailrec fun factorial(n: Int, accumulator: Long = 1L): Long =
            when (n) {
                0 -> 1
                1 -> accumulator
                else -> factorial(n - 1, n * accumulator)
            }
    }
}
