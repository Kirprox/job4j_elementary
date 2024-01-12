package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus20To02Then2Dot82() {
        double expected = 2.82;
        Point a = new Point(-2, 0);
        Point b = new Point(0, -2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To20Then1Dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20To05Then5Dot38() {
        double expected = 5.38;
        Point a = new Point(2, 0);
        Point b = new Point(0, 5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}