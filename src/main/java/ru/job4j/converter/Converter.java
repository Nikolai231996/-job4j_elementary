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
         in = 120;
         expected = 2;
         out = Converter.rubleToDollar(in);
        boolean dollar = expected == out;
        System.out.println("120 rubles are 2  " + dollar + " dollar.");
    }
}
