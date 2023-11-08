package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return one;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 3, 2, 8);
        System.out.println("result (6, 3) to (2, 8) " + result);
        double result1 = Point.distance(8, 4, 5, 7);
        System.out.println("result1 (8, 4) to (5, 7) " + result1);
        double result2 = Point.distance(3, 1, 9, 5);
        System.out.println("result2 (3, 1) to 9, 5) " + result2);
        double result3 = Point.distance(2, 8, 3, 1);
        System.out.println("result3 (2, 8) to 3, 1) " + result3);
    }
}
