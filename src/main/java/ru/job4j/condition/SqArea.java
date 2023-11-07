package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double  h = p / (2 * (k + 1));
        double  i = h * k;
        double  s = i * h;
        return s;
    }

    public static double square1(double p1, double k1) {
        double  h1 = p1 / (2 * (k1 + 1));
        double  i1 = h1 * k1;
        double  s1 = i1 * h1;
        return s1;
    }

    public static double square2(double p2, double k2) {
        double  h2 = p2 / (2 * (k2 + 1));
        double  i2 = h2 * k2;
        double  s2 = i2 * h2;
        return s2;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = SqArea.square(8, 4);
        System.out.println(" p1 = 8, k1 = 4, s1 = 2.56, real1 = " + result1);
        double result2 = SqArea.square(7, 9);
        System.out.println(" p2 = 7, k2 = 9, s2 = 1.10, real2 = " + result2);
    }
}
