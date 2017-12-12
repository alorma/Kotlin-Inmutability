package com.alorma.inmutable

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TestAgeIsMutable {

    private lateinit var student: Student

    private lateinit var age: Age

    @Before
    fun setup() {
        age = Age(1, 1, 1992)
        student = Student(1, "Alex", age)
    }

    @Test
    fun shouldNotChangeAge_whenFieldAgeIsModifiedDirectly() {
        assertEquals(1992, student.age.year)

        age.year = 1993

        assertEquals(1992, student.age.year)
    }

    @Test
    fun shouldNotChangeAge_whenFieldAgeIsModifiedFromStudent() {
        assertEquals(1992, student.age.year)

        student.age.year = 1993

        assertEquals(1992, student.age.year)
    }

}