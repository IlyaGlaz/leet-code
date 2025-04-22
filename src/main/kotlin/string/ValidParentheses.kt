package string

import java.util.*

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val map = mapOf(']' to '[', ')' to '(', '}' to '{')

    for (ch in s) {
        if (ch !in map) {
            stack.push(ch)
            continue
        }

        if (stack.poll() != map[ch]) {
            return false
        }
    }

    return stack.isEmpty()
}

fun main() {
    println(isValid("[]"))
}