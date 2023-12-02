package controlflow

data class PairNumber(val firstNumber: Int, val secondNumber: Int) {
    operator fun minus(pairNumber: PairNumber) : PairNumber {
       val returnPairObject = PairNumber(
           firstNumber - pairNumber.firstNumber,
           secondNumber - pairNumber.secondNumber
       )
        println("result: ${returnPairObject.firstNumber} , ${returnPairObject.secondNumber}")
        return returnPairObject
    }
}

fun main() {
    //TODO : Operator Overloading
    val pairNumberOne = PairNumber(10, 20)
    val pairNumberTwo = PairNumber(5, 10)

    val pairNumber = pairNumberOne - pairNumberTwo
    println("pairNumber : $pairNumber")
    val pairNumber2 = pairNumberOne.minus(pairNumberTwo)
    println("pairNumber2 : $pairNumber2")

}