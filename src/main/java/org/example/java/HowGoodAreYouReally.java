package org.example.java;

public class HowGoodAreYouReally {
    public static void main(String[] args) {
        int[] classPoints = {5,4,3,2,1};
        int yourPoints = 4;
        System.out.println(betterThenAverage(classPoints, yourPoints));
        System.out.println();
    }

    public static boolean betterThenAverage(int[] classPoints, int yourPoints) {

        int average = 0;

        for(int onePersonPoints : classPoints){
            average += onePersonPoints;
        }

        average = average / classPoints.length;
        System.out.println(average);
        if(average < yourPoints){
            return true;
        } else {
            return false;
        }
    }
}