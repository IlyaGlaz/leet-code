package arrays

fun removeDuplicates(nums: IntArray): Int {
    if (nums.size <= 2) return nums.size

    var l = 2
    for (r in 2..nums.lastIndex) {
        if (nums[r] != nums[l - 2]) {
            nums[l++] = nums[r]
        }
    }

    return l
}
