package org.example.java;

public class HowOldWillIBeIn2099 {
    public static void main(String[] args) {
        // Example usage
        System.out.println(CalculateAge(2000, 2022));
        System.out.println(CalculateAge(2025, 2022));
        System.out.println(CalculateAge(2022, 2022));
    }


    public static String CalculateAge(int birth, int yearTo) {
        int ageDifference = yearTo - birth;

        if (ageDifference > 0) {
            // Future
            if (ageDifference == 1) {
                return "You are " + ageDifference + " year old.";
            } else {
                return "You are " + ageDifference + " years old.";
            }
        } else if (ageDifference < 0) {
            // Past
            if (Math.abs(ageDifference) == 1) {
                return "You will be born in " + Math.abs(ageDifference) + " year.";
            } else {
                return "You will be born in " + Math.abs(ageDifference) + " years.";
            }
        } else {
            // Present
            return "You were born this very year!";
        }
    }
}