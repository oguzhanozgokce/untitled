package controlflow

import java.io.IOException

fun main() {
    /**
     * if - else
     * state -> if (condition) { } else { }
     * expression -> val result = if (condition) { } else { }
     */

    println("Are you a student ? (yes/no)")
    val answer = readLine()!!
    // state
    if (answer.contains("yes", ignoreCase = true)) {       // contains -> Does it contain ? , ignoreCase -> ignore case sensitivity -> Turkis translate -> buyuk kucuk harf duyarliligini yoksay
        println("You are a student")
    } else {
        println("You are not a student")
    }
    // expression
    val result : String = if(answer == "yes"){
        "You are a student"
    } else {
        "You are not a student"
    }
    println("result : $result")
    println("-------------------------------------")

    //----------------------------------------------------------------------------------------------------

    println("Enter a number :")
    val number = readLine()!!.toInt()
    if (number %2 == 0){
        println("$number is even number")
    } else if (number %2 == 1){
        println("$number is odd number")
    } else {
        println("$number is not a number")
    }

    //----------------------------------------------------------------------------------------------------

    /**
     *  2nd code block is more readable than the 1st code block -> Turkish translate:  2. kod blogu 1. kod blogundan daha okunakli
     */

    //1
   val isStudent = true
    if(isStudent){
        println("You are a student")
    } else {
        otherFunction()
    }
    println("-------------------------------------")

    //2
    if (isStudent) {
        println("You are a student")
        throw IOException()
        return
    }
    otherFunction()
}
fun otherFunction() {
    TODO("Not yet implemented")
}
