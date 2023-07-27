package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 5, 1, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3Numbers() {
        int[] data = new int[] {7, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort5Numbers() {
        int[] data = new int[] {71, -5, 25, 3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 3, 25, 71};
        assertThat(result).containsExactly(expected);
    }
}