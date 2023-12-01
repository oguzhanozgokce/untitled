class PowClass {
    fun pow(a: Int, b: Int) {
        val result = Math.pow(a.toDouble(), b.toDouble())
        println("pow of $a and $b is $result")
    }
}