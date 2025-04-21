package other

fun isPalindromeD(x: Int): Boolean {
    if (x < 0) return false

    if (x % 10 == 0 && x != 0) return false

    var inverted = 0
    var copyOfX = x

    while (copyOfX != 0) {
        inverted = inverted * 10 + copyOfX % 10
        copyOfX /= 10
    }

    return inverted == x
}

fun main() {
    println(0 % 10)
}