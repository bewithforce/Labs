package lab8

import java.io.File
import java.lang.Exception
import java.util.*

fun main() {
    val sc = Scanner(File("src/lab8/taxes.txt"))
    val taxes = ArrayList<Tax>()
    while (sc.hasNextLine()){
        val arr = (sc.nextLine()).split(" ")
        try {
            if(arr.size != 2){
                throw IllegalLineException()
            }
            val type = arr[0].toInt()
            if(type < 0 || type > 6){
                throw NonExistentTaxException()
            }
            taxes.add(Tax(type, arr[1].toInt()))
        }
        catch (e: Exception){
            println(e.message)
            return
        }
    }
    taxes.sortWith(compareBy{it.howMuch})
    println(taxes.size.toString() + " taxes:")
    println(taxes)
}

enum class IncomeSource(val type: Int){
    WORK(0),
    ROYALTIES(1),
    REAL_ESTATE(2),
    GIFTS(3),
    TRANSFERS(4),
    BENEFITS(5),
    ASSISTANCE(6);

    companion object {
        fun from(findType: Int): IncomeSource = values().first { it.type == findType }
    }

    override fun toString(): String {
        when(type){
            0 -> return "WORK"
            1 -> return "ROYALTIES"
            2 -> return "REAL_ESTATE"
            3 -> return "GIFTS"
            4 -> return "TRANSFERS"
            5 -> return "BENEFITS"
            6 -> return "ASSISTANCE"
        }
        throw Exception("Bad tax type")
    }
}

class Tax(type: Int, quantity: Int){
    private val source = IncomeSource.from(type)
    val howMuch = quantity

    override fun toString(): String {
        val builder = StringBuilder()
        builder.append(source.toString())
        builder.append(" - ")
        builder.append(howMuch.toString())
        builder.append(" BYN")
        return builder.toString()
    }
}

class IllegalLineException(message: String = "Bad line format"): Throwable(message)

class NonExistentTaxException(message: String = "Bad tax type"): Throwable(message)
