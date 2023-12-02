package basics

fun main() {
    /**
     * Arrays are mutable
     * [] is used when defining an array -> Turkish translate : Dizi tanimlamasi yapilirken [] kullanilir
     * Array definition can be done with the arrayOf() function  -> Turkish translate : arrarrayOfeyOf() fonksiyonu ile dizi tanimlamasi yapilabilir
     * Array definition can be done with the arrayOf<Any>() function -> Turkish translate : arrayOf<Any>() fonksiyonu ile herhangi bir tipde dizi tanimlamasi yapilabilir
     */

    // index : 0 1 2 3 4
    val studentsNumber = arrayOf(12,232,312,431,535)
    val studentsName = arrayOf("Rabia","Buse","Ahmet","Selim","Derya")
    val firstCharOfName = arrayOf('R','B','A','S','D')
    val mixedArray = arrayOf<Any>(1,2,3,"Rabia","Buse",'A',true)  // Any type
    val arrayOfNulls = arrayOfNulls<Int>(5)   // null array

    for (i in studentsNumber.indices) {
        println("${i+1} Student number  : ${studentsNumber[i]}")
    }
    println("------------------------------------")
    for (i in studentsName.indices) {
        println("${i+1} Student name  : ${studentsName[i]}")
    }
    println("------------------------------------")
    for(i in firstCharOfName.indices){
        println("${i+1} Student first char of name  : ${firstCharOfName[i]}")
    }
    println("------------------------------------")
    for(i in mixedArray.indices){
        println("${i+1} Mixed array  : ${mixedArray[i]}")
    }
    println("------------------------------------")
    for(i in arrayOfNulls.indices){
        println("${i+1} Array of nulls  : ${arrayOfNulls[i]}")
    }
    println("------------------------------------")
}