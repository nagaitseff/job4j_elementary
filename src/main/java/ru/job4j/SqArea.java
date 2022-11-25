package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(10, 7);
        System.out.println(" p = 10, k = 7, s = 2.73, real = " + result2);
        double result3 = SqArea.square(0, 12);
        System.out.println(" p = 0, k = 12, s = 0, real = " + result3);
        double result4 = SqArea.square(18, 36);
        System.out.println(" p = 18, k = 36, s = 2.13, real = " + result4);
    }
}