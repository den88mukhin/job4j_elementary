package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To85Then7dot28() {
        Point a = new Point(1, 3);
        Point b = new Point(8, 5);
        double out = a.distance(b);
        double expected = 7.28;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus6Minus4Then7dot21() {
        Point a = new Point(0, 0);
        Point b = new Point(-6, -4);
        double out = a.distance(b);
        double expected = 7.21;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus6Minus4To23Then10dot63() {
        Point a = new Point(-6, -4);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        double expected = 10.63;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}