package com.alorma.fizzbuzz

interface Matcher {

    fun getMultipleOf(): Int

    fun getOutput(): String

    fun check(number: Int): String = if (number % getMultipleOf() == 0) {
        getOutput()
    } else {
        ""
    }
}