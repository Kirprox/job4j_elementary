package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);

        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
