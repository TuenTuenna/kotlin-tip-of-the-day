package com.jeongdaeri.kotlin_tip_of_the_day.basic

import android.os.Handler
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): kotlin.Unit = runBlocking {


    var user01 = MyDataObject
    var user02 = MyDataObject
    println("user01: $user01")
    println("user01.toString: ${user01.toString()}")
    println("user01.hashCode: ${user01.hashCode()}")

    val areTheSame = user01.equals(user02)
    println("areTheSame : $areTheSame")

    println("user02: $user02")
    println("user02.hashCode: ${user02.hashCode()}")

    var info01 = UserInfo
    var info02 = UserInfo
    println("info01: $info01")
    println("info01.hashCode: ${info01.hashCode()}")

    println("info02: $info02")
    println("info02.hashCode: ${info02.hashCode()}")



//    var someInstance = object : SomeUser(name = "호호"),
//        Liking {
//        override var name: String = "쩡대리"
//        var age: Int = 30
//        override fun saySomething() {
//            println("saySomething")
//        }
//    }
//
//    println("someInstance: $someInstance")
//    println("someInstance.name: ${someInstance.name}")
//    println("someInstance.age: ${someInstance.age}")


//    var user01 = SomeUser(name = "홍길동")
//    var user02 = SomeUser(name = "홍길동")
//    println("user01: $user01")
//    println("user01.hashCode: ${user01.hashCode()}")
//
//    println("user02: $user02")
//    println("user02.hashCode: ${user02.hashCode()}")

//    var info01 = UserInfo
//    var info02 = UserInfo
//
//    println("info01: $info01")
//    println("info01.hashCode: ${info01.hashCode()}")
//    println("info02: $info02")
//    println("info02.hashCode: ${info02.hashCode()}")

//    launch {
//        println("launch start")
//        delay(2000)
//
//        println("launch end / UserInfo: ${UserInfo.name}")
//    }
}



class TestUser{

    var someInstance: SomeUser = object : SomeUser(name = "호호"),
        Liking {
        override var name: String = "쩡대리"
        var age: Int = 30
        override fun saySomething() {
            println("saySomething")
        }
    }
    fun getSomeUser() : SomeUser {
        return object : SomeUser(name = "호호"),
            Liking {
            override var name: String = "쩡대리"
            var age: Int = 30
            override fun saySomething() {
                println("saySomething")
            }
        }
    }
}

open class SomeUser(open val name: String)

interface Liking {
    fun saySomething()
}

// 컴파일
// 프로그램언어 -> 10101011

// 프로그램 돌아간다 - 런타임
class Superman{

    companion object {
        const val TAG = "SUPERMAN 태그"

        fun saySomething() {
            println("saySomething")
        }
    }
}

open class SuperClass(var age: Int)

data object MyDataObject {
    var name: String = "홍길동"
}

object UserInfo :
    SuperClass(age = 10),
    Liking{
    var name: String = "호롤ㄹ로로"

    override fun saySomething() {
        println("saySomething")
    }

    init {
        println("UserInfo init called")
    }
}
