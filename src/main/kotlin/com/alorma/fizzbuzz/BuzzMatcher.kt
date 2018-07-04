package com.alorma.fizzbuzz

class BuzzMatcher: Matcher {
    override fun getMultipleOf(): Int = 5

    override fun getOutput(): String = "Buzz"
}