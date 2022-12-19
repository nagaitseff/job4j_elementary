package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int arrayLength = array.length - 1;
        for (int i = 0; i < arrayLength; i++) {
            int temp = array[i];
            array[i] = array[arrayLength];
            array[arrayLength] = temp;
            arrayLength -= 1;
        }
        return array;
    }
}
