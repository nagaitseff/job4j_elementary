package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double resultOne = Point.distance(1, 1, 3, 5);
        System.out.println("result one (1, 1) to (3, 5) " + resultOne);
        double resultTwo = Point.distance(1, 1, 0, 0);
        System.out.println("result two (1, 1) to (0, 0) " + resultTwo);
    }
}
