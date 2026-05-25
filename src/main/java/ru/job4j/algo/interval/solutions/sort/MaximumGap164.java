package ru.job4j.algo.interval.solutions.sort;

import java.util.Arrays;

public class MaximumGap164 {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }
        return maxGap;

    }
}
