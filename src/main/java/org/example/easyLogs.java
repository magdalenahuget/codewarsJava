package org.example;

public class easyLogs {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        double result = logs(10, 2, 3);
        System.out.println("Result of logs(1, 4, 6): " + result);
    }


    public static double logs(double x, double a, double b) {
        // your code here
        double logA = Math.log(a) / Math.log(x);
        double logB = Math.log(b) / Math.log(x);
        return logA + logB;
    }
}