package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class PointTest {

    @Test
    void when63to28then6dot40() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 2;
        int y2 = 8;
        double expected = 6.40;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when84to57then4dot24() {
        int x11 = 8;
        int y11 = 4;
        int x21 = 5;
        int y21 = 7;
        double expected1 = 4.24;
        double out1 = Point.distance(x11, y11, x21, y21);
        assertThat(out1).isEqualTo(expected1, withPrecision(0.01));
    }

    @Test
    void when31to95then7dot211() {
        int x12 = 3;
        int y12 = 1;
        int x22 = 9;
        int y22 = 5;
        double expected2 = 7.211;
        double out2 = Point.distance(x12, y12, x22, y22);
        assertThat(out2).isEqualTo(expected2, withPrecision(0.01));
    }

    @Test
    void when28to31then7dot071() {
        int x13 = 2;
        int y13 = 8;
        int x23 = 3;
        int y23 = 1;
        double expected3 = 7.071;
        double out3 = Point.distance(x13, y13, x23, y23);
        assertThat(out3).isEqualTo(expected3, withPrecision(0.01));
    }
}