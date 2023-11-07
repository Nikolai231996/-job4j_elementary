package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return one;
    }

    public static double distance1(int x11, int y11, int x21, int y21) {
        double one1 = Math.sqrt(Math.pow(x21 - x11, 2) + Math.pow(y21 - y11, 2));
        return one1;
    }

    public static double distance2(int x12, int y12, int x22, int y22) {
        double one2 = Math.sqrt(Math.pow(x22 - x12, 2) + Math.pow(y22 - y12, 2));
        return one2;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 3, 2, 8);
        System.out.println("result (6, 3) to (2, 8) " + result);
        double result1 = Point.distance(8, 4, 5, 7);
        System.out.println("result1 (6, 3) to (2, 8) " + result1);
        double result2 = Point.distance(3, 1, 9, 5);
        System.out.println("result2 (6, 3) to (2, 8) " + result2);
    }
}
