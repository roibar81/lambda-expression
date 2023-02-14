package com.modernjava.functionalprograming;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Double> sqrt = Math::sqrt; // Input is Integer Output is Double
        System.out.println("Square root of 64: " + sqrt.apply(64));
        System.out.println("Square root of 81: " + sqrt.apply(81));
        System.out.println("Square root of 16: " + sqrt.apply(16));


        Function<String, String> lowercaseFunction = String::toLowerCase;
        System.out.println(lowercaseFunction.apply("PROGRAMING"));

        Function<String, String> concatFunction = (s) -> s.concat(" In Java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMING"));

        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMING"));
    }
}
