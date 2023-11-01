package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double one = (a + b + c) / 2;
        double two = one * (one - a);
        double three = two * (one - b);
        double four = three * (one - c);
        double five = Math.sqrt(four);
        return five;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
