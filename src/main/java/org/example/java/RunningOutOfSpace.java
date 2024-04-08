package org.example.java;

import java.util.Arrays;

public class RunningOutOfSpace {
    public static void main(String[] args) {
        String[] inputArray = {"i", "have", "no", "space"};
        String[] resultArray = spacey(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }

    public static String[] spacey(String[] array) {
        // TODO: Figure it out :)
        System.out.println(Arrays.toString(array));
        String[] result = new String[array.length];
        StringBuilder currentString = new StringBuilder();

        for(int i=0; i<array.length; i++){
            currentString.append(array[i]);
            result[i]=currentString.toString();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}