package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= 2; i++) {
            if ((number % 1 == 0 && number % 2 == 0) || number == 1) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
