package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 1; i < data.length - 1; i++) {
            result = data[i] == result ? true : false;
        }
        return result;
    }
}
