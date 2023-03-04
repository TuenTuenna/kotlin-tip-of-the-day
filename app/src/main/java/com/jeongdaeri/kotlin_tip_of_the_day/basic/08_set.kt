package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    // set - 유니크만 가진다
    // mutable
//    var myNumberSet = mutableSetOf<Int>(1,3,3,3,3,3,4)
    var myNumberSet = setOf<Int>(1,3,3,3,3,3,4)

    val mutableSet = myNumberSet.toMutableSet()

    mutableSet.add(10)

    mutableSet.remove(1)

    println(mutableSet)

    val results = mutableSet.withIndex()

    results.forEach { anItem ->
        println("anItem : ${anItem.index} , ${anItem.value}")
    }



}

















//    myNumberSet.remove()
//
//    val results = myNumberSet.withIndex()
//
//    results.forEach { anItem ->
//
//    }
