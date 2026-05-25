package ru.job4j.algo.interval.solutions.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestRangeFinder {
    public static int[] findSmallestRange(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int bestLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == k) {
                    int currentLength = j - i + 1;
                    if (currentLength < bestLength) {
                        bestLength = currentLength;
                        start = i;
                        end = j;
                    }
                    break;
                }
            }
        }
        if (bestLength == Integer.MAX_VALUE) {
            return null;
        }
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}
