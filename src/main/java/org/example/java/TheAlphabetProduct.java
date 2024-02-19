package org.example.java;


import java.util.HashMap;
import java.util.Map;

public class TheAlphabetProduct {
    public static void main(String[] args) {
        long result = alphabet(new long[] {2L, 3L, 4L, 1L, 12L, 6L, 2L, 4L}), 4L );
        System.out.println("result: " + result);
    }

    public static long alphabet(long[] ns) {
        Map<Long, Integer> countMap = new HashMap<>();

        for (long num : ns) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < ns.length - 1; i++) {
            long current = ns[i];
            long next = ns[i + 1];

            if (countMap.get(current) == 1 && countMap.get(next) == 1) {
                return Math.max(current, next);
            }
        }

        return 0; // Handle the case where no unique element is found (should not happen in this problem)
    }
}