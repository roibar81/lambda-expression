package com.modernjava.functionalprograming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (X) -> System.out.println(X.length() + " the value of X: " + X);
        consumer.accept("Nice Operation");

        //Consumer with block statement
        Consumer<Integer> consumer1 = (X) -> {
            System.out.println("X*X = " + X * X);
            System.out.println("X/X = " + X / X);
        };
        consumer1.accept(10);

        Consumer<Double> consumer2 = (X) -> {
            System.out.println("X in: "+X);
            System.out.println("X*X in: "+X*X);
            System.out.println("X/X in: "+X/X);
        };
        consumer2.accept(99.9);
    }
}
