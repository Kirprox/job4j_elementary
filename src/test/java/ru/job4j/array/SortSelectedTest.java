package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {10, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {12, 0, 11, 98, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 11, 12, 98};
        assertThat(result).containsExactly(expected);
    }
}