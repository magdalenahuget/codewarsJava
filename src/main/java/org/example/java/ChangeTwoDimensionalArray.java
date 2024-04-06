package org.example.java;

public class ChangeTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] inputArray = {
                {-1,  4, -5, -9,  3 },
                { 6, -4, -7,  4, -5 },
                { 3,  5,  0, -9, -1 },
                { 1,  5, -7, -8, -9 },
                {-3,  2,  1, -5,  6 }
        };

        int[][] outputArray = matrix(inputArray);
        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray[i].length; j++) {
                System.out.print(outputArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] matrix(int[][] array) {
        // Code here
        int[][] result = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    result[i][j] = (array[i][j] >= 0) ? 1 : 0;
                } else {
                    result[i][j] = array[i][j];
                }
            }
        }
        return result;
    }
}