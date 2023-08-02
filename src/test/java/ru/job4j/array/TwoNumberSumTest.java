package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] input = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(input, target);
        int[] expected = {0, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] input = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(input, target);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] input = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(input, target);
        int[] expected = {1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] input = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(input, target);
        int[] expected = {2, 4};
        assertThat(result).containsExactly(expected);
    }
}