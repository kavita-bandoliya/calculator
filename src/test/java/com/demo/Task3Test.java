package com.demo;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

// Test for number of times the method call is made
class Task3Test {

    @Test
    void testMethodCallCount() {

        // Step 1: Create mock object
    	Task3 obj = mock(Task3.class);

        // Step 2: Call method
        obj.abc();
        obj.abc();

        // Step 3: Verify number of calls
        verify(obj, times(2)).abc();
    }
}
