package ru.job4j.algo;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String str) {
        int bestStart = 0;
        int maxLength = 0;
        int left = 0;
        Set<Character> window = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            var current = str.charAt(i);
            while (window.contains(current)) {
                window.remove(str.charAt(left));
                left++;
            }
            window.add(current);
            if (i - left + 1 > maxLength) {
                maxLength = i - left + 1;
                bestStart = left;
            }
        }
        return str.substring(bestStart, bestStart + maxLength);
    }
}
