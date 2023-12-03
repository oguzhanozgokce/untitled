package functions

import kotlin.math.pow

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

    println(2.0.pow(3.0)) // 2^3 = 8.0
    println("-------------------------------------")
    reformatMessage("Engineering", true, 10, "EN")
    reformatMessage("ComputerEngineering", size = 10, lang = "TR")   // -> name argument : size argument , lang argument
    reformatMessage("AndroidDeveloper", size = 10)
    println("-------------------------------------")
    getUserInfo("oguzhan", "ozgokce", "address", "cardNumber" , key = 10)
    getUserInfo(*arrayOf("oguzhan", "ozgokce", "address", "cardNumber"), key = 10)
    getListCount()
    getListCount2()

}
fun helloWorld() : Unit {
    println("Hello World")
}
fun takeSquare(number : Int ) : Int {
    return number * number
}

//----------------------------------------------------------------------------------------------------

/**
 * Default Parameters - > Default value assignment allows us to do function overload -> Turkish translate: Default deger ataması yapmak  fonksiyon overload islemi yapmamizi saglar
 */
fun reformatMessage(message  : String, isUpperCase: Boolean = false , size: Int , lang: String = "TR") {
    println("message : $message , isUpperCase : $isUpperCase , size : $size , lang : $lang")

}

//----------------------------------------------------------------------------------------------------

/**
 * vararg -> variable arguments -> Turkish translate: degisken argumanlar
 */
fun getUserInfo(vararg userInfo : String, key: Int){  // can take many parameters -> Turkish translate: cok sayida parametre alabilir
    for (info in userInfo){
        println("info : $info")
    }
    println("-------------------------------------")
}

//----------------------------------------------------------------------------------------------------

/**
 *  function = value -> function can be assigned to a variable -> Turkish translate: fonksiyon degiskene atanabilir
 */

val userList = arrayOfNulls<String>(5)
fun getListCount() : Int = userList.size   // expression
fun getListCount2() : Int {
    return userList.size
}


