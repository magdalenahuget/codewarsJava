package org.example.java;

public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(liters(13.0));
    }

    public static int liters(double time)  {
        double result = time / 2;
        int resultAsInt=(int)result;
        return resultAsInt;
    }

}