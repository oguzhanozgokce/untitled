package controlflow

import java.util.*

fun main() {
    // state
    println("Country Code : ")
    val countryCode = readln()!!
    when (countryCode.uppercase(Locale.ROOT)) {  // uppercase -> converts to uppercase -> Turkish translate -> buyuk harfe cevirir
        "TR", "AZ" -> println("Turkey")
        "US" -> println("United States")
        "UK" -> println("United Kingdom")
        "DE" -> println("Germany")
        "FR" -> println("France")
        else -> println("Unknown country")
    }
    println("-------------------------------------")

    //  when(countryCode.toInt()){
    //      1 or 2 -> println("Turkey")
    //      3 -> println("United States")
    //      else -> println("Unknown country")
    //  }

    //----------------------------------------------------------------------------------------------------

    // Expression
    println("Country Code2 : ")
    var countryCode2 = readln()!!
    countryCode2 = when (countryCode2.uppercase(Locale.ROOT)) {
        "TR", "AZ" -> {
            "Turkey"
        }

        "US" -> {
            "United States"
        }

        "UK" -> {
            "United Kingdom"
        }

        "DE" -> {
            "Germany"
        }

        "FR" -> {
            "France"
        }

        else -> {
            "Unknown country"
        }
    }
    println(countryCode2)
    //----------------------------------------------------------------------------------------------------

    // Expression
    println("Football Team :")
    var footballTeam = readln()!!
    footballTeam = when (footballTeam.uppercase(Locale.ROOT)){
        "FB" -> {
            "Fenerbahce"
        }
        "GS" -> {
            "Galatasaray"
        }
        "BJK" -> {
            "Besiktas"
        }
        "TS" -> {
            "Trabzonspor"
        }
        else -> ({
            "Unknown team"
        }).toString()
    }
    println(footballTeam)
    //----------------------------------------------------------------------------------------------------

    // is, !is You can check whether the class has a reference or not. -> Turkish translate -> Bir sınıfın referansını olup olmadığını kontrol edebilirsiniz.

    val phoneNumber : Long = 423423234
    when (phoneNumber){
        is Long -> {
            println("This is a phone number")
        }
        !is Long -> {
            println("This is not a phone number")
        }
    }
    println("-------------------------------------")
    //----------------------------------------------------------------------------------------------------

    // when - range
    println("Enter a number : ")
    val number = readln()!!.toInt()
    when (number) {
        in 0..9 -> {
            println("Number is between 0 and 9")
        }
        in 10..99 -> {
            println("Number is between 10 and 99")
        }
        in 100..999 -> {
            println("Number is between 100 and 999")
        }
        else -> {
            println("Number is greater than 999")
        }
    }
    println("-------------------------------------")

    //calculate
    println("Enter a number one : ")
    val numberOne = readln()!!.toInt()
    println("Enter a number two : ")
    val numberTwo = readln()!!.toInt()
    println("Enter a operator : +, -, *, /")
    val operator = readln()!!
    when (operator){
        "+" -> {
            println("$numberOne + $numberTwo = ${numberOne+numberTwo}")
        }
        "-" -> {
            println("$numberOne - $numberTwo = ${numberOne-numberTwo}")
        }
        "*" -> {
            println("$numberOne * $numberTwo = ${numberOne*numberTwo}")
        }
        "/" -> {
            println("$numberOne / $numberTwo = ${numberOne/numberTwo}")
        }
        else -> {
            println("Invalid operator")
        }
    }




}





