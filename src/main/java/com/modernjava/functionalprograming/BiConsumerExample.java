package com.modernjava.functionalprograming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        //printing two numbers
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x: " + (x) + " y: " + y);
        biConsumer1.accept(2,4);

        //calculating sum of two integers
        BiConsumer<Integer, Integer> biConsumer2 = (x, y) -> System.out.println("x+y= " + (x + y));
        biConsumer2.accept(2,4);

        //concatenate strings
        BiConsumer<String,String> biConsumer3 = (x,y)-> System.out.println(x+y);
        biConsumer3.accept("Hello","World");
    }
}
