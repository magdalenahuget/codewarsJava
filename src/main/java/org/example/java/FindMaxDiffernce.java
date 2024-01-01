package org.example.java;

import java.util.Arrays;
import java.util.List;

public class FindMaxDiffernce {

    public static int maxDiff(int[] arr) {
        if (arr.length <= 1) return 0;
        int min = getMin(arr);
        int max = getMax(arr);

        int max_diff = max - min;
        return max_diff;
    }

    public static int getMin(int[] values) {
        int ret = values[0];
        for (int i = 1; i < values.length; i++)
            ret = Math.min(ret, values[i]);
        return ret;


    }

    public static int getMax(int[] values) {
        int ret = values[0];
        for (int i = 1; i < values.length; i++)
            ret = Math.max(ret, values[i]);
        return ret;
    }

    public static void main(String[] args) {
        maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4});

    }
}
