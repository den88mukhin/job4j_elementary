package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DerfragmentTest {

    @Test
    void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Derfragment.compress(input);
        String[] expected = {"I", null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Derfragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Derfragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void notAllNull() {
        String[] input = {null, null, null};
        String[] result = Derfragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Derfragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }
}