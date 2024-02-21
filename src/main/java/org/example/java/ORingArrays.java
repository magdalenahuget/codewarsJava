package org.example.java;

public class ORingArrays {
    static int[] orArrays(int[] arr1, int[] arr2) {
        return orArrays(arr1, arr2, 0);
    }

    static int[] orArrays(int[] arr1, int[] arr2, int def) {
        int[] res = arr2.length > arr1.length ? arr2 : arr1;
        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
            if (i < arr1.length && i < arr2.length) {
                res[i] = arr1[i] | arr2[i];
            } else if (i < arr1.length) {
                res[i] = arr1[i] | def;
            } else {
                res[i] = arr2[i] | def;
            }
        }
        return res;
    }
}
