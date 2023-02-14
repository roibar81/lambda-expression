package com.modernjava.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerAdvance {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //print out name and gender of instructors
        BiConsumer<String, String> biConsumer1 = (name, gender) -> System.out.println("name is: " + name + " and the gender is: " + gender);
        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(), instructor.getGender()));

        //print out names and list of courses
        System.out.println("-------------------------------------------------");
        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out.println("Name is: " + name + " Teach courses: " + courses);
        instructors.forEach(s1 -> biConsumer2.accept(s1.getName(), s1.getCourses()));

        //print out name and gender of all instructors who teaches online
        System.out.println("-------------------------------------------------");
        BiConsumer<String, String> biConsumer3 = (name, gender) -> System.out.println("Name is: " + name + " gender is: " + gender);
        instructors.forEach(s1 -> {
            if (s1.isOnlineCourses())
                biConsumer3.accept(s1.getName(), s1.getGender());
        });
    }
}
