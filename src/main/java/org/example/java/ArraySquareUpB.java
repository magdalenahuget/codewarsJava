package org.example.java;

import java.util.Arrays;

public class ArraySquareUpB {
    public static void main(String[] args) {
        // Test the function
        System.out.println(Arrays.toString(squareUp(3))); // Output: [0, 0, 1, 0, 2, 1, 3, 2, 1]
        System.out.println(Arrays.toString(squareUp(2))); // Output: [0, 1, 2, 1]
        System.out.println(Arrays.toString(squareUp(4))); // Output: [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[(i - 1) * n + (n - j)] = j;
            }
        }
        return result;
    }

}