package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double sum1AndMultiply1(double first, double second) {
        return sum1(first, second)
                + multiply1(first, second);

    }

    public static void plus(String[] args) {
        System.out.println("Результат расчета равен: " + sum1AndMultiply1(10, 20));
}

    public static double sumAndMultiplyAmsun1AndMultiply1(double first, double second) {
        return sumAndMultiply(first, second)
                + sum1AndMultiply1(first, second);
}

    public static void one(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiplyAmsun1AndMultiply1(10, 20));

    }
}



