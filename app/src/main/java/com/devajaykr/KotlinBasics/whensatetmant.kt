package com.devajaykr.KotlinBasics

fun main() {
    var age = 13
    when (age){
        in 21..100 -> println("Swiftey")
        in 15..20 -> println("just do it")
        13,14 -> println("hey teenee")
    }
}