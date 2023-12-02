package basics

fun main() {
    /**
     * To assign null to a variable, the type of the variable? is added. -> Turkish translate -> Bir degiskene null atamak icin degiskenin tipinin sonuna ? eklenir.
     * If a variable is not typed and is directly assigned a null value, the IDE returns the value of this variable to Nothing when inferring the type. signs as. Because it doesn't know which type it corresponds to.
     * -> Turkish translate -> Bir degisken tipi belirtilmeden ve dogrudan null degeri atandiginda IDE, tipi cikarirken bu degiskenin degerini Nothing olarak dondurur. Cunku hangi tipe karsilik geldigini bilmiyor.
     *
     */
    val name : String? = null
    val age : Int? = null
    val isStudent : Boolean? = null
    println("name : $name - age : $age - isStudent : $isStudent")

    val number = null // Nothing
    val number2 : Int? = null
    println("number : $number - number2 : $number2")

    val result : Int? =0
    result!!.plus(10) // !! -> non-null assertion operator -> if result is null, it will throw an exception -> Turkish translate -> eger result null ise exception firlatacak, null degilse 10 ekleyecek
    result?.plus(10) // ? -> safe call operator -> if result is null, it will not throw an exception, it will return null -> Turkish translate -> eger result null ise exception firlatmayacak yani calısmayacak devam edicek. Null degilse 10 ekleyecek


}