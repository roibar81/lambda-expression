package com.modernjava.lambda;

public class ConcatenateTraditional implements Concatenate{
    @Override
    public String strConcat(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static void main(String[] args) {
        Concatenate concatenate = new ConcatenateTraditional();
        System.out.println(concatenate.strConcat("roi","bar"));
    }
}
