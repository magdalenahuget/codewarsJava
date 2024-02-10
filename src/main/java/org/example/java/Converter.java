package org.example.java;

public class Converter {
    public static void main(String[] args) {
        float mpgValue = 30.5f;
        float kplResult = mpgToKPM(mpgValue);
        System.out.println(mpgValue + " miles per imperial gallon is approximately " + kplResult + " kilometers per liter.");
    }

    public static float mpgToKPM(final float mpg) {
        float result = (mpg * 1.609344f) / 4.54609188f;
        return (float) (Math.round(result * 100.0) / 100.0);
    }
}