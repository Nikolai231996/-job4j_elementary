package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double  h = p / (2 * (k + 1));
        double  i = h * k;
        double  s = i * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = SqArea.square(8, 4);
        System.out.println(" p1 = 8, k1 = 4, s1 = 2.56, real1 = " + result1);
        double result2 = SqArea.square(7, 9);
        System.out.println(" p2 = 7, k2 = 9, s2 = 1.10, real2 = " + result2);
        double result3 = SqArea.square(3, 5);
        System.out.println(" p3 = 3, k3 = 5, s3 = 0.31, real3 = " + result3);
    }
}
