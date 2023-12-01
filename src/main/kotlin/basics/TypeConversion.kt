package basics

/**Functions for type conversion
 * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
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

    var longValue = 100L
    var intValue3 = longValue.toInt()
    println(intValue3) // 100




}