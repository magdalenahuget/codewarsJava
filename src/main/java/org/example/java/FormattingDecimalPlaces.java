package org.example.java;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }

    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}