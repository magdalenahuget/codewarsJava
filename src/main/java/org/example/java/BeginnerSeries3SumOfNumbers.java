package org.example.java;

public class BeginnerSeries3SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        int sumOfNumbers = GetSum(-1, 5);
        System.out.println(sumOfNumbers);
    }


    public static int GetSum(int a, int b) {
        int sum = 0;
        int first = 0;
        int last = 0;
        if (a == b) {
            return a;
        } else {
            {
                if (a < b) {
                    first = a;
                    last = b;
                } else {
                    first = b;
                    last = a;
                }
                for (int i = first; i <= last; i++) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}