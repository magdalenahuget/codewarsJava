package org.example.java;

public class RockPaperScisors {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(rps("paper", "rock"));
    }

    public static String rps(String p1, String p2) {

        if (p1 == p2) {
            return "Draw!";
        } else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}