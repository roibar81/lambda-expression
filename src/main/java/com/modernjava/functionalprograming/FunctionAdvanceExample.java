package com.modernjava.functionalprograming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAdvanceExample {

    public static void main(String[] args) {
        //Map of instructors with name and years of experience
        //Function which will List<Instructors> and return a Map<String, Integer>
        //Predicate will return true if instructor have online courses
        Predicate<Instructor> predicate1 = Instructor::isOnlineCourses;
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (predicate1.test(instructor))
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
            });

            return map;
        });

        System.out.println(mapFunction.apply(Instructors.getAll()));

    }
}
