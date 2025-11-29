package greedy

import kotlin.math.max

fun canJump(nums: IntArray): Boolean {
    var goal = nums.lastIndex

    for (i in nums.lastIndex downTo 0) {
        if (nums[i] + i >= goal) {
            goal = i
        }
    }

    return goal == 0
}


fun canJumpMy(nums: IntArray): Boolean {
    var i = 0

    while (i <= nums.lastIndex && nums[i] > 0) {
        var max = 0
        var range = nums[i]
        var index = i

        while (index <= nums.lastIndex && range > 0) {
            max = max(nums[index], max)
            range--
            index++
        }

        i += max
    }

    return i >= nums.lastIndex
}
