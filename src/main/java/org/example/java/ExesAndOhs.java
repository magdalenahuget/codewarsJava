package org.example.java;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        System.out.println(getXO("xoxo"));
        System.out.println(getXO("xoxk"));
        System.out.println(getXO("kpkp"));
    }


    public static boolean getXO(String str) {

        String lowerString = str.toLowerCase();

        long o = lowerString.chars().filter(el -> el == 'o').count();
        long x = lowerString.chars().filter(el -> el == 'x').count();
        if (x == o) {
            return true;
        }
        return false;
    }

}