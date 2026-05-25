package ru.job4j.algo;

import java.util.Arrays;

public class Merge {
    public static int[] mergesort(int[] array) {
        int[] result = array;
        int n = array.length;
        if (n > 1) {
            int[] left = mergesort(Arrays.copyOfRange(array, 0, n / 2));
            int[] right = mergesort(Arrays.copyOfRange(array, n / 2, n));
            result = merge(left, right);
        }
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer >= left.length) {
                result[index] = right[rightPointer];
                rightPointer++;
                index++;
                continue;
            } else if (rightPointer >= right.length) {
                result[index] = left[leftPointer];
                leftPointer++;
                index++;
                continue;
            }
            if (left[leftPointer] < right[rightPointer]) {
                result[index] = left[leftPointer];
                leftPointer++;
                index++;
            } else if (left[leftPointer] > right[rightPointer]) {
                result[index] = right[rightPointer];
                rightPointer++;
                index++;
            } else {
                result[index] = left[leftPointer];
                index++;
                leftPointer++;
                result[index] = right[rightPointer];
                index++;
                rightPointer++;
            }
        }
        return result;
    }
}
