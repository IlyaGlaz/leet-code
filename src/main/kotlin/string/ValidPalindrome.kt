package string

fun isPalindrome(s: String): Boolean {
    val str = s.replace("[^a-zA-Z0-9]".toRegex(), "").lowercase()

    if (str.isEmpty()) return true

    var l = 0
    var r = str.lastIndex

    while (l != r) {
        if (str[l] < str[r]) return false
        l++
        r--
    }

    return true
}

