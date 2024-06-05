package ru.job4j.calculator;

public class Fit {
    public static final int MAN_HEIGHT_OFFSET = 100;
    public static final int WOMAN_HEIGHT_OFFSET = 110;
    public static final double COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - MAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    public static double womanWeight(short height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - WOMAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);

        System.out.printf("Man 180 is %.2f%n", man);
        System.out.printf("Woman 170 is %.2f%n", woman);
    }
}
