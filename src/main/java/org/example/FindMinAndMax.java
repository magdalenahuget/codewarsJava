package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinAndMax {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        List<Integer> list = Arrays.asList(8, 11, 3);
        int[] minMax = getMinMax(list);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }

    static int[] getMinMax(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

}