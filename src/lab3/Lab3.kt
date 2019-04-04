package lab3

class BoolVector(var bools: ArrayList<Boolean>) {

    fun conjunction(second: BoolVector): BoolVector {
        val result = BoolVector(bools)
        for (i in 0 until bools.size) {
            result.bools[i] = bools[i] && second.bools[i]
        }
        return result
    }

    fun disjunction(second: BoolVector): BoolVector {
        val result = BoolVector(bools)
        for (i in 0 until bools.size) {
            result.bools[i] = bools[i] || second.bools[i]
        }
        return result
    }

    fun negation() {
        val new_bools = ArrayList<Boolean>(bools.size)
        for (b in bools) {
            new_bools.add(!b)
        }
        bools = new_bools
    }

    fun units(): Int = bools.count { e -> e }

    fun zeros(): Int = bools.count { e -> !e }
}

fun main() {
    val array = arrayListOf(true, false, false, true)
    val b = BoolVector(array)
    val c = BoolVector(b.bools)
    c.negation()
    println(c.bools)
    val d = (b.conjunction(c))
    println(d.bools)
    println(d.zeros())
    val e = b.disjunction(c)
    println(e.bools)
    println(e.units())
}