package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){


//    val friends = listOf<Any>("철수", 2, 2.3, "영희", "제임스")

    val friends = mutableListOf<String>("철수", "영희", "제임스")

//    val myFriend = friends.get(0)
//    val myFriend = friends[0]
//    val myFriend = friends.first()
    friends[0] = "호롤롤로"
    val myFriend = friends.get(0)

//    val myNumbers = arrayOf(1,2)
//    myNumbers[0] = 888
    val myNumbers = arrayListOf(1,2, 3, 4)
    myNumbers[0] = 888

    for (aNumber in myNumbers) {
        println(aNumber)
    }

}


















//
//if (myName != null) {
//    println("내 이름: $myName")
//
//} else {
//    println("myName : $myName")
//}
//
//val otherValue = myName ?: "초슈퍼 울트라 빡코더"
//val otherValue = if (myName == null) "데이터 없음" else myName
//
//println("otherValue : $otherValue")
//
//
