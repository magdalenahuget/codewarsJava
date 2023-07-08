package org.example;

public class TransportationOnVacation {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        int price = rentalCarCost(2);
        System.out.println(price);

    }

    public static int rentalCarCost(int d) {
        int basePrice = 40; // Daily rental cost
        int totalAmount;

        if (d >= 7) {
            totalAmount = (basePrice * d) - 50;
        } else if (d >= 3) {
            totalAmount = (basePrice * d) - 20;
        } else {
            totalAmount = basePrice * d;
        }

        return totalAmount;
    }
}