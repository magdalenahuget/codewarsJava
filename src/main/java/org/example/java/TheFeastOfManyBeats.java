package org.example.java;

public class TheFeastOfManyBeats {

    public static void main(String[] args) {
        boolean result1 = TheFeastOfManyBeats.feast("greatblueheron", "garlicnaan");
        boolean result2 = TheFeastOfManyBeats.feast("chickadee", "chocolatecake");

        System.out.println("Result 1: " + result1); //  true
        System.out.println("Result 2: " + result2); //  true
    }


    public static boolean feast(String beast, String dish) {
        String firstLetter = beast.substring(0, 1);
        String lastLetter = beast.substring(beast.length() - 1);

        return dish.startsWith(firstLetter) && dish.endsWith(lastLetter);
    }
}