package ru.job4j.algo;

import java.util.Comparator;
import java.util.List;

public class QuickList {
    public static <T> void quickSort(List<T> sequence, Comparator<T> comparator) {
        quickSort(sequence, 0, sequence.size() - 1, comparator);
    }

    private static <T> void quickSort(List<T> sequence, int start, int end, Comparator<T> comparator) {
        //TODO реализуйте метод
    }

    private static <T> int breakPartition(List<T> sequence, int start, int end, Comparator<T> comparator) {
        //TODO реализуйте метод
        return 0;
    }

    private static <T> void swap(List<T> array, int i, int j) {
        //TODO реализуйте метод
    }
}
