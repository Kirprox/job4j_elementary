package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 2;
            for (int i = 2; i <= n; i++) {
                result *= i;
        }
        return result;
    }
}
