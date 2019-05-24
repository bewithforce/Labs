package lab9

import java.io.File
import java.util.*

fun main(){
    val sc = Scanner(File("src/lab9/matrix.txt"))
    var line = sc.nextLine()
    val n = line.toString().length
    println("dimension: $n")
    val array = Array(n){CharArray(n)}
    for (j in 0 until n)
        array[0][j] = line[j]
    try {
        for (i in 1 until n) {
            line = sc.nextLine()
            for (j in 0 until n)
                array[i][j] = line[j]
        }
    } catch (e:Exception){
        e.printStackTrace()
        return
    }
    if (sc.hasNext()){
        println("bad file")
        return
    }

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