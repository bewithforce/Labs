class BoolVector(send_bools: ArrayList<Boolean>) {
    var bools: ArrayList<Boolean>

    init {
        bools = ArrayList(send_bools)
    }

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
         //   println(bools[i])
           // println(second.bools[i])
        }
        return result
    }

    fun negation() {
        var new_bools = ArrayList<Boolean>(bools.size)
        for (b in bools) {
            new_bools.add(!b)
        }
        bools = new_bools
    }

    fun units(): Int = bools.count { e -> e }

    fun zeros(): Int = bools.count { e -> !e }
}

fun main(args: Array<String>) {
    val array = arrayListOf(true, false, false, true)
    var b = BoolVector(array)
    var c = BoolVector(b.bools)
    c.negation()
    println(c.bools)
    var d = (b.conjunction(c))
    println(d.bools)
    var e = b.disjunction(c)
    println(e.bools)
}