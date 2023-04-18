package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    // 콜렉션
    val firstFriends = listOf("철수", "제임스", "영희", "제시카")

    val secondFriends = listOf("에이미", "잭슨", "웡", "세바스촨")

    val totalFriends = listOf(firstFriends, secondFriends)

    val flattenFriends = totalFriends.flatten()

}
