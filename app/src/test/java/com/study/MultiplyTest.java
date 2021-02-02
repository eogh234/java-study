package com.study;

import com.study.week4.Multiply;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    @DisplayName("테스트1 4 X 6 = 24")
    void multi1() {
        Multiply multiply = new Multiply(4, 6);
        assertEquals(multiply.multi(multiply.getX(), multiply.getY()), 24);
    }
    @Test
    @DisplayName("테스트2 4 X 7 = 28")
    void multi2() {
        Multiply multiply = new Multiply(4, 7);
        assertEquals(multiply.multi(multiply.getX(), multiply.getY()), 24);
    }
}