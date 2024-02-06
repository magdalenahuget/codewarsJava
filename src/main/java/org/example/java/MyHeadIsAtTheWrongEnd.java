package org.example.java;

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


    public static String[] fixTheMeerkat(String[] arr) {
        String[] result = new String[arr.length];
        int x = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            result[x] = arr[i];
            x++;
        }
        return result;
    }
}