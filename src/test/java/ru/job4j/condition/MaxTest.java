package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void  whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenMax15To7Then15() {
        int left1 = 15;
        int right1 = 7;
        int result1 = Max.max(left1, right1);
        int expected1 = 15;
        assertThat(result1).isEqualTo(expected1);
 }

    @Test
    void  whenMax5To2Then2() {
        int left2 = 5;
        int right2 = 2;
        int result2 = Max.max(left2, right2);
        int expected2 = 5;
        assertThat(result2).isEqualTo(expected2);
 }

    @Test
    void  whenMax3To2Then3() {
        int left3 = 3;
        int right3 = 2;
        int result3 = Max.max(left3, right3);
        int expected3 = 3;
        assertThat(result3).isEqualTo(expected3);
 }
}