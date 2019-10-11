package com.kata.starter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
  @Test
  void example() {
    ExampleClass exampleClass = new ExampleClass();
    assertEquals(exampleClass.example(), false);
  }
}
