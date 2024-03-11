package org.example.java;

public class SmokingTimmy {

    public static void main(String[] args) {
        // Example values for bars and boxes
        int bars = 5;
        int boxes = 10;

        // Invoke the startSmoking method from the SmokingTimmy class
        int result = SmokingTimmy.startSmoking(bars, boxes);

        // Print the result
        System.out.println("The result is: " + result);
    }

    public static int startSmoking(int bars, int boxes) {
        return (int) (225 * bars + 22.5 * boxes - .5);
    }
}