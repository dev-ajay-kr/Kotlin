package com.devajaykr.KotlinBasics

fun main(){
    //arithmetic
    var x = 100 + 50
    var y=100 -50
    val pi = 3.14159
    print(pi)
    //comparision  (==, !=, <,>,<=,>=)
    //returns bool value
    print(" 5==3 is ${5==3} \n")
    print("5!=6 is ${5!=6} \n")
    print("7>4 returns ${7>4}\n")

    //Assignment operators
    //(+=, -=, *=,/=, %=)
    x =9
    x *=3
    print("$x\n")
    x /=9
    print("$x\n")
    x -=1
    print("$x\n")
// increament and decreament
    x=9
    println(x--)
    println(x)
    println(++x)
}