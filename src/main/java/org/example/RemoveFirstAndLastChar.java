package org.example;

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        String str = "Summer time";
        System.out.println(remove(str));
    }


    public static String remove(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(0);
        return sb.toString();
    }
}