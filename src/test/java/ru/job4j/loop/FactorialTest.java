package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}