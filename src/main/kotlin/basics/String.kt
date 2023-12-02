package basics

fun main() {
    /**
     * Strings are immutable in Kotlin
     * "" -> String
     * We can take all the characters of a String expression one by one and assign them to a Char list. -> Turkish translate -> Bir String ifadesinin karakterlerini tek tek alıp Char listesine atayabiliriz.
     */

    val name = "Oguzhan"
    val char1 = name[0]
    val char2 = name[1]
    val char3 = name[2]
    val char4 = name[3]
    val char5 = name[4]
    val char6 = name[5]
    val char7 = name[6]
    val nameArray = charArrayOf(char1,char2,char3,char4,char5,char6,char7)
    nameArray.forEach { println(it) }
    println("------------------------------------------------------------------------")

    //----------------------------------------------------------------------------------------------------
    val awesomeEngineering = "Engineering is awesome"
    val firstCharOfAwesomeEngineering = awesomeEngineering[awesomeEngineering.indices.first]
    val lastCharOfAwesomeEngineering = awesomeEngineering[awesomeEngineering.indices.last]

    println(awesomeEngineering.length) // 22
    println(firstCharOfAwesomeEngineering) // E
    println(lastCharOfAwesomeEngineering) // e

    //----------------------------------------------------------------------------------------------------

    val numbersValue : String = "value" + 1
    println(numbersValue) // value1
    // val numbersValue2 : String =  1 + 2 + "value"  // error because of the first value is number
    println("------------------------------------------------------------------------")

    //----------------------------------------------------------------------------------------------------

    /**
     *   raw string """
     *   trimIndent() -> removes the indentation of "" -> Turkish translate -> "" girintisini kaldirir
     */

    val rawPineTree = """
        *
       ***
      *****
     *******
     """.trimIndent()
    println(rawPineTree)
    println("------------------------------------------------------------------------")
    // or code block
     for (i in 1..4) {
         for (j in 1..4-i) {
             print(" ")
         }
         for (k in 1..<2*i) {
             print("*")
         }
         println()
     }
    println("------------------------------------------------------------------------")

    //----------------------------------------------------------------------------------------------------
}