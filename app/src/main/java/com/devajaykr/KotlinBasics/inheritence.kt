package com.devajaykr.KotlinBasics

import java.time.temporal.TemporalAmount


//open class vehicles{
//
//}
open class car(val name: String, val brand:String){
    open var range: Double=0.0
    fun extensRange(amount :Double){
        if (amount>0)
            range +=amount
    }
    open fun drive(distance: Double){
        println("Drove for about $distance")

    }
}
class ElectricCar(name: String,  batteryLife: Double, brand: String):car(name,brand ){

}