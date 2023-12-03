package functions

// Code with ♥️
// _______________________________
// |					         |
// |  Created by Oguzhan OZGOKCE |
// |					         |
// |  oguzhanozgokce34@Android.  |
// |_____________________________|

// -------------------- Extra Information --------------------

/**
 * English translate: If a function is not inside a class but is defined in a file, it is called a top level function.
 *
 *
 * English translate: A function must be a top level function for us to say function.
 */
fun main() {
    calculateAtomPhysics()
}

/**
 * English translate: Functions can be defined inside a function. These functions are called Local functions.
 * Local functions can only be accessed within the function they are defined in.
 * These functions cannot be accessed from outside.
 */

fun calculateAtomPhysics() {
    val userName = "Oguzhan"
    println("Initialize Process..")


    fun getValuesFromUserAndPrint() {
        userName.length
        val numberOne = readLine()!!.toInt()
        val numberTwo = readLine()!!.toInt()
        val result = numberOne + numberTwo
        println("$numberOne + $numberTwo = $result")
    }

    getValuesFromUserAndPrint()
    println("Process has been done")
}