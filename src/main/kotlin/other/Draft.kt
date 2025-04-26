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

fun climbStairsD(n: Int): Int {
    if (n == 1) {
        return 1
    }

    var first = 1
    var second = 2

    for (i in 3..n) {
        val sum = first + second
        second = sum.also { first = second }
    }

    return second
}

fun main() {
    println(climbStairsD(4))
}