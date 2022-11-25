package com.devajaykr.KotlinBasics

fun main(){

    val immutablelists= listOf<Any>("java","Golag",5,false)//any generic supports all types of data but should be used with care
    for (i in immutablelists)
    {
        println(i)
    }

    val immutableSets = setOf<Any>("Java","Golang",5,false)
    for (i in immutableSets){
        println(i)
    }
    fun main(args : Array<String>) {
        var immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul")
        // gives compile time error
        // immutableMap.put(9,"Praveen")
        for(key in immutableMap.keys){
            println(immutableMap[key])
        }

}
}
