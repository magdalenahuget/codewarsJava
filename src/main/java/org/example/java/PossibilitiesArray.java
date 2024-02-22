package org.example.java;

public class PossibilitiesArray {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        // Example usage
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3})); // Output: true
        System.out.println(isAllPossibilities(new int[]{1, 2, 3, 4})); // Output: false
        System.out.println(isAllPossibilities(new int[]{6, 0, 4})); // Output: false

    }


    public static boolean isAllPossibilities(int[] arg) {
        boolean output = arg.length > 0;
        for (int i = 0; i < arg.length; i++) {
            if (!containsElement(arg, i)) {
                output = false;
            }
        }
        return output;
    }

    private static boolean containsElement(int[] array, int element) {
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }
}