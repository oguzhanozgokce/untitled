package functions

// Code with ♥️
// _______________________________
// |					         |
// |  Created by Oguzhan OZGOKCE |
// |					         |
// |  oguzhanozgokce34@Android.  |
// |_____________________________|

fun main() {
    /**
     *  Infix functions are used to write more readable code.
     *  For a function to be able to be made infix, it must have 4 features.
     *  1- infix keyword  start of the function
     *  2- function must be a member function or extension function
     *  3- function must have only one parameter
     *  4- function must have no default value for the parameter -> Turkish translate: fonksiyonun parametresi icin varsayilan degeri olmamali
     */
    // true.or(false) -> true or false
    val person = Person()
    person.specialPlus(5)
    println("${person specialPlus 5}")  // infix function
    //or
    println("${person.specialPlus(5)}")  // normal function
    println("-------------------------------------")
    person.logWhenImage("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
    //or
    person logWhenImage "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png"  // infix function

}
class Person {
    infix fun specialPlus(number: Int): Int {
        return number + 10
    }
    infix fun logWhenImage(imageUrl: String) {
        downloadImage(imageUrl)
        this downloadImage imageUrl  // this  -> person class
        // downloadImage imageUrl  -> error because downloadImage is not a member function or extension function
    }
    private infix fun downloadImage(imageUrl: String): Any {
        return imageUrl
    }
}
