package org.example.java;

public class CountTheDivisorsOfANumber {
    public static void main(String[] args) {

        long result = numberOfDivisors(6);
        System.out.println(result);
    }

    public static long numberOfDivisors(int n) {
        int count = 0;
        if (n < 500000){
            for(int i = 1; i<=n; i++){
                if(n%i == 0){
                    count += 1;
                }
            }
        }
        return count;
    }
}