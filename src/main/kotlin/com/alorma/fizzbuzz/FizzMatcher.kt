package com.alorma.fizzbuzz

class FizzMatcher: Matcher {
    override fun check(number: Int): String = if (number % 3 == 0) {
        "Fizz"
    } else {
        ""
    }
}