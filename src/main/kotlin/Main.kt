import gettingstarted.*
import gettingstarted.SumClass
import kotlin.math.pow

// Code with ♥️
// _______________________________
// |					         |
// |  Created by Oguzhan OZGOKCE |
// |					         |
// |  oguzhanozgokce34@Android.  |
// |_____________________________|

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

    // branch 1 commit 1
    // branch 1 commit 2

}