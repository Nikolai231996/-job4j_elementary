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
        float in4 = 60;
        float expected4 = 1;
        float out4 = Converter.rubleToDollar(in4);
        boolean dollar = expected4 == out4;
        System.out.println("60 rubles are " + dollar + " dollar.");
    }
}
