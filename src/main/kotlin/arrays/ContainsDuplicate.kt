package arrays

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    for (num in nums) {
        if (num in seen) {
            return true
        }

        seen.add(num)
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 3)))
}
