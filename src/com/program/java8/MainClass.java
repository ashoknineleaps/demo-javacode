package com.program.java8;

public class MainClass {

    public static int addition(int a, int b)
    {
        System.out.println("a: "+a+", b: "+b);
        return a+b;
    }
    public static void main(String[] args) {

        FunctionalInterfaceDemo f = (a, b) -> addition(1, 2);

        f.sum(10, 10);
    }
}
