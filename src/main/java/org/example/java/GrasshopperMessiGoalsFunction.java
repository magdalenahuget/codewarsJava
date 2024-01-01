package org.example.java;

public class GrasshopperMessiGoalsFunction {
    public static void main(String[] args) {
        System.out.println(goals(4,2,5));
        System.out.println();
    }


    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals){
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}