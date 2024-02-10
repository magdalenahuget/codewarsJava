package org.example.java;

public class GetTheMeanOfTheArray {
    public static void main(String[] args) {
        int[] exampleMarks = {85, 90, 92, 88, 78};
        int average = getAverage(exampleMarks);
        System.out.println("Average: " + average);
    }


    public static int getAverage(int[] marks){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}