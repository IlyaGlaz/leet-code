package arrays

fun majorityElement(nums: IntArray): Int {
    val memo = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val num = nums[i]

        memo[num] = memo.getOrPut(num) { 1 } + 1
    }

    return memo.maxBy { it.value }.key
}

fun main() {
    println(majorityElement(intArrayOf(2, 2, 3, 3, 2, 4)))
}