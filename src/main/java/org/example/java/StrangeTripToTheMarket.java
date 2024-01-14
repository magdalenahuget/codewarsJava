package org.example.java;

public class StrangeTripToTheMarket {
    public static void main(String[] args) {
        boolean result = isLockNessMonster("Dude, 3.50 please.");
        boolean result2 = isLockNessMonster("Dude, how are you doing?");
        System.out.println(result);
        System.out.println(result2);
    }

    public static boolean isLockNessMonster(String s) {
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        String lowerStatement = s.toLowerCase();
        return lowerStatement.contains("three fifty") || lowerStatement.contains("3.50") || lowerStatement.contains("tree fiddy");
    }
}
