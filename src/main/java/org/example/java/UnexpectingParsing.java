package org.example.java;

import java.util.HashMap;

public class UnexpectingParsing {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        // Invoking getStatus and printing the result
        HashMap<String, String> result = getStatus(true);
        System.out.println("Status: " + result.get("status"));
    }

    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}