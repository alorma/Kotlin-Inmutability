package com.alorma.inmutable

class Student(val id: Int, val name: String, age: Age) {
    val age: Age = age.copy()
}