package com.modernjava.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {

        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World Lambda";
        };

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
