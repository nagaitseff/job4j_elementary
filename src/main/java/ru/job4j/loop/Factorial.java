package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = result; index <= n; index++) {
            result *= index;
        }
        return result;
    }
}
