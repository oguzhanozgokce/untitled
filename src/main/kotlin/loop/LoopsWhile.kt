package loop

fun main() {
    /**
     * while -> condition is true -> loop is working -> condition is false -> loop is stopping -> exit loop -> continue program -> Turkish translate:  condition true ise dongu calisiyor -> condition false ise dongu duruyor -> donguden cik -> programi devam ettir
     */

    var number = 0

    while (number < 5){
        print("${number++} , ")
    }
    println()

//    while (number < 5){   // 5 < 5 -> false -> exit loop -> continue program
//        print("$number , ")
//        number++
//    }
    println("-------------------------------------")

    // for loop + if  = while loop

    for (value in 0..5){
        if (value <5 ){
            print("$value , ")
        }
    }

}