package com.jeongdaeri.kotlin_tip_of_the_day.basic


fun main(){

    val friends = listOf<String>("철수", "존시나", "에이미", "영희", "제임스")

    for ((index, aFriend) in friends.withIndex()) {
        println("index : $index , aFriend: $aFriend")
    }

//    for (aFriend in friends) {
//        println(aFriend)
//    }

}







