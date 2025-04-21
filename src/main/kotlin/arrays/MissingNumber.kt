package arrays

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
fun missingNumber(nums: IntArray): Int {
    val n = nums.size

    return n * (n + 1) / 2 - nums.sum()
}

fun missingNumberXor(nums: IntArray): Int {
    var xor = 0

    for (i in 0..nums.size) {
        xor = xor.xor(i)
    }

    for (num in nums) {
        xor = xor xor num
    }

    return xor
}

fun main() {
    println(missingNumberXor(intArrayOf(0, 1, 3, 4, 6, 5)))
}