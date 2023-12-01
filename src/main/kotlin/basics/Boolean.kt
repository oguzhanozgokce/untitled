package basics

fun main() {

    /**
     * True and False are the only two values of type Boolean           -> Turkish translate -> True ve False Boolean turunde iki degerdir
     * 0 and 1 are not valid values for Boolean                     -> Turkish translate -> 0 ve 1 Boolean icin gecerli degerler degildir
     * !! When declaring a Boolean variable we prefix the variable name with is or has -> Turkish translate -> Bir Boolean degiskeni tanimlarken degisken adini is veya has ile baslatiyoruz
     */

    val isStudent : Boolean = true
    val isTeacher : Boolean = false
    println("isStudent : $isStudent  -  isTeacher : $isTeacher")

    //----------------------------------------------------------------------------------------------------

    /**
     * Boolean operators
     *  && : and operator
     *  || : or operator
     *  ! - not operator
     *  == : equality operator
     *  != :inequality operator
     *  > : greater than operator
     *  < : less than operator
     *  >= : greater than or equal to operator
     */

    if(isStudent and isTeacher){
        println("I am both a student and a teacher")
    }else if(isStudent || isTeacher){
        println("I am either a student or a teacher")
    }else{
        println("I am neither a student nor a teacher")
    }
    //or

    if(isStudent.or(isTeacher)) {
        println("I am either a student or a teacher")
    }
    if (isStudent.not()) {
        println("I am not a student")
    }
    if (isStudent.and(isTeacher)) {
        println("I am both a student and a teacher")
    }

    //----------------------------------------------------------------------------------------------------

    /**
     *  We don't need to use the following syntax to check if boolean value == is true  -> Boolean degerin true olmasini kontrol etmek icin == true  seklinde kontrole gerek yok
     */
    if (isTeacher == true) {
        println("I am a Teacher")
    }
    // or
    if(isTeacher){
        println("I am a teacher")
    }
    // negative
    if(!isTeacher){
        println("I am not a teacher")
    }
    // or
    if (isTeacher.not()) {
        println("I am not a teacher")
    }
}