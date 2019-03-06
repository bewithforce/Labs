package lab4

enum class IncomeSource(val type: Int){
    WORK(0),
    ROYALTIES(1),
    REAL_ESTATE(2),
    GIFTS(3),
    TRANSFERS(4),
    BENEFITS(5),
    ASSISTANCE(6);

    companion object {
        fun from(findType: Int): IncomeSource = IncomeSource.values().first { it.type == findType }
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
            else -> return ""
        }
    }
}