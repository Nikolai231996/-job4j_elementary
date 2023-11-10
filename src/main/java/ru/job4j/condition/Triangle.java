package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ac + bc > ab && ab + bc > ac);
    }

    public static void main(String[] args) {
        boolean result = exist(2, 2, 2);
        boolean result1 = !exist(4, 3, 2);
        System.out.println(result);
        System.out.println(result1);

    }
}

