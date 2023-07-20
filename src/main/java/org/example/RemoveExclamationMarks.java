package org.example;

import java.util.ArrayList;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(removeExclamationMarks("!Kot Marcel!"));

    }

    static String removeExclamationMarks(String s) {
        String[] arr = s.split("");
        ArrayList<String> arrNew = new ArrayList<>();
        for (String value : arr) {
            if (!value.equals("!")) {
                arrNew.add(value);
            }
        }
        return String.join("", arrNew);
    }

}