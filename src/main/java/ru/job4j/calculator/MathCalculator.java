package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double seconde) {
        return sum(first, seconde)
                + multiply(first, seconde);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAllCalculations(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + multiply(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + sumAndMultiply(10, 20));
        System.out.println("Result: " + minusAndDivision(10, 20));
        System.out.println("Result: " + sumAllCalculations(10, 20));
    }
}
