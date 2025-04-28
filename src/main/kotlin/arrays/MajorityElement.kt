package arrays

import java.lang.Integer.max

fun majorityElement(nums: IntArray): Int {
    val count = mutableMapOf<Int, Int>()
    var res = 0
    var maxCount = 0

    for (num in nums) {
        count[num] = count.getOrPut(num) { 1 } + 1
        if (count[num]!! > maxCount) {
            res = num
        }
        maxCount = max(maxCount, count[num]!!)
    }

    return res
}

fun majorityElementIdiomatic(nums: IntArray): Int {
    val counts = mutableMapOf<Int, Int>()
    var res = 0

    nums.forEach { counts[it] = counts.getOrDefault(it, 0) + 1 }
    counts.forEach { if (it.value > nums.size / 2) res = it.key }

    return res
}

fun majorityElementNoMemory(nums: IntArray): Int {
    var res = 0
    var count = 0

    for (num in nums) {
        if (count == 0) {
            res = num
        }

        if (res == num) count++
        else count--
    }

    return res
}

fun main() {
    println(majorityElementNoMemory(intArrayOf(2, 2, 3, 3, 2, 3, 3, 4)))
}