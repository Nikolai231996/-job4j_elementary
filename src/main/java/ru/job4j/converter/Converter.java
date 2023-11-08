package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 140;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 70;
        float expected = 1;
        float out = Converter.rubleToEuro(in);
        boolean euro = expected == out;
        System.out.println("70 rubles are " + euro + " euro.");
        float in2 = 140;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        boolean dollar = expected2 == out2;
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
