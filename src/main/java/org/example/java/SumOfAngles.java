package org.example.java;

public class SumOfAngles {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        int result = sumOfAngles(3);
        System.out.println(result);
    }


    public static int sumOfAngles(int n) {
        return ((n - 2) * 180);
    }
}