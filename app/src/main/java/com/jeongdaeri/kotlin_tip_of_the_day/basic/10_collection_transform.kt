package com.jeongdaeri.kotlin_tip_of_the_day.basic

import java.util.Comparator

fun main(){

    val myNumberMutableList = mutableListOf(1,5,7,3,3,4,4)

    myNumberMutableList.toList()

    val myNumbersSet = myNumberMutableList.toSet()

    val myOrderedNumberSet = myNumberMutableList.toSortedSet()

    val myReversedNumberSet = myNumberMutableList
        .toSortedSet(comparator = Comparator.reverseOrder())


}
















