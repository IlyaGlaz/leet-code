fun main() {
    val input = intArrayOf(22, 5, 4, 7, 22, 70, 2)
    println(twoSum(input, 7).joinToString())
}

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val cache = mutableMapOf<Int, Int>()
    val resultIndices = IntArray(2)

    for (i in nums.indices) {
        val pointer = nums[i]
        val addendum = target - pointer

        if (cache.containsKey(addendum)) {
            resultIndices[0] = cache[addendum]!!
            resultIndices[1] = i
            break
        }

        cache[pointer] = i
    }

    return resultIndices
}