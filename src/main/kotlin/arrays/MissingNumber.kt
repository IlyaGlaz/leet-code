package arrays

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
fun missingNumber(nums: IntArray): Int {
    val n = nums.size

    return n * (n + 1) / 2 - nums.sum()
}