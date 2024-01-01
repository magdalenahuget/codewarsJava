package org.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortMyTextbooks {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        // Execute the basic test cases
        basicTestCases();
    }


    public static void basicTestCases() {
        // Test Case 1
        List<String> textbooks1 = new ArrayList<>();
        textbooks1.add("Algebra");
        textbooks1.add("History");
        textbooks1.add("Geometry");
        textbooks1.add("English");

        test("Does not sort strings", sorter(textbooks1), List.of("Algebra", "English", "Geometry", "History"));

        // Test Case 2
        List<String> textbooks2 = new ArrayList<>();
        textbooks2.add("Algebra");
        textbooks2.add("history");
        textbooks2.add("Geometry");
        textbooks2.add("english");

        test("Does not handle capitalization", sorter(textbooks2), List.of("Algebra", "english", "Geometry", "history"));

        // Test Case 3
        List<String> textbooks3 = new ArrayList<>();
        textbooks3.add("Alg#bra");
        textbooks3.add("$istory");
        textbooks3.add("Geom^try");
        textbooks3.add("**english");

        test("Does not handle symbols", sorter(textbooks3), List.of("$istory", "**english", "Alg#bra", "Geom^try"));
    }

    public static void test(String description, List<String> actual, List<String> expected) {
        System.out.println(description);
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + (actual.equals(expected) ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static List<String> sorter(List<String> textbooks) {
        // Case-insensitive sorting
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}