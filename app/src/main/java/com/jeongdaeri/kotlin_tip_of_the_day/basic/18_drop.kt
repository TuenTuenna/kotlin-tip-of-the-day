package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){
    // drop

    val numbers : List<Int> = (1..100).toList()

    // 11~100
    val result1 = numbers.drop(10)
    println("result1: $result1")

    // 1~90
    val result2 = numbers.dropLast(10)
    println("result2: $result2")

    // 앞 줄부터 드랍 시킨다
    val resultA = numbers.dropWhile({
        val condition = it > 30
        println("dropWhile - it: $it condition: $condition")
        condition
    })

    println("resultA: $resultA")

    // 뒷 줄부터 드랍
    val resultB = numbers.dropLastWhile({
        val condition = it < 80
        println("dropLastWhile - it: $it condition: $condition")
        condition
    })

    println("resultB: $resultB")

    val resultC = numbers.filter({
        val condition = it > 80
        println("filter - it: $it / condition: $condition")
        condition
    })

    println("resultC: $resultC")
}
