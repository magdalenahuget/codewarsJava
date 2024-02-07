package org.example.java;

import java.util.Arrays;
import java.util.Collections;

public class MyHeadIsAtTheWrongEnd {
    public static void main(String[] args) {
        // Wywołaj fixTheMeerkat i przypisz wynik do zmiennej
        String[] meerkatArray = {"tail", "body", "head"};
        String[] fixedArray = fixTheMeerkat(meerkatArray);

        // Wypisz oryginalną tablicę
        System.out.println("Oryginalna tablica: " + (meerkatArray));

        // Wypisz poprawioną tablicę
        System.out.println("Poprawiona tablica: " + (fixedArray));
    }

    // VERSION 1
    public static String[] fixTheMeerkat(String[] arr) {
        String[] result = new String[arr.length];
        int x = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            result[x] = arr[i];
            x++;
        }
        return result;
    }

    // VERSION 2
    public static String[] fixTheMeerkat2(String[] arr) {
        return new String[] {arr[2], arr[1], arr[0]};
    }

    // VERSION 3
    public static String[] fixTheMeerkat3(String[] arr) {
        String[] copy = arr.clone();
        Collections.reverse(Arrays.asList(copy));
        return copy;
    }
}