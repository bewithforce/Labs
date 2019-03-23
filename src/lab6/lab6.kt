package lab6

interface Paper{
    fun write()
}

abstract class Notebook(private val name: String): Paper

class DrawingBook(private val name: String): Notebook(name){
    override fun write() {
        println(name)
    }
}

fun main() = DrawingBook("main").write()