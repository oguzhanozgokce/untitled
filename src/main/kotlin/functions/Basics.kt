package functions

fun main() {
    /**
     *  fun keyword -> function -> function name -> parameters() -> return type -> function body -> return value
     *  Unit  -> not parameter -> not return value -> void
     *  while calling the function -> function name -> parameters
     *  When calling a class's function -> object name -> function name -> parameters
     */

    helloWorld()

    val square = takeSquare(5)
    println("$square")
    //or
    println("Number Square : ${takeSquare(5)}")
    //or
    println("Number Square : ${takeSquare(number = 5)}")

}
fun helloWorld() : Unit {
    println("Hello World")
}
fun takeSquare(number : Int ) : Int {
    return number * number
}

