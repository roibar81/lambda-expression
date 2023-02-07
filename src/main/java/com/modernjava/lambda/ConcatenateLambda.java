package com.modernjava.lambda;

public class ConcatenateLambda {

    public static void main(String[] args) {
        Concatenate concatenate = (x, y) -> x + " " + y;

        System.out.println(concatenate.strConcat("roi", "bar"));
    }
}
