package ru.job4j;

public class Calculator {
    public static int func1(int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int result3 = Calculator.func1(100, 10);
        System.out.print(result3);
    }
}