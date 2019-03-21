package lab6

interface Paper{
    fun write()
}

abstract class Notebook: Paper

class DrawingBook: Notebook(){
    override fun write() {
        println("draw in notebook")
    }
}

fun main() = DrawingBook().write()