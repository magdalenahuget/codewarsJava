package org.example.java;

import java.util.Arrays;

public class CatYearsDogYears {
    public static void main(String[] args) {
        int[] result = ownedCatAndDog(10, 55);
        System.out.println(Arrays.toString(result));
    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int catY = catYears, dogY = dogYears;
        int ownedDog = 0, ownedCat = 0;

        if (catYears >= 24) {
            ownedCat = Math.round((catY - 24) / 4) + 2;
        } else {
            ownedCat = catYears < 15 ? 0 : 1;
        }

        if (dogYears >= 24) {
            ownedDog = Math.round((dogY - 24) / 5) + 2;
        } else {
            ownedDog = dogYears < 15 ? 0 : 1;
        }

        return new int[]{ownedCat, ownedDog};
    }
}
