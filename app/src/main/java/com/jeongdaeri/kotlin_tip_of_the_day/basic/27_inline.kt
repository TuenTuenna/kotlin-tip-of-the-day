package com.jeongdaeri.kotlin_tip_of_the_day.basic

import kotlin.reflect.KClass


// inline - 고차함수 사용시 성능 향상
// inline 은 함수 호출이 아닌 함수 알맹이가 호출부위에 들어가는 것
// return 시 조심하기
// noinline - 나는 인라인 안할거야
// crossinline

// 제네릭 특성 - 프로그램 돌아갈때 - 타입 사라짐 - Object
// inline reified


fun main(){

//    someFunction(action = {
//        println("action() called")
//    })

//    println("helloWorld!11111")
//
//    someInlineFunction(action01 = {
//        println(" someInlineFunction action01() called")
//        return@someInlineFunction
//    }, action02 = {
//        println(" someInlineFunction action02() called")
//        return@someInlineFunction
//    }, action03 = {
//        println(" someInlineFunction action03() called")
//    })
//
//    println("helloWorld!22222")



//    println("someInlineFunction() called")
//    println(" someInlineFunction action01() called")
//    println(" someInlineFunction action02() called")
//    println(" someInlineFunction action03() called")
//    println("someInlineFunction() end")

//    List(100000, init = { it }).nonInlineTestForeach(action = {
//        val result = it * 2
//    })
//
//    println("====================")
//
//    List(100000, init = { it }).inlineTestForeach(action = {
//        val result = it * 2
//    })

//    val result01 = isTypeMatched<강아지>(param01 = 강아지())
//    println("result01 : $result01")
//
//    val result02 = isTypeMatched2(param01 = 강아지(), classType = 강아지::class)
//    println("result02 : $result02")

//    someGenericFunction(param = 강아지())
    someAnyFunction(param = 강아지())
}// main

fun <T> someGenericFunction(param: T){

}

fun someAnyFunction(param: Any){

}

class 고양이
class 강아지

inline fun <reified T> isTypeMatched(param01: Any) : Boolean {
    return param01 is T
}

fun <T : Any> isTypeMatched2(param01: Any, classType: KClass<T>) : Boolean {
    val paramClassName01 = param01::class.simpleName
    val paramClassName02 = param01.javaClass.simpleName
    val classTypeName = classType.simpleName
    return paramClassName01 == classTypeName || paramClassName02 == classTypeName
}

inline fun <reified T> someTestFunction(param01: Any) : T {
    return param01 as T
}


fun List<Int>.nonInlineTestForeach(action: (Int) -> Unit) {
    val startTime = System.nanoTime()
    for (i in  0..<this.size) {
        action(this[i])
    }
    val endTime = System.nanoTime()
    println("nonInlineTestForeach endTime - startTime: ${(endTime - startTime) / 1_000_000.0} ms")
}

inline fun List<Int>.inlineTestForeach(action: (Int) -> Unit) {
    val startTime = System.nanoTime()
    for (i in  0..<this.size) {
        action(this[i])
    }
    val endTime = System.nanoTime()
    println("inlineTestForeach endTime - startTime: ${(endTime - startTime) / 1_000_000.0} ms")
}



fun someFunction(action: () -> Unit) {
    println("someFunction() called")
    action()
    println("someFunction() end")
}

interface SomeListener {
    fun onReceive()
}

inline fun someInlineFunction(action01: () -> Unit,
                              noinline action02: () -> Unit,
                              crossinline action03: () -> Unit) {
    println("someInlineFunction() called")
    println("== action01 ==")
    action01()
    println("== action02 ==")
    action02()
    println("== action03 ==")

    object : SomeListener{
        override fun onReceive() {
            println("onReceive() called")
            action03()
        }
    }
    println("someInlineFunction() end")
}

