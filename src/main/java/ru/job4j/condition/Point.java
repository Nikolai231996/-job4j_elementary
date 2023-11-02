package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return one;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 3, 2, 8);
        System.out.println("result (6, 3) to (2, 8) " + result);
    }
}
