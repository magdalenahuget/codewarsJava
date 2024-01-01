package org.example.java;

import java.util.Arrays;

import static java.util.stream.IntStream.of;
import static org.example.java.ReversedStrings.reverse;

public class SimpleRemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] ints = {
                4, 1, 4, 5, 4
        };
        System.out.println(Arrays.toString(solve(ints)));
    }

    public static int[] solve(int[] arr) {
        reverse(Arrays.toString(arr));
        var unique = of(arr).distinct().toArray();
        reverse(Arrays.toString(unique));
        return unique;
    }
}