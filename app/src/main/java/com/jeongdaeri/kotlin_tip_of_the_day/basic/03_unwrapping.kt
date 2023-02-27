package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){
    var myName : String? = "호롤롤로"

    if (myName != null) {
        println("myName: $myName - 데이터 없음")
    } else {
        println("myName: $myName")
    }

//    val myUnwrappedName : String = if (myName == null) "이름없음" else myName
//    val myUnwrappedName : String = myName ?: "이름없음"

    val otherName : String = myName.let {
        it + " - 데이터 있음"
    }?: "이름없음"

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
