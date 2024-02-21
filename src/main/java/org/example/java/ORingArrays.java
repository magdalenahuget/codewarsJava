package org.example.java;

public class ORingArrays {
    public static int[] orArrays(int[] arr1, int[] arr2) {
        // Find the minimum length of the two arrays
        int minLen = Math.min(arr1.length, arr2.length);

        // Use a loop to perform binary OR for matching elements
        for (int i = 0; i < minLen; i++) {
            arr1[i] |= arr2[i];
        }

        // If arr1 is longer than arr2, perform binary OR with defaultValue for the remaining elements
        for (int i = minLen; i < arr1.length; i++) {
            arr1[i] |= defaultValue;
        }

        // If arr2 is longer than arr1, perform binary OR with defaultValue for the remaining elements
        for (int i = minLen; i < arr2.length; i++) {
            arr2[i] |= defaultValue;
        }

        return arr1;
    }
}
