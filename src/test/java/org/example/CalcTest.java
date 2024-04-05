package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calc.add(2,2));
    }

    @Test
    @DisplayName("Substract two numbers")
    void sub() {
        assertEquals(2, Calc.sub(6, 4));
    }

}