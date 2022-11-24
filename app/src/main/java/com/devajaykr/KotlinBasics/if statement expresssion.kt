package com.devajaykr.KotlinBasics
fun main() {

    val age = 16
    val drinkingAge = 21
    val votingAge = 18
    val drivingAge = 16
    val currentAge = if (age >= drinkingAge) {
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    } else if (age >= votingAge) {
        println("You may vote now")
//return the value for this block
        votingAge
    } else if (age >= drivingAge) {
        println("You may drive now")
//return the value for this block
        drivingAge
    } else {
        println("You are too young")
//return the value for this block
        age
    }
    print("Current age is $currentAge")
}