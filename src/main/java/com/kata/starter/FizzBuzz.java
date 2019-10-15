package com.kata.starter;

public class FizzBuzz {

    public String[] getFizzBuzzed() {
        String[] fizzBuzzList = new String[100];
        for(int i = 0; i < 100; i++) {
            fizzBuzzList[i] = String.valueOf(i+1);
        }
        return fizzBuzzList;
    }
}
