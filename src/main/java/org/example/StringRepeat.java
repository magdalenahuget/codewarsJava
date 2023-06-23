package org.example;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    public static String repeatStr2(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(string).repeat(Math.max(0, repeat)));
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = repeatStr(5,"ha");
        System.out.println(result);
    }
}