package org.example;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(even_or_odd(55));
    }
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}