package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main() {

    Pair("hello", "kotlin")
    Triple("hello", "world", "kotlin")

    val instance01 = SomeClass(name = "홍길동", age = 20)
    val instance02 = SomeClass(name = "홍길동", age = 20)

    println("instance01: $instance01")


    val areSame : Boolean = instance01 == instance02
    println("instance01 == instance02 / areSame :$areSame")
    println("instance01.hashCode(): ${instance01.hashCode()}")
    println("instance02.hashCode(): ${instance02.hashCode()}")

    val data01 = SomeDataClass(name = "홍길동", age = 20)
    val data02 = SomeDataClass(name = "홍길동", age = 20)
    val dataTest = SomeDataClass()

    val areSame02 : Boolean = data01 == data02

    println("data01 == data02 / areSame02 :$areSame02")
    println("data01.hashCode(): ${data01.hashCode()}")
    println("data02.hashCode(): ${data02.hashCode()}")

    val data03 = SomeDataClass(name = "빡코딩", age = 30)

    val data04 = data03.copy(age = 20)

    println("data03.hashCode(): ${data03.hashCode()}")
    println("data04.hashCode(): ${data04.hashCode()}")

    println("data03 : $data03")
    println("data04 : $data04")


    val (name, age) = data03
    println("name: $name")
    println("age: $age")
    println("data03.component1(): ${data03.component1()}")
    println("data03.component2(): ${data03.component2()}")
    println("data03.component3(): ${data03.component3()}")
    println("data03.component4(): ${data03.component4()}")
}

class SomeClass(val name: String, val age: Int)

open class SomeOpenClass(open val name: String)
interface SomeInterface {
    var grade: String
}

// 데이터 다룰때 특화
data class SomeDataClass(override val name: String = "",
                         val age: Int,
                         val nickname: String = "없음",
                         override var grade: String = "") :
    SomeOpenClass(name = name), SomeInterface {


    constructor() : this(name = "홍길동", age = 20) {
        println("constructor() called")
    }
    init {

        println("init called")
    }

    fun sayHello() {
        println("hello")
    }
}
