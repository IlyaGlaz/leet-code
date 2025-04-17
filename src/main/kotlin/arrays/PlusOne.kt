package arrays

fun plusOne1(digits: IntArray): IntArray {
    var src = digits
    var index = src.size - 1

    if (src[index] + 1 <= 9) {
        src[index]++
        return src
    }

    while (src[index] + 1 > 9) {
        src[index] = 0

        if (index != 0) {
            src[index - 1]++
        }

        if (index == 0) {
            val result = IntArray(src.size + 1)
            System.arraycopy(src, 0, result, 1, src.size)
            result[0] = 1
            src = result
            return src
        }

        index--
    }

    return src
}

fun plusOne2(digits: IntArray): IntArray {
    var result = digits
    var index = digits.size - 1

    while(digits[index] == 9) {
        digits[index] = 0
        index--

        if (index < 0) {
            result = IntArray(result.size + 1)
            result[0] = 1
            break
        }
    }

    if (index >= 0) {
        result[index]++
    }

    return result
}

fun main() {
    println(plusOne2(intArrayOf(9, 9, 1)).joinToString())
}