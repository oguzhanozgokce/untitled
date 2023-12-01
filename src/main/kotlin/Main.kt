import gettingStarted.*
import gettingStarted.SumClass
import kotlin.math.pow

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val sumClass = SumClass()
    sumClass.sum()

    val powClass = PowClass()
    powClass.pow(2, 3)

    3.14.pow(2.0)

}