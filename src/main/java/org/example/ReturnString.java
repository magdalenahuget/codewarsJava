package org.example;

public class ReturnString {
    public static void main(String[] args) {
        System.out.println(greet("Jan"));
    }

    public static String greet(String name)
    {
        String result = "Hello, " + name +" how are you doing today?";
        return result;
    }
}