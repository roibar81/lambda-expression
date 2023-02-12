package com.modernjava.functionalprograming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class SpecializePredicateExample {

    public static void main(String[] args) {
        IntPredicate intPredicate = (i) -> i > 100 || i == 100;
        System.out.println(intPredicate.test(100));

        LongPredicate longPredicate = (i) -> i > 100L;
        System.out.println(longPredicate.test(11L));

        DoublePredicate doublePredicate = (i) -> i < 100.25;
        DoublePredicate doublePredicate2 = (i) -> i > 100.10;
        System.out.println(doublePredicate.and(doublePredicate2).test(100.15));
    }
}
