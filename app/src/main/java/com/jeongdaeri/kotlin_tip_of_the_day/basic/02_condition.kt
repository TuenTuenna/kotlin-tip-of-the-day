package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    var isDarkModeOn : Boolean = true

    if (!isDarkModeOn) {
        println("다크모드 입니다. $isDarkModeOn")
    }

    val result : String = if (isDarkModeOn == true) "다크모임" else "라이트모드"

    val result2 : String = if (!isDarkModeOn) "라이트모드" else "다크모임"

    when(isDarkModeOn) {
        true -> println("다크모드 입니다!")
        false -> println("다크모드가 아닙니다!")
    }
}
