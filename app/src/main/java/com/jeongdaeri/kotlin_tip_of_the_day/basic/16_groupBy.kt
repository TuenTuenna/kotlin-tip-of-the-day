package com.jeongdaeri.kotlin_tip_of_the_day.basic


data class Student(val name: String, val age: Int){}

fun main(){
    val students = mutableListOf<Student>()
    students.add(Student("학생_1", 10))
    students.add(Student("학생_1", 13))
    students.add(Student("학생_1", 16))
    students.add(Student("학생_2", 20))
    students.add(Student("학생_2", 24))
    students.add(Student("학생_2", 100))
    students.add(Student("학생_7", 101))
    students.add(Student("학생_8", 102))
    students.add(Student("학생_9", 103))
    students.add(Student("학생_10", 104))

    val result1 :  Map<String, List<Student>> = students.groupBy({
        it.name
    })
    println("result1: $result1")

    val result2  = students.groupBy(keySelector = {
        it.name
    }, valueTransform = {
        it.age
    })
    println("result2: $result2")

    // eachCount - 각 요소 갯수 합
    // fold, aggregate - 축적
    val grouping : Grouping<Student, String> = students.groupingBy(keySelector = {
        it.name
    })

    val resultA = grouping.eachCount()

    println("resultA: $resultA")

    val resultB = grouping.fold(0){ accumulator, element ->
        accumulator + element.age
    }
    println("resultB: $resultB")

    val resultC = grouping.aggregate { key, accumulator: Int?, element, first ->
        if(first)
            element.age
        else
            accumulator?.plus(element.age)
    }
    println("resultC: $resultC")

}
