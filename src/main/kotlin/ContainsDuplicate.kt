fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 3)))
}

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */

fun containsDuplicate(nums: IntArray): Boolean {
    val cache = mutableMapOf<Int, Int>()
    var result = false

    for (i in nums.indices) {
        val pointer = nums[i]

        if (pointer == cache[pointer]) {
            result = true
            break
        }

        cache[pointer] = pointer
    }

    return result
}
