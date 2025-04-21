package arrays

import java.lang.Integer.max
import java.lang.Integer.min

fun twoSumD(nums: IntArray, target: Int): IntArray {
    val memo = mutableMapOf<Int, Int>()

    for ((index, first) in nums.withIndex()) {
        val second = target - first

        if (memo.containsKey(second)) {
            return intArrayOf(index, memo[second]!!)
        }

        memo[first] = index
    }

    return intArrayOf()
}

fun removeDuplicatesD(nums: IntArray): Int {
    var f = 0

    for (s in nums.indices) {
        if (nums[f] != nums[s]) {
            nums[++f] = nums[s]
        }
    }

    return f + 1
}

fun bubbleSort(nums: IntArray): IntArray {
    for (i in 0..<nums.lastIndex) {
        for (j in 0..<nums.lastIndex - i) {
            if (nums[j] > nums[j + 1]) {
                nums[j] = nums[j + 1].also { nums[j + 1] = nums[j] }
            }
        }
    }

    return nums
}

fun removeElementD(nums: IntArray, value: Int): Int {
    var f = 0

    for (s in nums.indices) {
        if (nums[s] != value) {
            nums[f++] = nums[s]
        }
    }

    return f
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val middle = left + (right - left) / 2
        if (nums[middle] == target) return middle

        if (nums[middle] > target) {
            right = middle - 1
        } else {
            left = middle + 1
        }
    }

    return left
}

fun main() {
    println(searchInsert(intArrayOf(1, 4), 5))
}