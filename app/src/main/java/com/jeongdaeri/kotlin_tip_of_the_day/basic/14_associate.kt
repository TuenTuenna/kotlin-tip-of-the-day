package com.jeongdaeri.kotlin_tip_of_the_day.basic

data class Bread(val name: String, val price: Int){}

fun main(){

    val breadList = mutableListOf<Bread>()

    breadList.add(Bread("단팥빵1", 1000))
    breadList.add(Bread("단팥빵2", 1100))
    breadList.add(Bread("단팥빵3", 1200))
    breadList.add(Bread("단팥빵4", 1300))
    breadList.add(Bread("단팥빵4", 1400))
    breadList.add(Bread("단팥빵4", 1500))
    breadList.add(Bread("단팥빵4", 1600))
    breadList.add(Bread("단팥빵4", 1700))
    breadList.add(Bread("단팥빵4", 1800))
    breadList.add(Bread("단팥빵4", 1900))
    breadList.add(Bread("단팥빵4", 2000))

    println("breadList: $breadList")

    // associateWith = 키: 요소, 값: 매개변수
    val breadMap1 : Map<Bread, Int> = breadList.associateWith({ it.price })
    println("breadMap1: $breadMap1")

    // associateBy = 키: 매개변수, 값: 요소
    val breadMap2 : Map<String, Bread> = breadList.associateBy({ it.name })
    println("breadMap2: $breadMap2")

    // associate = 키: 요소, 값: 요소
    val breadMap3 : Map<String, Bread> = breadList.associate({ "키: ${it.name}" to it })
    println("breadMap3: $breadMap3")
}
