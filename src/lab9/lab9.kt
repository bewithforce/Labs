package lab9

import java.io.File
import java.util.*
import kotlin.math.sqrt

fun main(){
    val sc = Scanner(File("src/lab9/matrix.txt"))
    val list = LinkedList<Int>()
    while (sc.hasNextInt()){
        list.add(sc.nextInt())
    }
    val tempArr = list.toArray()
    val n = sqrt(list.size.toDouble()).toInt()
    val array = Array(n){IntArray(n)}
    var t = 0
    for(i in 0 until  n)
        for(j in 0 until n)
            array[i][j] = tempArr[t++] as Int
    println("dimension: $n")
    for(i in 0 until n) {
        for (j in 0 until n)
            print("${array[i][j]} ")
        println()
    }
    println()
    for(i in 0 until n) {
        for (j in 0 until n)
            print("${array[n - 1 - j][i]} ")
        println()
    }
}