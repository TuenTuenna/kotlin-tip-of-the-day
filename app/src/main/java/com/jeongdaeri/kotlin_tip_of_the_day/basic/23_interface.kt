package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    val pocketMon01 : 쥬피썬더 = 쥬피썬더(
        name = "작은 쥬피썬더", age = 100, attackPower = 100,
        healthStat = 1000
    )
    val pocketMon02 : 피카츄 = 피카츄()

    gatherLigntening(pocketMon02)

}

fun gatherLigntening(lightning: Lightning){
    lightning.chainAttact()
    lightning.moveFast()
}

// 배틀에 특화된
interface Fighting {

    val healthStat : Int

    // 연쇄 공격
    fun chainAttact() {
        println("Fighting - 연쇄 공격!")
    }
}

interface Lightning {
    // 연쇄 공격
    fun chainAttact() {
        println("Lightning - 번개 연쇄 공격!")
    }

    fun moveFast() {
        println("Lightning - 재빠른 이동!!")
    }
}

open class 이브이(var name: String, var age: Int) {
    open fun sayInfo(){
        println("sayInfo calle / name: $name / age: $age")
    }
}

class 피카츄: Lightning {
    override fun chainAttact() {
        super.chainAttact()
        println("피카츄 백만볼트!! ")
    }
}

class 쥬피썬더(name: String,
           age: Int,
           val attackPower: Int,
           override val healthStat: Int
) :
    이브이(name, age),
    Fighting,
    Lightning
{

    override fun sayInfo() {
        super.sayInfo()
        println("쥬피썬더 입니다. / attackPower: $attackPower")
    }

    override fun chainAttact() {
//        super<Fighting>.chainAttact()
        super<Lightning>.chainAttact()

        var randomPoint = (1..100).random()
        println("쥬피썬더 - 연쇄공격!! / attack: $randomPoint")
    }

}
