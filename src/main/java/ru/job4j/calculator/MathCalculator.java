package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAnddivision(double first, double second) {
    return div(first, second)
            + division(first, second);
}

    public static double sum1And1Function(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divAnddivision(35, 35));
        System.out.println("Результат расчета равен: " + sum1And1Function(10, 15));
        }

    }


