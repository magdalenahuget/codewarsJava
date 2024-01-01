package org.example.java;

public class Switcherro {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        String result = switcheroo("bailando");
        System.out.println(result);
    }


    public static String switcheroo(String x) {
        System.out.println(x);
        String firstChange = x.replace("a","z");
        String secondChange = firstChange.replace("b", "a");
        String thirdChange = secondChange.replace("z", "b");

        return thirdChange;
    }

    public static String switcherooV2(String x) {
        return x.replace('a','z').replace('b','a').replace('z','b');
    }

    public static String switcheroov3(String x) {
        String result = "";
        for(char c : x.toCharArray()){
            result += c== 'a' ? 'b' : c == 'b' ? 'a' : c ;
        }
        return result;
    }

    public static String switcheroov4(String x) {
        StringBuilder s = new StringBuilder(x);
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'b')
                s.setCharAt(i,'a');
            else if(x.charAt(i) == 'a')
                s.setCharAt(i,'b');
        }
        return s.toString();
    }

    public static String switcheroov5(String x){
        StringBuilder stringBuilder = new StringBuilder();
        char a;
        for (int i = 0; i < x.length(); i++) {
            a = x.charAt(i);
            if (a == 'a') {
                stringBuilder.append('b');
            } else if (a =='b') {
                stringBuilder.append('a');
            } else {
                stringBuilder.append(a);
            }
        }
        return stringBuilder.toString();
    }
}