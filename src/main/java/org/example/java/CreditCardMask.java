package org.example.java;

public class CreditCardMask {
    public static void main(String[] args) {

        String result = maskify("Kitten");
        System.out.println(result);
    }

    public static String maskify(String str) {
        if (str.length() > 4) {
            char[] maskedChars = new char[str.length() - 4];
            for (int i = 0; i < maskedChars.length; i++) {
                maskedChars[i] = '#';
            }
            return new String(maskedChars) + str.substring(str.length() - 4);
        } else {
            return str;
        }
    }
}