package org.example;

public class SimplePigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("igPay atinlay siay oolcay"));
        System.out.println();
    }

    public static String pigIt(String str) {

        String[] splittedString = str.split("\\s+");

        for (int i = 0; i < splittedString.length; i++) {
            String word = splittedString[i];

            if (word.matches("[a-zA-Z]+")) {
                splittedString[i] = word.substring(1) + word.charAt(0) + "ay";
            }
        }
        String sentence = String.join(" ", splittedString);
        return sentence;
    }
}