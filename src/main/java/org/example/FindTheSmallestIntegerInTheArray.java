package org.example;

public class FindTheSmallestIntegerInTheArray {

    public static void main(String[] args) {

        int[] arrayOfIntegers = {5, 4, -7, 2, -9, -40, 20};
        System.out.println(findSmallestInt(arrayOfIntegers));
    }

    public static int findSmallestInt(int[] args) {

        int smallest = args[0];
        for (int i = 0; i < args.length; i++) {
            if (smallest > args[i]) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}