package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 1; i < data.length; i++) {
            if (result != data[i]) {
                result = false;
                break;
            } else {
                if (data[i] == data[i + 1]) {
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
