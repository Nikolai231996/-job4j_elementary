package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double one = (a + b + c) / 2;
        double two = Math.sqrt(one * (one - a) * (one - b) * (one - c));
        return two;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
