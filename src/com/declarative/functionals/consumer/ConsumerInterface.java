package com.declarative.functionals.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {

    // Takes input or inputs and returns nothing

    public static Consumer<Object> printValue = value -> System.out.println(value);
    public static BiConsumer<Object, Object> printValues =
            (value1, value2) -> System.out.println(value1 + " : " + value2);

}
