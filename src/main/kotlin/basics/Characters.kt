package basics

fun main() {
    /**
     *   Characters
     *   Char is a single 16-bit Unicode character.
     *   "" -> String
     *   '' -> Char
     */

    val firstCharOfName : Char = 'G'
    println(firstCharOfName) // G
    val firstCharOfName2 = 'G'
    println(firstCharOfName2) // G
    val charNumber : Char = '6' // ASCII code -> 54
    println(charNumber) // 6

    //--------------------------------------------------------------------

    /**
     *  Escape characters : \n, \t, \b, \r, \', \", \\, \$
     *  \n -> new line          -> Turkish translate -> yeni satir
     *  \t -> tab               -> Turkish translate -> sekme
     *  \b -> backspace         -> Turkish translate -> geri tusu
     *  \r -> carriage return   -> Turkish translate -> satir basina don
     *  \' -> single quote      -> Turkish translate -> tek tirnak
     *  \" -> double quote      -> Turkish translate -> cift tirnak
     *  \\ -> backslash         -> Turkish translate -> ters slash
     *  \$ -> dollar sign       -> Turkish translate -> dolar isareti
     */

    val escapeCharT = '\t'
    val escapeCharN = '\n'
    val escapeCharB = '\b'
    val escapeCharR = '\r'
    val escapeCharS = '\''
    val escapeCharD = '\"'
    val escapeCharBS = '\\'
    val escapeCharDS = '\$'

    val loremImpsum = "Lorem Impsum " + escapeCharT +
            "escapeCharN " + escapeCharN + "Lorem ImpsumB " + escapeCharB +
            "Lorem ImpsumR " + escapeCharR + "Lorem ImpsumS " + escapeCharS +
            "Lorem ImpsumD " + escapeCharD + "Lorem ImpsumBS " + escapeCharBS +
            "Lorem ImpsumDS " + escapeCharDS

    println(loremImpsum)

    //--------------------------------------------------------------------
    /**
     * Unicode characters : \uFFFF
     */

    val unicodeChar = '\uFFFF'
    println("uniCode :  $unicodeChar")  // uniCode :  ?


}