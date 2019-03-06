package lab4

import java.io.File
import java.lang.Exception
import java.util.*

fun main() {
    val sc = Scanner(File("src/lab4/taxes.txt"))
    val taxes = ArrayList<Tax>()
    while (sc.hasNextLine()){
        val arr = (sc.nextLine()).split(" ")
        try {
            taxes.add(Tax(arr[0].toInt(), arr[1].toInt()))
        }
        catch (e: Exception){
            println(arr)
            return
        }
    }
    taxes.sortWith(compareBy{it.howMuch})
    println(taxes.size.toString() + " taxes:")
    println(taxes)
}