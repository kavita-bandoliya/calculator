package com.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Sub: " + c.sub(10, 5));
    }
}
