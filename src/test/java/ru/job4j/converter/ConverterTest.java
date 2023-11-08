package ru.job4j.converter;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert70RblThen1Euro() {
        float in = 70;
        float expected = 1;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert120RblThen1Dollar() {
        float one = 120;
        float two = 2;
        float there = Converter.rubleToDollar(one);
        float five = 0.0001f;
        assertThat(there).isEqualTo(two, withPrecision(five));
    }
}