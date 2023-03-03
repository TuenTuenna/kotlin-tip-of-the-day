package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

// Pair<A, B>
// mutable O, X

    val nameAgePairs = mapOf<String, Int>(
        "철수" to 10,
        "영희" to 13, "영희" to 13, "영희" to 13, "영희" to 13
    )

//    val nameAgePairs2 = mapOf<String, Int>(Pair("철수", 20), Pair("영희", 23))

    val nameAgePairs2 = mutableMapOf<String, Int>(Pair("철수", 20), Pair("영희", 23))

    nameAgePairs2.put("호호", 20)
    nameAgePairs2["호호"] = 25

    val keys = nameAgePairs2.keys

    val values = nameAgePairs2.values

    val emptyPairs = emptyMap<String, Int>()



}








//    val nameAges = mutableMapOf<String, Int>("호호" to 8)
////    val nameAges = mutableMapOf<String, Int>()
//
//    nameAges["철수"] = 10
//    nameAges.put("철수", 10)
//    nameAges.put("철수", 10)
//    nameAges.put("철수", 10)
