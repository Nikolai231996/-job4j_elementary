package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class PointTest {

    @Test
    void distance() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 2;
        int y2 = 8;
        double expected = 6.40;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        int x11 = 8;
        int y11 = 4;
        int x21 = 5;
        int y21 = 7;
        double expected1 = 4.24;
        double out1 = Point.distance(x11, y11, x21, y21);
        assertThat(out1).isEqualTo(expected1, withPrecision(0.01));
        int x12 = 3;
        int y12 = 1;
        int x22 = 9;
        int y22 = 5;
        double expected2 = 7.211;
        double out2 = Point.distance(x12, y12, x22, y22);
        assertThat(out2).isEqualTo(expected2, withPrecision(0.01));
    }
}