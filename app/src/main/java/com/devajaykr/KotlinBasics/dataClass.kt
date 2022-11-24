package com.devajaykr.KotlinBasics
data class User(val id:Long, var name:String)
fun main(){
    val u1=User(1,"Ajay")
    println(u1.name)
    u1.name="Raone"
    println(u1.name)
    val u2=User(2,"Avinash" )
    println(u1.equals(u2))//check weather the objects are samw
    println("Ussr details are: \n $u1")

    println(u1.component1())

}