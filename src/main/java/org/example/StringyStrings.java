package org.example;

public class StringyStrings {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
    }


    public static String stringy(int size) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= size ; i++) {
            if (i % 2 != 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        return sb.toString();
    }
}