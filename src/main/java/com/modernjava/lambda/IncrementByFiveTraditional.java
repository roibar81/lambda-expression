package com.modernjava.lambda;

public class IncrementByFiveTraditional implements IncrementByFive{


    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFive incrementByFive = new IncrementByFiveTraditional();
        System.out.println(incrementByFive.incrementByFive(5));
    }
}
