package ru.job4j.algo.interval.twopointers;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        // todo дан массив отсортированный по возрастанию. верни массив квадратов так же отсортированных

        int[] array = {-4, -1, 0, 3, 10};
        int[] array2 = {-10, -5, -2, 1};
        int[] result = sorted(array2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sorted(int[] nums) {
        return nums;
    }
}
