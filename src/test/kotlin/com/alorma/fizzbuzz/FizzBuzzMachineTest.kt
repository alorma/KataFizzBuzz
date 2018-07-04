package com.alorma.fizzbuzz

import assertk.assert
import org.junit.Before
import org.junit.Test

class FizzBuzzMachineTest {

    companion object {
        private const val FIZZ = "Fizz"
        private const val BUZZ = "Buzz"
        private const val FIZZ_BUZZ = "FizzBuzz"
    }

    private lateinit var machine: FizzBuzzMachine

    @Before
    fun setup() {
        machine = FizzBuzzMachine()
    }

    @Test
    fun `return FIZZ when number is three`() {
        val result = machine.check(3)

        assert(result).isEqualTo(FIZZ)
    }

    @Test
    fun `return BUZZ when number is five`() {
        val result = machine.check(5)

        assert(result).isEqualTo(BUZZ)
    }

    @Test
    fun `return FIZZBUZZ when number is fifteen`() {
        val result = machine.check(15)

        assert(result).isEqualTo(FIZZ_BUZZ)
    }

    @Test
    fun `return same value when number is not multiple`() {
        val result = machine.check(7)

        assert(result).isEqualTo("7")
    }

    @Test
    fun `return FIZZ when number is multiple of three`() {
        val result = machine.check(9)

        assert(result).isEqualTo(FIZZ)
    }

    @Test
    fun `return BUZZ when number is multiple of five`() {
        val result = machine.check(25)

        assert(result).isEqualTo(FIZZ)
    }

    @Test
    fun `return FIZZBUZZ when number is multiple of three and five`() {
        val result = machine.check(90)

        assert(result).isEqualTo(FIZZ)
    }

}