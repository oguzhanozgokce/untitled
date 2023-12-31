package basics

/**Functions for type conversion
 * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
 *
 */

/**
 *  Implicit conversion : done by compiler - > Turkish translate -> Derleyici tarafindan yapilan donusum -> otomatik donusum
 *  Explicit conversion : done by programmer - Turkish translate - > Programci tarafindan yapilan donusum - > belirgin donusum
 *
 */

fun main() {
    var name  : String = "Oguzhan"
    println(name)
    name = 20.toString()
    println(name) // 20

    val byte : String = "3"
    val intValue = Integer.parseInt(byte)
    val intValue2 = byte.toInt()
    println(intValue) // 3
    println(intValue2) // 3

    val longValue = 100L
    val intValue3 = longValue.toInt()
    println(intValue3) // 100




}