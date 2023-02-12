package com.modernjava.functionalprograming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class SpecializeConsumersExample {

    public static void main(String[] args) {
        IntConsumer intConsumer = (s1) -> System.out.println(s1*10);
        intConsumer.accept(10);

        DoubleConsumer doubleConsumer = (s1) -> System.out.println(s1*10);
        doubleConsumer.accept(10.2);

        LongConsumer longConsumer = (s1) -> System.out.println(s1*10L);
        longConsumer.accept(10L);
    }
}
