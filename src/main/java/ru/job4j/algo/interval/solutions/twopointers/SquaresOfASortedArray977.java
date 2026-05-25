package ru.job4j.algo.interval.solutions.twopointers;

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
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else  {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}
