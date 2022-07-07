package com.butler.objectfactory.clubfactory;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the soccer club directory.\n\n");
        System.out.println("Enter the new club below:\n");

        String name = UI.readString("Enter the club name.");
        StringBuilder players = UI.readStringList();
        short year = UI.readShort("Enter the year this club was founded.", (short)1800, (short)2022);
        byte goalsScored = UI.readByte("Enter how many goals this club has scored in its current season.", (byte)0, (byte)127);
        byte goalsAgainst = UI.readByte("Enter how many goals have been scored against this club in its current season.", (byte)0, (byte)127);
        int stadiumCap = UI.readInt("How many people can the club's stadium hold?", 100, 120_000);

        Club newClub = new Club(name, players, year, goalsScored, goalsAgainst, stadiumCap);

        newClub.toString();
    }
}
