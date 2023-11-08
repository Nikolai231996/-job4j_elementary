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
        float in2 = 120;
        float expected2 = 1;
        float out2 = Converter.rubleToDollar(in2);
        float eps2 = 0.0001f;
        assertThat(out2).isEqualTo(expected2, withPrecision(eps2));
    }
}