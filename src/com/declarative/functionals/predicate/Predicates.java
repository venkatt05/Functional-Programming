package com.declarative.functionals.predicate;

import com.declarative.Gender;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {

    public Predicate<Object> isMale = value -> value == Gender.MALE;
    public Predicate<Object> isFemale = value -> value == Gender.FEMALE;
    public BiPredicate<Object, Object> checkBothAreMales = (value1, value2) -> value1 == Gender.MALE && value2 == Gender.MALE;

}

