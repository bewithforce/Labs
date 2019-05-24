package lab7

import java.io.File
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

val checkMap = HashMap<Char, String>()

fun main() {
    val sc = Scanner(File("src/lab7/text"))
    val words = ArrayList<String>()
    while (sc.hasNextLine()) {
        val line = sc.nextLine()
        words.addAll(line.split(" "))
    }

    for (word in words) {
        if (checkMap[word[0]] != null) {
            System.err.println("wrong args")
            return
        } else {
            checkMap[word[0]] = word
        }
    }
    var max = 0
    var first = ""
    for (word in words) {
        val temp = weird(word)
        if (temp > max){
            max = temp
            first = word
        }
    }
    print(first)
    while (checkMap[first.last()] != null){
        if(first == checkMap[first.last()]!!)
            break
        first = checkMap[first.last()]!!
        print(" -> $first")
    }
    println("\n$max")

}
fun weird(word: String): Int {
    if (checkMap[word.last()] == word)
        return 1
    if (checkMap[word.last()] != null)
        return weird(checkMap[word.last()]!!) + 1
    return 1
}
