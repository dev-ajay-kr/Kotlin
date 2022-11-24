package com.devajaykr.KotlinBasics

import java.util.*

fun main(){
    var name= "Ajay"
    var nullablename: String?="rabi"
    nullablename=null;
//    name = null
    if(nullablename != null) {
        println("Hello, ${nullablename}.")
        println("Your name is ${nullablename.length} characters long.")
    } else {
        println("Hello, Guest")
    }

    val nullableName3: String? = null

    println(nullableName3?.lowercase()) // prints null
    println(nullableName3?.length) // prints null

}