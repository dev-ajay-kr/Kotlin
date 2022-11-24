package com.devajaykr.KotlinBasics

class Person1(var firstName: String, var lastName: String) {
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

}
fun main(){
    val aadmi=Person1("Ajaya ", "Kumar")
    print("${aadmi.firstName +aadmi.lastName}")

}

