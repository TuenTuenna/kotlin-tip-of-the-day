package com.jeongdaeri.kotlin_tip_of_the_day.basic

fun main(){

    // let, run,

    // with,

    // also, apply

    // 자기 자신 반환 - apply, also

    // scope function

    // 스코프 함수 왜 쓰지?
    // 1. 변수 사용 줄이기
    // 2. 조금 더 읽기 편하다

    var someValue : String = "안녕하세요"
    val textCount = someValue.length
    val result = textCount.toString()

    val result1 = someValue.let {
        it.length
    }.let {
        it.toString()
    }.let {
        println("it: $it")
    }


    val someValue2 : String? = "안녕하세요!"

    if (someValue2 != null){
        println("someValue2: $someValue2")
    }

    val result2 : String = someValue2?.let {
            println("값이 있다 - someValue2: $it")
            it
        } ?: "기본값"

    val numbers = (1..5).toList()

    val totalCountInfo : String = numbers
        .map {
            "숫자: ${it}"
        }.let {
            "총 갯수: ${it.size}"
        }


    val myDog = Puppy()

    println("myDog.info() : ${myDog.info()}")

    myDog.let {
        it.age = 100
    }

    println("[after let] myDog.info() : ${myDog.info()}")

    val resultB : String = myDog.run {
        age = 200
        println("myDog.info() : ${myDog.info()}")
        "안녕하세요! ${age}"
    }

    val resultC : String = with(myDog) {
        age = 300
        println("myDog.info() : ${myDog.info()}")
        "안녕하세요!!!! ${age}"
    }

    //
    myDog.also(block = {
        it.age = 400
    })
    .let {
        println("it: ${it.info()}")
    }

    myDog.apply(block = {
        age = 700
    })
    .let {
        println("it: ${it.info()}")
        it
    }

//    val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
//    recyclerView.layoutManager = LinearLayoutManager(this)
//    recyclerView.adapter = customAdapter

//    val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        .apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = customAdapter
//        }

}

data class Puppy(var name : String = "", var age : Int = 0){
    fun info(): String{
        return "name: $name age: $age"
    }
}

//T.() -> R
fun Puppy.sayAge() : String{
    return this.age.toString()
}
