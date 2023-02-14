package com.modernjava.functionalprograming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateAdvanceExample {

    public static void main(String[] args) {

        //all instructor who teaches online
        Predicate<Instructor> predicate1 = (i) -> i.isOnlineCourses() == true;

        //instructor experience is > 10 years
        Predicate<Instructor> predicate2 = (i) -> i.getYearsOfExperience() > 10;

        List<Instructor> instructors = Instructors.getAll();

        //print the name of all instructor who teaches online
        instructors.forEach(s1 -> {
            if(predicate1.test(s1))
                System.out.print(s1.getName()+", ");
        });
        System.out.println();
        //print the name of all instructor who teaches online && years of experience > 10 years
        instructors.forEach(s1 -> {
            if(predicate1.and(predicate2).test(s1))
                System.out.println(s1);
        });
    }


}
