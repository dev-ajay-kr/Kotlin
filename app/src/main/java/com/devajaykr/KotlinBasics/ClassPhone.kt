package com.devajaykr.KotlinBasics



fun main(){
    val iphone = ClassPhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 =ClassPhone("Android","Samsung", "Galaxy S20")
    val mateXS =ClassPhone("Android", "Huawei", "Mate X S")
}

class ClassPhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}