package arrays

fun twoSumII(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.lastIndex

    while (l < r) {
        val curSum = numbers[l] + numbers[r]

        when {
            curSum < target -> l++
            curSum > target -> r--
            else -> return intArrayOf(l + 1, r + 1)
        }
    }

    return intArrayOf()
}
