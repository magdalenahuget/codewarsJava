package org.example;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("Hello bombello"));
        System.out.println();
    }


    public static String noSpace(final String x){
        StringBuilder builder = new StringBuilder();
        for(int i =0; i< x.length(); i++){
            char c = x.charAt(i);
            if(c != ' '){
                builder.append(c);
            }
        }
        return builder.toString();
    }
}