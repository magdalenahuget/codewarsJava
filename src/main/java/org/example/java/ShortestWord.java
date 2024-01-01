package org.example.java;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(findShort("kot pies owca krowa"));
    }


    public static int findShort(String s) {

        String[] splited = s.split(" ");
        int zero = splited[0].length();
        for(String word : splited){
            int sLength = word.length();
            if(zero > sLength){
                zero = sLength;

            }
        }
        return zero;
    }
}