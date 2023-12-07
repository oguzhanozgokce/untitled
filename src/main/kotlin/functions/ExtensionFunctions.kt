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
     *Extension functions are used to add new functions to existing classes.
     * Receiver class needs to be defined first. Then the function is defined. Then the function is called.
     * fun receiverClass.functionName(){
     *     // function body
     *
     */

    (3+0.14).log("Number : ")

    log2(3+0.14)

    3 + 0.14 log "Number : "  // infix function

    val result : Int = "3" extPlus "5"
    println(result)
    println("-------------------------------------")



}


fun log2(number : Number){ // normal function
    println(number)
}
infix fun String.extPlus(otherString: String ) : Int = this.toInt() + otherString.toInt()

infix  fun Number.log(empty : String){  // infix function and extension function
    println(empty + this)
}

