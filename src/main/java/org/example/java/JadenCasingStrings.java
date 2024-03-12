package org.example.java;
public class JadenCasingStrings {
    public static void main(String[] args) {
        JadenCasingStrings jadenCaseConverter = new JadenCasingStrings();

        // Example usage
        String input = "How can mirrors be real if our eyes aren't real";
        String jadenCased = jadenCaseConverter.toJadenCase(input);
        System.out.println("Jaden-Cased: " + jadenCased);
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        String[] words = phrase.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        // Remove trailing space and return the JadenCased string
        return result.toString().trim();
    }
}
