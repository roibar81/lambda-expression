package com.modernjava.functionalprograming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("Roi", 10, "Software Development", "M", true,
                Arrays.asList("Java Programing", "C++ Programing", "Python Programing"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", true,
                Arrays.asList("Multi-Thread Programing", "CI/CD", "Unit Testing"));
        Instructor instructor3 = new Instructor("Guy", 6, "Manager", "M", false,
                Arrays.asList("C++ Programing", "C Programing", "React Native"));
        Instructor instructor4 = new Instructor("Moshe", 10, "Manager", "M", false,
                Arrays.asList("Java Programing", "Angular Programing", "React Native"));
        Instructor instructor5 = new Instructor("Shay", 15, "Principal Engineer", "M", true,
                Arrays.asList("Java Programing", "Java Multi-Thread Programing", "React Native"));
        Instructor instructor6 = new Instructor("Shani", 12, "Electronic Engineer", "F", true,
                Arrays.asList("Embedded Programing", "C Programing", "Electromagnetic advance"));

        return Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5, instructor6);
    }
}
