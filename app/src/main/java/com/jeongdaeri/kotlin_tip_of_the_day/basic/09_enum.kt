package com.jeongdaeri.kotlin_tip_of_the_day.basic

enum class Pet(val info: String) {
    CAT("고양이"), DOG("강아지"), BIRD("앵무새")
}

fun main(){
    val pet = Pet.DOG

    when (pet) {
        Pet.CAT -> println("고양이 입니다!")
        Pet.DOG -> {
            println("${pet.info} 입니다!")
        }
        else -> {
            println("하하하")
        }
    }

}












//enum class PetType(val info: String) {
//    CAT("고양이"), DOG("강아지"), BIRD("앵무새")
//}

//val petType = PetType.DOG
//
//when(pet) {
//    Pet.CAT -> {
//        println("야옹~")
//    }
//    Pet.DOG -> {
//        println("멍멍!")
//    }
//    else -> {
//        println("짹쨱!")
//    }
//}
//
//when(petType) {
//    PetType.CAT -> {
//        println("${petType.info}: 야옹~")
//    }
//    PetType.DOG -> {
//        println("${petType.info}: 멍멍!")
//    }
//    else -> {
//        println("${petType.info}: 짹쨱!")
//    }
//}
