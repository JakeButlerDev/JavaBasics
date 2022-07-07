package com.butler.objectfactory.playerfactory;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the fantasy soccer player database!\n\n");
        System.out.println("Enter your gathered player data below:\n");

        // Declare variables and call UI method to read input
        String name = UI.readString("Enter the player's name");
        String club = UI.readString("Enter the player's club");
        float points = UI.readShort("Enter the player's total points to date", (short)0, (short)1000);
        byte goals = UI.readByte("How many goals have they scored?", (byte)0, (byte)60);
        byte assists = UI.readByte("How many assists have they recorded?", (byte)0, (byte)60);
        boolean injured = UI.readBoolean("Is the player currently injured?");

        // Create instance of new object
        Player newPlayer = new Player(name, club, points, goals, assists, injured);

        // Report data
        System.out.println(newPlayer);
    }
}
