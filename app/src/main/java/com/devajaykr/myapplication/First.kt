package com.devajaykr.myapplication

    fun main() {
        var namer="ajay"
        val mastre="Ajay"
//        mastre="hi"
        namer="Ajay"


        // Integer TYPES: Byte (8 bit), Short (16 bit),
// Int (32 bit), Long (64 bit)

            // This is a comment. Comments start with //
            // val is used for variables which are immutable (not changable)


            /* This is a multi line comment starts with /* and ends with *'/ without the '
             var is used for variables which are mutable/changeable.
             kotlin is a strongly typed language that supports Type Inference.
             The compiler will directly assume the size and type to a variable by that.
             For example, if you assign any whole number to a variable,
             the compiler will directly assume that the variable is of type Int
            */ */
            var myAge = 31

            // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
            val myByte: Byte = 13
            val myShort: Short = 125
            val myInt: Int = 123123123
            val myLong: Long = 12_039_812_309_487_120

            // Floating Point number Types: Float (32 bit), Double (64 bit)
            val myFloat: Float = 13.37F
            val myDouble: Double = 3.141592653589793

            // Booleans the type Boolean is used to represent logical values.
            // It can have two possible values true and false.
            var isSunny: Boolean = true
            // not sunny anymore...

            print("Hi Bro $namer")
    }
