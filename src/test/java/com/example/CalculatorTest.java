package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void canAdd() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(3, 5);

        //then
        assertEquals(8, result);
    }

    @org.junit.jupiter.api.Test
    void canSub() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(4, 5);

        //then
        assertEquals(-1, result);
    }

    @org.junit.jupiter.api.Test
    void canMult() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.multiply(4, 5);

        //then
        assertEquals(18, result);
    }

    @org.junit.jupiter.api.Test
    void canDiv() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.divide(10, 5);

        //then
        assertEquals(1, result);
    }
}