package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(2, 3));
    }
}
