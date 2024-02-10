package org.example.java;

import java.util.Arrays;

public class MilesPerGallon {
    public static void main(String[] args) {
        Boolean didSheSay = validateHello("Ciao bella!");
        System.out.println("Did she say hello? " + didSheSay);
    }


    public static boolean validateHello(String greetings) {
        String[] possibleHello = new String[]{"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        System.out.println(Arrays.toString(possibleHello));
        System.out.println(greetings);
        System.out.println(possibleHello.length);

        for (String hello : possibleHello) {
            System.out.println(hello);
            System.out.println(greetings);
            if (greetings.toLowerCase().contains(hello)) {
                return true;
            } else {
                System.out.println("this 'hello' is not in 'greetings'");
            }

        }
        return false;
    }
}