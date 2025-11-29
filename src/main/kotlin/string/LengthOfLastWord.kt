package string

fun lengthOfLastWord(s: String): Int {
    var length = 0
    var i = s.lastIndex

    while (s[i] == ' ') {
        i--
    }

    while (i >= 0 && s[i] != ' ') {
        length++
        i--
    }

    return length
}
