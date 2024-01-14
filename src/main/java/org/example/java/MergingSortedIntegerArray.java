package org.example.java;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.TreeSet;

public class MergingSortedIntegerArray {
    public static void main(String[] args) {
        int[] first = {1, 5, 8};
        int[] second = {5, 2, 8};

        int[] result = mergeArrays(first, second);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        int[] both = ArrayUtils.addAll(first, second);

        TreeSet<Integer> tree = new TreeSet<Integer>();

        for (int i = 0; i < both.length; i++) {
            tree.add(both[i]);
        }
        int[] result = new int[tree.size()];
        int index = 0;
        for (int element : tree) {
            result[index++] = element;
        }
        return result;
    }
}