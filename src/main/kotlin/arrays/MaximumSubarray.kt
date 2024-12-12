package arrays

import kotlin.math.max

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var currentSum = nums[0]

    for (i in 1..<nums.size) {
        val num = nums[i]

        currentSum = max(currentSum + num, num)
        maxSum = max(maxSum, currentSum)
    }

    return maxSum
}