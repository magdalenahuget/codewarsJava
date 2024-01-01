package org.example.java;

public class ConvertStringToANumber {

    public static int stringToNumber(String str) {
        //TODO: Convert str into a number

        int number = Integer.parseInt(str);
        return number;
    }

    public static void main(String[] args) {
        int result = stringToNumber("565");
        System.out.println(result);
    }
}