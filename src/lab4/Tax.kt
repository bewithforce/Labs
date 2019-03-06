package lab4

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