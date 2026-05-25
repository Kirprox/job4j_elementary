package ru.job4j.algo.interval.hash;

import java.util.List;

public class FindAnagram {

    private static List<Integer> findAnagrams(String str, String substr) {

        return null;
    }

    public static void main(String[] args) {
        /** В этом задании необходимо найти все анаграммы подстроки.  Пример: подстрока "abс", строка "cbaebabacd".
         * вывод [0, 6]
         **/

        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> anagramIndices = findAnagrams(s, p);
        System.out.println(anagramIndices);
    }
}
