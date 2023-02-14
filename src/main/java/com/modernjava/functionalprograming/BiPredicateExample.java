package com.modernjava.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //BiPredicate online and experience
        BiPredicate<Boolean,Integer> biPredicate = (online, experience) -> online && experience > 10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is: " + name + " teach courses: " + courses);

        instructors.forEach(instructor -> {
            if (biPredicate.test(instructor.isOnlineCourses() , instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
