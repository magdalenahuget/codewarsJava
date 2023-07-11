package org.example;

public class DNAtoRNA {
    public static void main(String[] args) {
        String result = dnaToRna("GCAT");
        System.out.println(result);
    }

    public static String dnaToRna(String dna) {
        StringBuilder changed = new StringBuilder();
        for (char letter : dna.toCharArray()) {
            if (letter == 'T') {
                changed.append('U');
            } else {
                changed.append(letter);
            }
        }
        return changed.toString();
    }
}
