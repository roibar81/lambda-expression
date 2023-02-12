package com.modernjava.functionalprograming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //Looping through all the instructors and printing out the values of instructor
        Consumer<Instructor> consumer1 = (s1) -> System.out.println(s1);
        instructors.forEach(consumer1);

        //Looping through all the instructors and print their name
        System.out.println("-------------------------------------------------");
        Consumer<Instructor> consumer2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(consumer2);

        //Looping through all the instructors and print their names and their courses
        System.out.println("-------------------------------------------------");
        Consumer<Instructor> consumer3 = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(consumer2.andThen(consumer3));

        //Looping through all the instructors and print out their names if the years of user experience is > 10
        System.out.println("-------------------------------------------------");
        instructors.forEach(s1 -> {
            if(s1.getYearsOfExperience() > 10) {
                consumer1.accept(s1);
            }
        });

        //Looping through all the instructors and print out their names if the years of user experience is > 5 and teacher course online
        System.out.println("-------------------------------------------------");
        instructors.forEach(s1 -> {
            if (s1.getYearsOfExperience() > 5 && !s1.isOnlineCourses())
                consumer1.accept(s1);
        });

    }
}
