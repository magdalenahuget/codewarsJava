package org.example.java;

public class CalculateAverage {
    public static void main(String[] args) {

        int[] testArray = {1,2,3,4,5};
        System.out.println(find_average(testArray));
    }

    public static double find_average(int[] array){
        double result = 0;
        for(double element:array){
            result+=element;
        }
        return result = result/array.length;
    }
}