package org.example.java;

public class ConvertBooleanValuesToStringsYesOrNo {
    public static void main(String[] args) {
        boolean kot = true;
        System.out.println(boolToWorld(kot));
        System.out.println();
    }

    public static String boolToWorld(boolean b){
//        if(b == true) {
//            return "Yes";
//        } else {
//            return "No";
//        }
        return b == true ? "Yes" : "No";
    }
}