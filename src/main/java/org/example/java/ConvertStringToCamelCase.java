package org.example.java;

import java.lang.StringBuilder;
import java.util.ArrayList;

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s) {
        ArrayList<String> words = new ArrayList<>();
        for (String word : s.split("[-_]")) {
            words.add(word);
        }
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder(words.get(0));

        for (int i = 1; i < words.size(); i++) {
            if (!words.get(i).isEmpty()) {
                result.append(Character.toUpperCase(words.get(i).charAt(0)))
                        .append(words.get(i).substring(1));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(toCamelCase("the-stealth-warrior"));    // "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior"));    // "TheStealthWarrior"
        System.out.println(toCamelCase("The_Stealth-Warrior"));    // "TheStealthWarrior"
    }
}
