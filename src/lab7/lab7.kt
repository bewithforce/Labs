package lab7

import java.io.File
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(File("src/lab7/text"))
    val words = ArrayList<String>()
    while(sc.hasNextLine()){
        val line = sc.nextLine()
        words.addAll(line.split(" "))
    }
    val checkList = ArrayList<Char>()
    for(word in words){
        if (checkList.contains(word[0])){
            System.err.println("wrong args")
            return
        }
        checkList.add(word[0])
    }
    val stackOfWords = Stack<String>()
}