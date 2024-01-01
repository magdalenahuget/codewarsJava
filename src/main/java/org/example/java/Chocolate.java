package org.example.java;

public class Chocolate {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        long result2 = breakChocolate2(5, 6);
        System.out.println(result2);
    }

    public static long breakChocolate2(long n, long m) {
        return (n * m) - 1;
    }
}