package com.demo;

import org.junit.jupiter.api.Test;

// Test for a method which returns nothing/void type
class Task1Test {

    @Test
    void testVoidMethod() {

        // Step 1: Create real object
        Task1 service = new Task1();

        // Step 2: Call void method
        service.process();

    }
}
