package com.declarative.streams;

import com.declarative.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Stream {


    private static List<EmployeePojo> employee = new ArrayList<>();

    public static void main(String[] args) {

        employee.add(new EmployeePojo("John", 101, Gender.MALE));
        employee.add(new EmployeePojo("Shiva", 102, Gender.MALE));
        employee.add(new EmployeePojo("Girl1", 103, Gender.FEMALE));
        employee.add(new EmployeePojo("Ram", 104, Gender.MALE));
        employee.add(new EmployeePojo("Girl2", 105, Gender.FEMALE));
        employee.add(new EmployeePojo("Girl3", 106, Gender.FEMALE));

        // To get only female employees and their numbers

        Map<String, Integer> femaleEmployees = employee.stream()
                .filter(employeePojo -> employeePojo.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toMap(EmployeePojo::getName, EmployeePojo::getId));

        System.out.println(femaleEmployees);

        //List out the genders of our employees

        Set<Gender> gender = employee.stream().map(EmployeePojo::getGender).collect(Collectors.toSet());

        gender.stream().forEach(System.out::println);

    }
}
