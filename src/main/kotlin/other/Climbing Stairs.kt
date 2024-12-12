package other

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
fun climbStairs(n: Int): Int {
    if (n == 1) {
        return 1
    }

    var n1 = 1
    var n2 = 2

    for (i in 3..n) {
        val temp = n1
        n1 = n2
        n2 += temp
    }

    return n2
}

fun main() {
    println(climbStairs(4))
}