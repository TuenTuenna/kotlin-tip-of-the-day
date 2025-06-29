package com.jeongdaeri.kotlin_tip_of_the_day.basic

data class Friend(val name: String, val age: Int){}

fun main(){
    val myFriends = mutableListOf<Friend>()

    myFriends.add(Friend("Bob1", 10))
    myFriends.add(Friend("Bob2", 13))
    myFriends.add(Friend("Bob3", 16))
    myFriends.add(Friend("Bob4", 20))
    myFriends.add(Friend("Bob5", 24))
    myFriends.add(Friend("Bob6", 100))
    myFriends.add(Friend("Bob6", 101))
    myFriends.add(Friend("호시기dd", 102))
    myFriends.add(Friend("Bob6", 103))
    myFriends.add(Friend("Bob6", 104))

    val youngFriends = myFriends.filter(FriendFilter.YOUNG::filter)

    println("youngFriends : ${youngFriends}")

    val oldFriends = myFriends.filter(FriendFilter.OLD::filter)

    println("oldFriends : ${oldFriends}")

    // 요소 찾기 가능
    val foundFriend = myFriends.filter({
        it.name == "호시기"
    }).firstOrNull()

    println("foundFriend : ${foundFriend}")
}

enum class FriendFilter {
    OLD, YOUNG;
    fun filter(friend: Friend) : Boolean {
        return when(this) {
            OLD -> friend.age >= 20
            YOUNG -> filterYoung(friend)
        }
    }
}

data class Todo(val title: String, val isDone: Boolean)

enum class TodoFilter {
    ON_PROGRESS, DONE;
    fun filter(todo: Todo) : Boolean {
        return when(this) {
            ON_PROGRESS -> todo.isDone == false
            DONE -> {
                todo.isDone == true
            }
        }
    }
}

fun filterYoung(friend: Friend) : Boolean {
    return friend.age < 20
}
