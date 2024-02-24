package org.example.java;

import java.util.Arrays;

public class RemoveTheMinimum {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int[] result = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, result, 0, minIndex);
        System.arraycopy(numbers, minIndex + 1, result, minIndex, numbers.length - minIndex - 1);

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] input1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeSmallest(input1))); // Output: [2, 3, 4, 5]

        int[] input2 = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(removeSmallest(input2))); // Output: [5, 3, 2, 4]

        int[] input3 = {2, 2, 1, 2, 1};
        System.out.println(Arrays.toString(removeSmallest(input3))); // Output: [2, 2, 2, 1]
    }
}