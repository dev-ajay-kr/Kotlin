package com.devajaykr.KotlinBasics

//List – mutableListOf(),arrayListOf() and ArrayList
//Set – mutableSetOf(), hashSetOf()
//Map – mutableMapOf(), hashMapOf() and HashMap

fun main(){
    var mutatableLists= mutableListOf("Java","Kotlin","C#")
    mutatableLists.add("C++")
    mutatableLists[0]="c Programming"
    for (i in mutatableLists)
    {
        print(" $i")
    }
    var mutableSet = mutableSetOf(6,10)
    // adding elements in set
    mutableSet.add(2)
    mutableSet.add(5)
    for(item in mutableSet){
        println(item)
    }
    var mutableMap = mutableMapOf(1 to "Mahipal",2 to "Nikhil",3 to "Rahul",4 to false)
    // we can modify the element
    mutableMap[1] = "Praveen"
    // add one more element in the list
    mutableMap[4] = "Abhi"
    for(item in mutableMap.values){
        println(item)
    }
}