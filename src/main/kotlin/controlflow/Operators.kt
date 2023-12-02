package controlflow

fun main() {
    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : $numberOne")
    println("NumberOne : ${numberOne++}")  // First it prints, then it increments.
    println("NumberOne : $numberOne")
    println("NumberOne : ${++numberOne}")  // First it increments, then it prints.

    println("$numberOne + $numberTwo = ${numberOne.plus(numberTwo)}")
    println("$numberOne - $numberTwo = ${numberOne.minus(numberTwo)}")
    println("$numberOne * $numberTwo = ${numberOne.times(numberTwo)}")
    println("$numberOne / $numberTwo = ${numberOne.div(numberTwo)}")
    println("$numberOne % $numberTwo = ${numberOne.rem(numberTwo)}")

    println("------------------------------------------------------------------------")

    println("enter final grade : ")
    val finalGrade = readLine()!!.toInt()
    val charNote = when (finalGrade) {
        in 0..44 -> "FF"
        in 45..54 -> "DD"
        in 55..69 -> "CC"
        in 70..84 -> "BB"
        in 85..100 -> "AA"
        else -> "Invalid Grade"
    }
    println("Your grade : $charNote")
    //or
    val charNote2 = if (finalGrade == 100) {
        "$finalGrade = AA"
    } else if(finalGrade in 85..99) {
        "$finalGrade = BB"
    } else if(finalGrade in 70..84) {
        "$finalGrade = CC"
    } else if(finalGrade in 55..69) {
        "$finalGrade = DD"
    } else if(finalGrade in 45..54) {
        "$finalGrade = FF"
    } else {
        "Invalid Grade"
    }
    println("Your grade : $charNote2")

println("------------------------------------------------------------------------")

    //----------------------------------------------------------------------------------------------------

    println(finalGrade.compareTo(100)) // -1 -> compare to -> returns -1, 0, 1
    println(finalGrade.equals(100)) // false -> equals -> returns true or false












}