package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAnaDivide(double first, double second) {
        return sum(difference(first, second), divide(first, second));
    }

    public static double sumOfFourOperations(double first, double second) {
        return sum(sum(sum(first, second), multiply(first, second)),
                sum(difference(first, second), divide(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifferenceAnaDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumOfFourOperations(10, 20));
    }
}