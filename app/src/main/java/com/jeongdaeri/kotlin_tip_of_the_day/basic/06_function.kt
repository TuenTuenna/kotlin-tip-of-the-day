package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    fun sayHi(){
        println("안녕하세요?")
    }

    fun sayHiWithName(name: String){
        println("안녕하세요? name: $name")
    }

//    sayHiWithName(name = "호롤롤로")

//    sayHiWithName()

    fun sayHiWithDefaultName(name: String = "쩡대리"){
        println("안녕하세요? name: $name")
    }
    sayHiWithDefaultName("호호호호")

    fun sayHiWithReturnValue() : String{
        return  "호롤롤로"
    }
    val result = sayHiWithReturnValue()
}
