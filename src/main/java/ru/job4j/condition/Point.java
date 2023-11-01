package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 3, 2, 8);
        System.out.println("result (6, 3) to (2, 8) " + result);
    }
}
