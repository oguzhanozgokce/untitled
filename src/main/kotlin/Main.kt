import gettingStarted.*
import gettingStarted.SumClass
import kotlin.math.pow

/**
 * This is a documentation comment
 */

// This is a single line comment

/*
This is a multi line comment
Created by: Oguzhan OZGOKCE
 */

// TODO : This is a TODO comment

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val sumClass = SumClass()
    sumClass.sum()

    val powClass = PowClass()
    powClass.pow(2, 3)

    3.14.pow(2.0)

}