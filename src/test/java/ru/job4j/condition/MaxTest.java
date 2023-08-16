package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then2() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3To5Then5() {
        int first = 1;
        int second = 3;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To0To6Then8() {
        int first = 8;
        int second = 0;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To10To7Then10() {
        int first = 4;
        int second = 10;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To0To5To9Then9() {
        int first = 3;
        int second = 0;
        int third = 5;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To10To5To9Then10() {
        int first = 3;
        int second = 10;
        int third = 5;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To10To25To9Then25() {
        int first = 3;
        int second = 10;
        int third = 25;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To2To0Then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7To7To7Then7() {
        int first = 7;
        int second = 7;
        int third = 7;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}