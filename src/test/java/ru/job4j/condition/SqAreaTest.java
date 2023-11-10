package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2()  {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K4Square2dot56()  {
        int p1 = 8;
        double k1 = 4;
        double expected1 = 2.56;
        double out1 = SqArea.square(p1, k1);
        assertThat(out1).isEqualTo(expected1, withPrecision(0.01));
    }

    @Test
    void whenP7K9Square1dot102()  {
        int p2 = 7;
        double k2 = 9;
        double expected2 = 1.102;
        double out2 = SqArea.square(p2, k2);
        assertThat(out2).isEqualTo(expected2, withPrecision(0.01));
    }

    @Test
    void whenP3K5Square0dot31()  {
        int p3 = 3;
        double k3 = 5;
        double expected3 = 0.31;
        double out3 = SqArea.square(p3, k3);
        assertThat(out3).isEqualTo(expected3, withPrecision(0.01));
     }
    }

