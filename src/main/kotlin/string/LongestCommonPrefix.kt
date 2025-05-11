package string

fun longestCommonPrefix(strs: Array<String>): String {
    var result = ""

    for (i in strs[0].indices) {
        for (s in strs) {
            if (i == s.length || s[i] != strs[0][i]) {
                return result
            }
        }
        result += strs[0][i]
    }

    return result
}

