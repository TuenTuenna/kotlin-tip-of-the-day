package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    sayHello("asdf")
    var result01 = sayHello(122)

    result01 = "asdfasdf"
    result01 = 야채()

    val result = sayHello(야채())

    val result02 = sayGoodMorning(야채(), 123)

    val restaurant01 : 식당<짜장면, 감자> = 식당<짜장면, 감자>(food = 짜장면(), ingredient = 감자())
    val result03 : 짜장면 = restaurant01.serveFood()

    val food01 : 요리 = orderSpecialFood(탕수육())

    val restaturant02 : 레스토랑<in 감자, out 요리> = 한식당()

    val food02 : 요리 = restaturant02.doneCooking()
    restaturant02.startCooking(param01 = 감자())

    val pizza01 : 피자<in 감자> = 고르곤졸라피자(param = 야채())
    val pizza02 : 피자<out 식재료> = 고르곤졸라피자(param = 야채())

}

fun goToRestaurant(param01: 레스토랑<야채, 볶음밥>) {
    val myRestaurant : 레스토랑<in 감자, out 요리> = param01
    val result01 : 요리 = myRestaurant.doneCooking()
    myRestaurant.startCooking(param01 = 감자())

    val myRestaurant02 : 레스토랑<*, *> = param01
    if (myRestaurant02 is 한식당) {
        myRestaurant02.doneCooking()
        myRestaurant02.startCooking(야채())
    }

    if (myRestaurant02 is 양식당) {
        myRestaurant02.doneCooking()
        myRestaurant02.startCooking(감자())
    }

}


// 불변 - invariance
// 그 자료형만 가능

// 공변 - covariance
// 반환 하는 자료형

// 반공변 - contravariance
// 매개변수의 자료형

open class 볶음밥: 요리()
class 김치볶음밥: 볶음밥()
open class 식재료
open class 야채 : 식재료()
class 감자: 야채()

//interface 레스토랑<in I, out F> {
interface 레스토랑<I, F> {
    fun startCooking(param01: I)
    fun doneCooking() : F
}

class 한식당: 레스토랑<야채, 볶음밥> {
    override fun startCooking(param01: 야채) {

    }
    override fun doneCooking(): 볶음밥 {
        return 볶음밥()
    }
}

class 양식당: 레스토랑<감자, 김치볶음밥> {
    override fun startCooking(param01: 감자) {

    }
    override fun doneCooking(): 김치볶음밥 {
        return 김치볶음밥()
    }
}

open class 피자<I : 식재료>(val param: I)
class 고르곤졸라피자<P : 야채>(param: P) : 피자<P>(param)


// 자료형
// 함수 - 매개변수, 반환
// 클래스 맴버변수

fun <Food> orderSpecialFood(param01: Food) : Food where Food : 접시요리, Food: 스페셜요리{
    println("orderFood - param01: $param01")
    return param01
}

fun <Food : 요리> orderFood(param01: Food) : Food {
    println("orderFood - param01: $param01")
    return param01
}


// Any 아무거나
// Generic 제네릭 - 도화지

interface 스페셜요리
interface 접시요리

open class 요리
open class 짜장면 : 요리(), 접시요리
class 쟁반짜장 : 짜장면(), 스페셜요리, 접시요리
class 탕수육 : 요리(), 스페셜요리, 접시요리

class 식당<F, I : 식재료>(val food: F, val ingredient: I? = null){

    fun serveFood() : F {
        return this.food
    }

    fun orderFood() : Any {
        return Any()
    }

    fun <B> bakingBread(param01: B) {
    }
}


fun <A, B> sayGoodMorning(param01: A, param02: B) : A{
    println("sayGoodMorning - param01: $param01")
    return param01
}



fun sayHello(param01: Any) : Any{
    println("sayHello - param01: $param01")
    return param01
}
