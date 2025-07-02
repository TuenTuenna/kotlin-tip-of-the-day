package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    val myPets : List<String> = listOf<String>("고양이", "강아지", "소")

    val reversed1 = myPets.reversed()
    val reversed2 = myPets.asReversed()

    println("myPets : $myPets")
    println("reversed1 : $reversed1")
    println("reversed2 : $reversed2")

    val myPets2 : MutableList<String> = mutableListOf<String>("고양이", "강아지", "소")

    println("original - myPets2 : $myPets2")
    myPets2.reverse()
    println("[after reverse] original - myPets2 : $myPets2")

    // 순서가 뒤집힘
    val result : MutableList<String> = myPets2.asReversed()

    println("[after asReversed] result : $result")

    myPets2.add("토끼")
    println("original - myPets2 : $myPets2")
    println("[after asReversed] result : $result")
    result.add("제비")
    println("original - myPets2 : $myPets2")
    println("=========")

    val newResult : List<String> = myPets2.reversed()
    println("original - myPets2 : $myPets2")
    println("newResult : $newResult")

    myPets2.add("토끼")
    println("original - myPets2 : $myPets2")
    println("newResult : $newResult")

}
