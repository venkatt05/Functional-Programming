package com.declarative;

import static com.declarative.functionals.consumer.ConsumerInterface.printValue;
import static com.declarative.functionals.consumer.ConsumerInterface.printValues;
import static com.declarative.functionals.supplier.SupplierInterface.generateRandomNumber;

import com.declarative.functionals.Gender;
import com.declarative.functionals.function.FunctionalInterface;
import com.declarative.functionals.MyFunctionalInterface;
import com.declarative.functionals.predicate.Predicates;

public class Main {

    static FunctionalInterface function = new FunctionalInterface();

    static MyFunctionalInterface customFunction = (a, b) -> a + b;

    static Predicates predicate = new Predicates();

    public static void main(String[] args) {

        // Function -> takes only one input
        printValue.accept("--------Function-----------");

        Integer randomNumber = generateRandomNumber.get();

        printValue.accept("Generated random number : " + randomNumber);
        printValues.accept("Square ", function.square.apply(randomNumber));

        // Function declared inside will be executed after the first function call
        printValues.accept("Square andThen FindLastDigit andThen multiply by 10",
                function.square.andThen(function.lastDigitOfNumber).andThen(function.multiplyByTen).apply(randomNumber));

        // Function declared inside will be executed before the first function call
        printValues.accept("Square and than find last digit", function.lastDigitOfNumber.compose(function.square).apply(randomNumber));

        // Custom functional interface
        printValues.accept("Sum of 55 and 50", customFunction.getSum(55, 50));

        // BiFunction -> Takes two inputs and gives us a output
        printValue.accept("--------BiFunction----------");
        Integer sum = function.sum.apply(10, 25);
        printValues.accept("sum of 10 and 20 using BiFunction", sum);

        printValue.accept("--------Predicate----------");

        printValue.accept(predicate.isMale.test(Gender.MALE));
        printValue.accept(predicate.checkBothAreMales.test(Gender.MALE, Gender.MALE));

    }
}
