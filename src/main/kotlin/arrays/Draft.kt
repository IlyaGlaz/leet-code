package arrays

import java.lang.Integer.max

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

fun maxSubArrayD(nums: IntArray): Int {
    var maxSum = nums[0]
    var curSum = nums[0]

    for (i in 1..nums.lastIndex) {
        val num = nums[i]

        curSum = max(curSum + num, num)
        maxSum = max(maxSum, curSum)
    }

    return maxSum
}

/**
 * [1,1,0,1,1,1]
 * [1,1,1,1]
 * [1]
 * [1,0]
 * [1,1,1,1,0]
 * [1,1,1,1,0,0,1,1,1,1,1]
 */
fun maxSubArrayOfOnes(nums: IntArray): Int {
    var curr = 0
    var prev = 0
    var max = 0

    if (nums.size < 2) {
        return 0
    }

    for (i in 0..nums.lastIndex) {
        val num = nums[i]

        if (num == 1) {
            curr++
        }

        if (num == 0 || i == nums.lastIndex) {
            max = max(max, max(curr, prev + curr))
            prev = curr
            curr = 0
        }

        if (i == nums.lastIndex && max == nums.size) {
            max--
        }
    }

    return max
}

fun longestCommonPrefix(strs: Array<String>): String {
    var result = ""

    for (i in strs[0].indices) {
        for (s in strs) {
            if (i == s.length || strs[0][i] != s[i]) {
                return result
            }
        }
        result += strs[0][i]
    }

    return result
}

fun mergeD(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var n1 = m - 1
    var n2 = n - 1
    var last = m + n - 1

    while (n2 >= 0 && n1 >= 0) {
        if (nums2[n2] > nums1[n1]) {
            nums1[last] = nums2[n2]
            n2--
        } else {
            nums1[last] = nums1[n1]
            n1--
        }
        last--
    }

    while (n2 >= 0) {
        nums1[last] = nums2[n2]
        last--
        n2--
    }

    println(nums1.joinToString(","))
}

fun main() {
    mergeD(intArrayOf(2, 4, 6, 8, 0, 0, 0, 0), 4, intArrayOf(1, 5, 7, 9), 4)
}