package org.example;

public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(Litres(13.0));
    }

    public int Liters(double time)  {

        double result = time / 2;
        int resultAsInt=(int)result;
        return resultAsInt;
    }

}