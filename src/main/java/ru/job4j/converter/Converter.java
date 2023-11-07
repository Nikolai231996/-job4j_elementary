package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 70;
        float expected = 1;
        float out = Converter.rubleToEuro(in);
        boolean euro = expected == out;
        System.out.println("70 rubles are " + euro + " euro.");
        float in3 = 60;
        float expected3 = 1;
        float out3 = Converter.rubleToDollar(in3);
        boolean dollar = expected3 == out3;
        System.out.println("60 rubles are " + dollar + " dollar.");
    }
}
