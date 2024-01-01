package org.example.java;

public class BooleanToString {
    public static String convert(boolean b) {
//        String str = new Boolean(b).toString();

        String str = String.valueOf(b);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
    }
}