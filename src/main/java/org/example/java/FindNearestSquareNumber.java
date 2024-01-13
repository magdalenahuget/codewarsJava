package org.example.java;

public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        int result = nearestSq(145);
        System.out.println(result);
    }


    public static int nearestSq(final int n) {
        int positiveInteger = (int) Math.sqrt(n);
        int squared = positiveInteger * positiveInteger;
        int squaredPlus = (positiveInteger + 1) * (positiveInteger + 1);

        if (squared == n || squaredPlus == n) {
            return n;
        } else if (Math.abs(n - squared) < Math.abs(n - squaredPlus)) {
            return squared;
        } else {
            return squaredPlus;
        }
    }
}