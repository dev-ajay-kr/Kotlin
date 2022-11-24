package com.devajaykr.KotlinBasics
fun main() {
    for (i in 1 until 10 step 2) {
        print("$i ")
    }

    var x = 1
    while(x <= 10) {
        print("$x")
        if (x == 4){
            x = 10
        }
        x++
    }

    var z = 12
    do {
        print("$z ")
    } while(z <= 10)

    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }


        var x = 0
        for (y in 0..9) {
            x += y
        }

        println("$x")





    }
}
