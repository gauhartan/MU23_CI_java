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
        int result = calc.subtract(3, 5);

        //then
        assertEquals(8, result);
    }
}