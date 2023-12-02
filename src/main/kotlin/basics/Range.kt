package basics

fun main() {
    /**
     * Range -> Used to create finite lists -> Turkish translate -> Sonlu listeler olusturmak icin kullanilir
     *  1..10 rangeTo() -> 1.rangeTo(10) -> 1 until 10  -> smaller than 10 -> 1 den 10 a kadar
     */

    val numbers = 1..10
    numbers.forEach { print("$it ") } // 1 2 3 4 5 6 7 8 9 10
    println()
    val numbers2 = 1.rangeTo(10)
    numbers2.forEach { print("$it ") } // 1 2 3 4 5 6 7 8 9 10
    println()
    println("------------------------------------------------------------------------")

    val alphabet = 'A'..'Z'
    alphabet.forEach { print("$it ") }
    println()
    val alphabet2 = 'A'.rangeTo('Z')
    alphabet2.forEach { print("$it ") }
    println()
    println("------------------------------------------------------------------------")

    val reverseAlphabet = 'Z' downTo 'A'
    reverseAlphabet.forEach { print("$it ") }
    println()
    val reverseAlphabet2 = 'Z'.downTo('A')
    reverseAlphabet2.forEach { print("$it ") }
    println()
    println("------------------------------------------------------------------------")

    /**
     *  step -> 1..10 step 2 -> 1,3,5,7,9
     *  step -> 10 downTo 1 step 2 -> 10,8,6,4,2
     */

    val stepNumbers = 1..10 step 2
    stepNumbers.forEach { print("$it ") }
    println()

    val stepNumbers2 = 1.rangeTo(10).step(2).reversed()
    stepNumbers2.forEach { print("$it ") }
    println()
    // OR
    val reverseStepNumbers = 10 downTo 1 step 2
    reverseStepNumbers.forEach { print("$it ") }
    println()

    println("------------------------------------------------------------------------")






}