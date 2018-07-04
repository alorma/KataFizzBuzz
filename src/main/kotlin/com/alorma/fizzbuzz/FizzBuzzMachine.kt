package com.alorma.fizzbuzz

class FizzBuzzMachine {

    private var matchers: List<Matcher> = listOf(FizzMatcher(), BuzzMatcher())

    fun check(number: Int): String {
        var result = ""
        matchers.forEach {
            result += it.check(number)
        }
        return result.takeIf { it.isNotEmpty() } ?: number.toString()
    }
}