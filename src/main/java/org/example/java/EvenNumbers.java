package org.example.java;

import java.util.ArrayList;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int number : numbers){
            if(number % divider == 0){
                divisors.add(number);
            }
        }
        // Convert ArrayList to int array
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }

        return result;
    }
}