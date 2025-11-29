package string

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0

    for (i in 0..haystack.lastIndex - needle.lastIndex) {
        if (haystack.substring(i, needle.length + i) == needle) {
            return i
        }
    }

    return -1
}


