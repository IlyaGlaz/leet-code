package search

fun <A : Comparable<A>> binarySearch(list: List<A>, target: A): Int {
    var start = 0
    var last = list.lastIndex

    while (start <= last) {
        var mid = (last + start) / 2
        if (list[mid] == target) {
            return mid
        }
        if (list[mid] < target) {
            start = mid + 1
        }
        if (list[mid] > target) {
            last = mid - 1
        }
    }

    return -1
}

fun main() {
    val list = listOf(1, 4, 20, 205, 206, 207, 500)

    println(binarySearch(list, 20))
}
