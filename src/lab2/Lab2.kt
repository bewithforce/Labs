package lab2

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val array = Array(n, {IntArray(n)})
    var count = 0
    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = (-100..100).random()
            print("%4d".format(array[i][j]))
        }
        println()
    }

    loop@
    for (i in array.indices) {
        var min = array[i][0]
        var minIndex = 0
        for (j in array[i].indices) {
            if (array[i][j] < min) {
                min = array[i][j]
                minIndex = j
            }
        }
        val max = array[i][minIndex]
        for (j in array[i].indices) {
            if (array[j][minIndex] > max) {
                continue@loop
            }
        }
        count++
    }
    println(count)
}