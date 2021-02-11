package com.declarative.functionals.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {

    public static Supplier<Integer> generateRandomNumber = () -> new Random().nextInt(100);

}
