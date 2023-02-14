package com.modernjava.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {

    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //all instructors who teach online
        Predicate<Instructor> predicateIsOnlineCourses = Instructor::isOnlineCourses;

        //all instructors who have yearOfExperience > 10
        Predicate<Instructor> yearOfExperience10Plus = (i) -> i.getYearsOfExperience() > 10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is: " + name + " teach courses: " + courses);

        instructors.forEach(instructor -> {
            if (predicateIsOnlineCourses.and(yearOfExperience10Plus).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
