package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAnaDivide(double first, double second) {
        double diff = difference(first, second);
        double div = divide(first, second);
        return sum(diff, div);
    }

    public static double sumOfFourOperations(double first, double second) {
        double sum = sum(first, second);
        double multiply = multiply(first, second);
        double difference = difference(first, second);
        double divide = divide(first, second);
        double sumOne = sum(sum, multiply);
        double sumTwo = sum(difference, divide);
        return sum(sumOne, sumTwo);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifferenceAnaDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumOfFourOperations(10, 20));
    }
}