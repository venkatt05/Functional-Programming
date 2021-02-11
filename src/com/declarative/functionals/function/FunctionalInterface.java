package com.declarative.functionals.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface {

    public final Function<Integer, Integer> square = num -> num * num;

    public final Function<Integer, Integer> multiplyByTen = num -> num * 10;

    public final Function<Integer, Integer> lastDigitOfNumber = num -> num % 10;

    public final BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
}
