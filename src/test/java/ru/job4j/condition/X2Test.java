package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA10B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);

    }

    @Test
    void whenA0B1C1X1Then2() {
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        assertThat(rsl1).isEqualTo(expected1);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int expected2 = 2;
        int rsl2 = X2.calc(a2, b2, c2, x2);
        assertThat(rsl2).isEqualTo(expected2);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int expected3 = 1;
        int rsl3 = X2.calc(a3, b3, c3, x3);
        assertThat(rsl3).isEqualTo(expected3);
    }

}
