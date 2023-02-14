package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String expectedOutput = "Hello, world!";
        String actualOutput = helloWorld.getGreeting();
        assertEquals(expectedOutput, actualOutput);
    }
}
