package com.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
    
    // task
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Sub: " + c.sub(10, 5));
        System.out.println("Mul: " + c.mul(10, 5));
        System.out.println("Div: " + c.div(10, 5));
        System.out.println("Thank You ****");
        
    }

}
