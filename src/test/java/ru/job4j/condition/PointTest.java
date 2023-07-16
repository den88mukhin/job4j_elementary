package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To85Then7dot28() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 8;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 7.28;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus6Minus4Then7dot21() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -6;
        int y2 = -4;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 7.21;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus6Minus4To23Then10dot63() {
        int x1 = -6;
        int y1 = -4;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 10.63;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}