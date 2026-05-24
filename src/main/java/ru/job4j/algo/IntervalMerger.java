package ru.job4j.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalMerger {
    public int[][] merge(int[][] intervals) {
        List<int[]> resultlist = new ArrayList<>();
        int[] current = new int[2];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                current[1] = intervals[i][1];
            } else {
                resultlist.add(current);
                current = intervals[i];
            }
        }
        resultlist.add(current);

        return resultlist.toArray(new int[0][]);
    }
}
