package org.example.java;

public class RemoveTheTime {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        String result = shortenToDate("Friday May 2, 7pm");
        System.out.println(result);
    }


    public static String shortenToDate(String longDate) {
        System.out.println(longDate);
        int index = longDate.indexOf(",");
        return longDate.substring(0, index);
    }
}