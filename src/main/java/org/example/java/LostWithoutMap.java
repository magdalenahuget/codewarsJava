package org.example.java;

import java.util.Arrays;


public class LostWithoutMap {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] arrays = {4, 5, 6};
        int[] arraysNew = map(arrays);
        System.out.println(Arrays.toString(arraysNew));
    }

    public static int[] map(int[] arr) {
        int[] newArr = Arrays.stream(arr).map(el -> el * 2).toArray();
        return newArr;

    }
}