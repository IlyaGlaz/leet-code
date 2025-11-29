package arrays

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var last = m + n - 1
    var s1 = m - 1
    var s2 = n - 1

    while (s2 >= 0 && s1 >= 0) {
        if (nums1[s1] > nums2[s2]) {
            nums1[last] = nums1[s1]
            s1--
        } else {
            nums1[last] = nums2[s2]
            s2--
        }
        last--
    }

    while (s2 >= 0) {
        nums1[last] = nums2[s2]
        last--
        s2--
    }
}


