package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart1Finish5Then15() {
        int start = 1;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish1Then0() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFiveToThirtyEightThen374() {
        int start = 5;
        int finish = 38;
        int result = Counter.sumByEven(start, finish);
        int expected = 374;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSixToTenThenTwentyFour() {
        int start = 6;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusSixToTenThenEighteen() {
        int start = -6;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}