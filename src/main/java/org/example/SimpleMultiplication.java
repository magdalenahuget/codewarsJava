package org.example;

public class SimpleMultiplication {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        int result1 = simpleMultiplication(8);
        int result2 = simpleMultiplication(9);
        System.out.println(result1);
        System.out.println(result2);
    }


    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return 8 * n;
        }
        return 9 * n;
    }
}