package org.example;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(-5));
        System.out.println();
    }

    public static int makeNegative(int x) {
        if(x>0){
            x = x*-1;
        }
        return x;
    }
}