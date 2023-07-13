package org.example;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();

        int[] ints = digitize(123);

    }


    public static int[] digitize(long n) {
        // Code here
        String nInString = Long.toString(n);
        System.out.println(nInString);
        StringBuilder sb = new StringBuilder(nInString);
        sb.reverse();
        System.out.println(sb);

        String[] strArr = sb.toString().split("");
        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(intArr));

        return intArr;
    }
}