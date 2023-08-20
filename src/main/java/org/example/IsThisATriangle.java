package org.example;

public class IsThisATriangle {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        boolean triangle = isTriangle(2,3,4);
        System.out.println("Triangle? " + triangle);
    }


    public static boolean isTriangle(int a, int b, int c) {
        int sum = a + b + c;
        if (sum > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                return true;
            }
        }
        return false;
    }

}