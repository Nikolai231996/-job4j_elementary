package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height1) {
        double rsl = height1 * 1.15;
        return rsl;
    }

    public static double womanWeight(short height2) {
        double rsl = height2 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 80;
        short height2 = 60;
        double man = Fit.manWeight(height1);
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 60 is " + woman);
        System.out.println("Man 80 is " + man);
    }

}

