package lab5

import java.io.File
import java.lang.Exception
import java.util.*

class Computer(private val hardware : List<Data>) {
    class Data(private val type: String, private val name: String){
        override fun toString(): String {
            return "$type: $name"
        }
    }

    override fun toString(): String {
        return hardware.toString()
    }
}

fun main(){
    val sc = Scanner(File("src/ReferenceService/hardware.txt"))
    val list = ArrayList<Computer.Data>()
    while (sc.hasNextLine()){
        val arr = (sc.nextLine()).split(" ")
        try {
            list.add(Computer.Data(arr[0], arr[1]))
        }
        catch (e: Exception){
            println(arr)
            return
        }
    }
    val computer = Computer(list)
    println(computer)
}