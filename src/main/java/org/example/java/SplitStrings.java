package org.example.java;

import java.util.ArrayList;

public class SplitStrings {
    public static String[] solution(String s) {
        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < s.length(); i += 2) {
            String pair;
            if (i + 1 < s.length()) {
                pair = s.substring(i, i + 2);
            } else {
                pair = s.substring(i) + "_";
            }

            pairs.add(pair);
        }

        String[] result = new String[pairs.size()];
        return pairs.toArray(result);
    }

    public static void main(String[] args) {
        String input1 = "abc";
        String[] result1 = solution(input1);
        for (String pair : result1) {
            System.out.println(pair);
        }

        System.out.println();

        String input2 = "abcdef";
        String[] result2 = solution(input2);
        for (String pair : result2) {
            System.out.println(pair);
        }
    }
}