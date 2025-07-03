package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){
    // take

    val numbers : List<Int> = (1..100).toList()

    // 1~10
    val result1 = numbers.take(10)
    println("result1: $result1")

    // 91~100
    val result2 = numbers.takeLast(10)
    println("result2: $result2")

    // 앞 줄부터 드랍 시킨다
    val resultA = numbers.takeWhile({
        val condition = it > 30
        println("takeWhile - it: $it condition: $condition")
        condition
    })

    println("resultA: $resultA")

    // 뒷 줄부터 드랍
    val resultB = numbers.takeLastWhile({
        val condition = it > 80
        println("takeLastWhile - it: $it condition: $condition")
        condition
    })

    println("resultB: $resultB")

    val someValue : String? = "헬로우"

    val resultT = someValue.takeIf {
        it == "헬로우"
    }
//
//    someValue.takeIf {
//        it == "헬로우"
//    }.let {  }
//        .run {  }

    val resultAA = numbers.takeIf({
        it.size > 100
    }) ?: listOf()

    println("resultAA : $resultAA")

    val resultBB = numbers.takeUnless({
        it.contains(10)
    })

    println("resultBB : $resultBB")

}
