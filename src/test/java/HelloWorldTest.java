package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        String expectedOutput = "Hello, world!";
        String actualOutput = HelloWorld.getGreeting();
        assertEquals(expectedOutput, actualOutput);
    }
}
