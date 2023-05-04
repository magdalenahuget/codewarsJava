package org.example;

public class ReversedStrings {
    public static void main(String[] args) {

        System.out.println(reverse("kotek"));
        System.out.println();
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

}