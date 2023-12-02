package basics

import java.lang.reflect.Array.get

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

    // ---------------------------------------------------------------------------------------------

    /**
     * Array<Type>(size){higher order function} is used when defining an array -> Turkish translate : Dizi tanimlamasi yapilirken Array<Type> kullanilir
     * The values corresponding to the last row in the higher order function create the array. -> Turkish translate : Higher order fonksiyonda son satira karsilik gelen degerler dizi olusturur.
     * The higher order function works by increasing the index (it) by one according to the size of the array. -> Turkish translate : Higher order fonksiyon dizinin boyutuna gore index (it) degerini bir artirarak calisir.
     */

    var carNameMini = Array<Double>(5){
        3.14*(it+1)
    }
    carNameMini.forEach { println(it) } // 3.14 6.28 9.42 12.56 15.7
    println("------------------------------------")

    val carNames = Array(10){
        println((it*it).toString())                   // 0 1 4 9 16 25 36 49 64 81
    }
    println("------------------------------------")

    // ---------------------------------------------------------------------------------------------

    /**
     * ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray and BooleanArray are used for primitive types. -> Turkish translate : ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray ve BooleanArray ilkel tipler icin kullanilir.
     * set() and get() functions are used to assign and retrieve values to and from the array. -> Turkish translate : Diziye deger atamak ve deger almak icin set() ve get() fonksiyonlari kullanilir.
     * The size of the array cannot be changed. -> Turkish translate : Dizinin boyutu degistirilemez.
     */

    val firstCharOfCountries = CharArray(5)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries[1] = 'U'
    firstCharOfCountries[2] = 'R'
    firstCharOfCountries[3] = 'K'
    firstCharOfCountries[4] = 'E'

    println(get(firstCharOfCountries,0)) // T
    println("------------------------------------")


    firstCharOfCountries.forEach { println(it) } // T U R K E
    println("------------------------------------")

    firstCharOfCountries[0] = 'A'    // T -> A
    firstCharOfCountries.forEach { println(it) } // A U R K E
    println("------------------------------------")


}