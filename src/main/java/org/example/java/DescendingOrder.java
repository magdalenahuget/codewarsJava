package org.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        int result = sortDesc(42145);
        System.out.println("Output: " + result);
    }


    public static int sortDesc(final int num) {
        String numAsString = String.valueOf(num);
        String[] elements = numAsString.split("");

        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, elements);

        Collections.sort(numbers, Collections.reverseOrder());

        String result = String.join("", numbers);
        return Integer.parseInt(result);
    }
}

/* import java.util.Arrays;
        import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
} */