package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){
    // 사람

//    장난감 이름
//    장난감 가격

    // 객체 인스턴스
//    val toy01 : Toy = Toy(nickname = "빡코딩")

//    toy01.name = "조이"
//    toy01.price = 10000


//    println("toy01: ${toy01.info()}")


//    val toy02 : Toy = Toy(hasPrice = false)
//    println("toy02: $toy02")

    val toy03 : Toy = Toy(param = mapOf("nickname" to "호롤롤로"))
//    println("toy03: ${toy03.info()}")

//    val toy04 = Toy()
    val toy05 = Toy.getInstance()

    val drink01 = Drink("맥주")


    val candy01 = Candy(name = "dhdh")
}

// 주 생성자 - primary constructor
// 추가 생성자 - constructor

class Candy() {
    constructor(name: String) : this() {
        println("name: $name")
    }
}

class Drink constructor(private val context: String, val price : Int = 100) {
    init {
        println("init called / context: $context")
    }
    fun info() : String {
        return "[context: $context price: $price]"
    }
}


class Toy(var name : String = "이름없음",
          var price: Int = 100) {
    // 맴버변수, property

    var nickname : String = ""

    init {
        println("init called 1")
    }
    init {
        println("init called 2")
    }
    init {
        println("init called 3")
    }
    init {
        println("init called 4")
    }

    constructor(nickname: String) : this("이름없음", 100){
        this.nickname = nickname
        println("constructor() 호출 / name: ${this.name} / price: ${this.price} / nickname: ${this.nickname}")
    }

    constructor(hasPrice: Boolean) : this("이름없음2", 1000) {
        if (hasPrice == false) {
            this.price = 0
            this.name = "가격없음"
        }
        println("constructor(hasPrice: Boolean) 호출 / name: ${this.name} / price: ${this.price}")
    }

    constructor(param: Map<String, Any>) : this(hasPrice = false) {
        val receivedNickname = param.get("nickname") ?: "닉네임 없음"

        this.nickname = receivedNickname.toString()
        println("constructor(param: Map<String, Any>) 호출 / name: ${this.name} / price: ${this.price} / nickname: ${this.nickname}")
    }

    // 메소스
    fun info() : String {
        return "[name: $name price: $price]"
    }

    companion object Factory {
        fun getInstance() : Toy {
            return Toy(param = mapOf("nickname" to "호롤롤로"))
        }
    }

}







