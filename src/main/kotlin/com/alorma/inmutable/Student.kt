package com.alorma.inmutable

class Student(val id: Int, val name: String, age: Age) {
    private val studentAge: Age = age.copy()

    val age: Age
        get() = studentAge.copy()
}