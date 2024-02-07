package org.example.java;

import java.util.Arrays;

public class BegginerreduceButGrow {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5};
        int result = grow(array);
        System.out.println("Product of array elements: " + result);
    }

    public static int grow(int[] x){
        int reducement = Arrays.stream(x).reduce(1, (num1, num2) -> num1 * num2);
        return reducement;
    }
}