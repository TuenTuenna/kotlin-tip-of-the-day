package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    val myFriends = listOf("철수", "제임스", "영희", "제시카")

    val results = myFriends.mapIndexed { index, name ->
        "index: $index 이름: $name"
    }

}
