package com.modernjava.functionalprograming;

import java.util.function.Predicate;

public class PredicateExample {

    /*  Represents a predicate (boolean-valued function) of one argument.
     *  This is a functional interface whose functional method is test(Object).
     *  Since: 1.8
     *  Type parameters: <T> – the type of the input to the predicate
     * Functions: test(), and(), or(), negate(), isEqual(), not()
     * */
    public static void main(String[] args) {

        //if number is > 10 return true other false
        Predicate<Integer> predicate1 = (i) -> i > 10;
        System.out.println(predicate1.test(112));

        // i > 10 && number is even number (i % 2 == 0)
        System.out.println("------------------------------------------");
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        System.out.println(predicate1.and(predicate2).test(121));

        //i > 10 || number is even number (i % 2 == 0)
        System.out.println("------------------------------------------");
        System.out.println(predicate1.or(predicate2).test(2));

        //i > 10 && i % 2 != 0
        System.out.println("------------------------------------------");
        System.out.println(predicate1.and(predicate2.negate()).test(998));
    }
}
