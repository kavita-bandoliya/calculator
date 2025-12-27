package com.demo;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

// Test for an interface method for which you don't have an implementation (do that one)
//(cliet have impl, server side not impl)(Mockito)

class Task2Test {

    @Test
    void testInterfaceWithoutImplementation() {

        Task2 obj = mock(Task2.class);

        obj.abc();

        verify(obj).abc();
    }
}
