package com.butler.objectfactory.clubfactory;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the soccer club directory.\n\n");
        System.out.println("Enter the new club below:\n");

        // Declare variables and call UI method to read input
        String name = UI.readString("Enter the club name.");
        // Needed to use StringBuilder to dynamically add strings depending on number of players
        StringBuilder players = UI.readStringList();
        short year = UI.readShort("Enter the year this club was founded.", (short)1800, (short)2022);
        byte goalsScored = UI.readByte("Enter how many goals this club has scored in its current season.", (byte)0, (byte)127);
        byte goalsAgainst = UI.readByte("Enter how many goals have been scored against this club in its current season.", (byte)0, (byte)127);
        int stadiumCap = UI.readInt("How many people can the club's stadium hold?", 100, 120_000);

        // Create instance of new object
        Club newClub = new Club(name, players, year, goalsScored, goalsAgainst, stadiumCap);

        // Report data
        System.out.println(newClub);
    }
}
