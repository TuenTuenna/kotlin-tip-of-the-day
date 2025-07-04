package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main() {

//    val base01 = Base("호호호")
//    base01.name

//    val instance01 = Person(nameParam = "홍길동", skin = "매끈한 피부")
//
//    println("instance01.name: ${instance01.name}")

//    val instance02 = PocketMon(nameParam = "피카츄")
//    val instance02 = PocketMon(nameParam = "피카츄", contextParam = "컨텍스트")
//    val instance02 = Person(nameParam = "지우")
//    instance02.sayMyName()

//    val instance01 = Base("호호호")

    val pocketMon01 : Base = WaterPocketMon(nameParam = "꼬부기")
    pocketMon01.attack()
    pocketMon01.description = "거북이 모양이다"
    println("pocketMon01.name: ${pocketMon01.name} / pocketMon01.description: ${pocketMon01.description}")
}



open class Base(open var name : String, private var context: String = "") {

    open var description: String = ""

    init {
        println("Base init called / name: $name / context: $context")
    }

    fun sayMyName() {
        println("sayMyName() name: $name / context: $context")
    }

    open fun attack(){
        println("공격!! - 물리데미지")
    }
}



class WaterPocketMon : Base {

    override var description: String
        get() = "물 포켓몬에 대한 설명: " + super.description
        set(value) {
            super.description = value
        }

    override var name: String
        get() {
            return "물 포켓몬: ${super.name}"
        }
        set(value) {
            super.name = value
        }

    constructor(nameParam: String) : super(name = nameParam) {
        println("PocketMon constructor called / nameParam: $nameParam / name: ${this.name}")
    }

    constructor(nameParam: String, contextParam: String) :
        super(name = "이름: 없음", context = contextParam) {
        println("PocketMon constructor called / nameParam: $nameParam / contextParam: $contextParam / name: ${this.name}")
    }

    override fun attack() {
        super.attack() // 물리공격
        println("물속성 데미지 추가!!💦")
    }
}

class PocketMon : Base {

    var level : Int = 0

    constructor(nameParam: String) : super(name = "이름: $nameParam") {
        println("PocketMon constructor called / nameParam: $nameParam / name: ${this.name}")
        this.level = 100
    }

    constructor(nameParam: String, contextParam: String) :
        super(name = "이름: 없음", context = contextParam) {
        println("PocketMon constructor called / nameParam: $nameParam / contextParam: $contextParam / name: ${this.name}")
    }
}

class Person(val nameParam: String = "값없음",
             var skin: String) : Base(nameParam) {
    init {
        println("Person init called / name: ${this.name} / skin: ${this.skin}")
    }
    constructor(nameParam: String) : this(nameParam = "이름: $nameParam", skin = "피부") {
        println("PocketMon constructor called / nameParam: $nameParam / name: ${this.name}")
    }
}
