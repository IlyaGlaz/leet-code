package other

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    if (x % 10 == 0 && x != 0) return false

    var invertedNumber = 0
    var copyOfX = x

    while (copyOfX != 0) {
        invertedNumber = invertedNumber * 10 + copyOfX % 10
        copyOfX /= 10
    }

    return x == invertedNumber
}

fun main() {
    println(isPalindrome(2422))
}
