package loop



fun main() {
    /**
     *  for 3 types
     *  1 -> value in list
     *  2 -> index in list.indices
     *  3 -> value,index in list.withIndex()
     */

    for(value: Int in 1..10){
        print("$value ")
    }
    println()
    val footballTeam = arrayOf("Galatasaray", "Fenerbahce", "Besiktas", "Trabzonspor")
    for (team in footballTeam){
        print("$team ")
    }
    println()
    for (index in footballTeam.indices){    // indices - > Returns IntRange -> 0..3
        print("$index ")
    }
    println()
    for ((index, value) in footballTeam.withIndex()){
        println("$index -> $value")
    }

    //----------------------------------------------------------------------------------------------------
    // odd numbers and even numbers
    val oddNumbers = ArrayList<Int>()
    val evenNumbers = ArrayList<Int>()
    for(value in 1..50){
        if (value %2 ==1 ){
            oddNumbers.add(value)
        } else{
            evenNumbers.add(value)
        }
    }
    oddNumbers.forEach { print("$it ") }
    println()
    evenNumbers.forEach { print("$it ") }
    println()

    //----------------------------------------------------------------------------------------------------

    //*
    //**
    //***
    //****
    for(i in 1..4){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    //****
    //***
    //**
    //*
    for(i in 4 downTo 1 step 1){
        for(j in 1..i){
            print("*")
        }
        println()
    }
    //----------------------------------------------------------------------------------------------------

    // Finding whether the letters "and" in a stringt expression exist side by side
    val stringText = "Hello I' m android developer".trim()
    // TODO




}