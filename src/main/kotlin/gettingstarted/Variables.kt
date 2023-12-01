package gettingstarted


/** two types of variables
    val is for immutable variables
    var is for mutable variables */
fun main() {
    val name = "Oguzhan"
    var age = 30

    age = 32
    // name = "Ozgokce" // this will give an error
    println("My name is $name and I am $age years old")

    val number: Int ? = null

    /**
     *      Primitive types cannot be defined directly in Kotlin. -> Turkish translate -> İlkel türler doğrudan Kotlin'de tanımlanamaz.
     *      However, when the program we write is compiled into machine code, it is converted to primitive types. -> Turkish translate -> Ancak yazdığımız program makine koduna derlendiğinde ilkel koda dönüştürülür.
     *      If the variable is hardwired as "nullable" or "generic", it is returned as a reference type -> Turkish translate -> Eger degısken "nullable" veya "generic" olarak tanımlanırsa referans tipli olarak donusturulur
     *      Even if the variable is nullable, if no null value is assigned, it will still be converted as a primitive type -> Turkish translate.-> Degisken nullable olsa bile hıc null deger ataması yapılmazsa yine primitive tip olarak donusturulur
     */



}