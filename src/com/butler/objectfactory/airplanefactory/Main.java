package com.butler.objectfactory.airplanefactory;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to create-your-airplane!\n\n");
        System.out.println("Note: all answers must be logical...\n");

        // Declare variables and call UI method to read input
        String userModel = UI.readString("What model plane would you like?");
        String userTailNum = UI.readString("What is your preferred tail number?");
        short userPassCap = UI.readShort("How many people would you like to transport per flight?", (short)2, (short)350);
        int userBudget = UI.readInt("What is your budget in dollars?", 100_000, 20_000_000);
        double userRenewables = UI.readDouble("What percent of renewable fuel would you like your plane to run on?", 0.0, 1.0);
        boolean planeMadeImmediately = UI.readBoolean("I would like my plane to be made immediately.");

        // Create instance of new object
        Airplane userAirplane = new Airplane(userModel, userTailNum, userPassCap, userBudget, userRenewables, planeMadeImmediately);

        // Report data
        System.out.println(userAirplane);
    }
}
