package com.alorma.fizzbuzz

class FizzMatcher : Matcher {
    override fun getMultipleOf(): Int = 3

    override fun getOutput(): String = "Fizz"

}