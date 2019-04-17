package lab7

import java.io.File
import java.util.*
import kotlin.collections.ArrayList

class Node(private val value: Char, val inArcs: List<Arc>, val outArcs: List<Arc>){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Node

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}

data class Arc(private val first: Node, private val last: Node)

data class Net(private var nodes: List<Node>, private var arcs: List<Arc>){
    fun find(node: Node){
        var visited = booleanArrayOf(false)
        for (arc in node.outArcs){

        }
    }
}


fun main() {

    val sc = Scanner(File("src/lab7/text"))
    val words = ArrayList<String>()
    while (sc.hasNextLine()) {
        val line = sc.nextLine()
        words.addAll(line.split(" "))
    }
    val checkList = ArrayList<Char>()
    val canBeOnlyLast = ArrayList<String>()
    for (word in words) {
        if (checkList.contains(word[0])) {
            System.err.println("wrong args")
            return
        }
        checkList.add(word[0])
    }
    for (word in words) {
        if (word[0] == word[word.lastIndex])
            continue
        if (!checkList.contains(word.last()))
            canBeOnlyLast.add(word)
    }
}
