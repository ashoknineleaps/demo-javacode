package com.program.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SquareDemo {

    public static int square(int n)
    {
        return n * n;
    }
    public static void main(String[] args) {

        System.out.println("The Square of 4 is: "+square(4));

        System.out.println("The Square of 5 is: "+square(5));

        System.out.println("================Using FunctionalInterface - Function================");

        Function<Integer, Integer> f = i -> i * i;

        System.out.println("The square of 6 is: "+f.apply(6));
        System.out.println("The square of 7 is: "+f.apply(7));

        System.out.println("================Using FunctionalInterface - Pradicate================");

        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println("check i is even or not: "+p.test(2));
        System.out.println("check i is even or not: "+p.test(3));

        System.out.println("================Using FunctionalInterface - Consumer================");
        Consumer<Integer> c = i  -> System.out.println("Print i value is: "+i);
        c.accept(10);

        System.out.println("================Using FunctionalInterface - Funcation================");

        Function<String, Integer> ff = s -> s.length();

        System.out.println("Length of String is: "+ff.apply("Ashok"));
    }
}
