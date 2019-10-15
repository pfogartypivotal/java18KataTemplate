package com.kata.starter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz subject = new FizzBuzz();

    @Test
    void returns_list_of_1_to_100() {
        String[] fizzBuzzList = subject.getFizzBuzzed();
        assertEquals(fizzBuzzList.length, 100);
        assertEquals(fizzBuzzList[0], "1");
        assertEquals(fizzBuzzList[fizzBuzzList.length - 1], "100");
    }
}
