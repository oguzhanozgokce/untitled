package gettingStarted


/* two types of variables
val is for immutable variables
   var is for mutable variables */
fun main() {
    val name = "Oguzhan"
    var age = 30

    age = 32
    // name = "Ozgokce" // this will give an error
    println("My name is $name and I am $age years old")
}