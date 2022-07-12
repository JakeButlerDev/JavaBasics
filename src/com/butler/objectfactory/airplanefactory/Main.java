package com.butler.objectfactory.airplanefactory;

import com.butler.objectfactory.UI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Airplane> hanger = new ArrayList<>();


        // Welcome message
        System.out.println("Welcome to create-your-airplane!\n\n");
        System.out.println("Note: all answers must be logical...\n");

        while (true) {
            // MENU
            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1) Create a plane");
            System.out.println("2) Show hanger");
            System.out.println("3) Exit the program");


            byte menuChoice = UI.readByte("Choose an option: ", (byte) 1, (byte) 3);
            if (menuChoice == 3)
                break;
            else if (menuChoice == 2) {
                if (hanger.size() == 0) {
                    System.out.println("No Airplanes in hanger.");
                    continue;
                }
                System.out.println("-".repeat(20));
                System.out.println("AIRPLANE HANGER\n");
                for (int i = 0; i < hanger.size(); i++) {
                    System.out.println(i + 1 + ")" + hanger.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
            } else {
                Airplane generatedAirplane = createAirplane();
                hanger.add(generatedAirplane);
                // Report data
                System.out.println("\nCREATED AIRPLANE: \n" + generatedAirplane);

            }
        }

        System.out.println("Thank you for using this program.");





    }

    private static Airplane createAirplane() {

        // Declare variables and call UI method to read input
        String userModel = UI.readString("What model plane would you like?");
        String userTailNum = UI.readString("What is your preferred tail number?");
        short userPassCap = UI.readShort("How many people would you like to transport per flight?", (short)2, (short)350);
        int userBudget = UI.readInt("What is your budget in dollars?", 100_000, 20_000_000);
        double userRenewables = UI.readDouble("What percent of renewable fuel would you like your plane to run on?", 0.0, 1.0);
        boolean planeMadeImmediately = UI.readBoolean("I would like my plane to be made immediately.");

        // Create instance of new object
        return new Airplane(userModel, userTailNum, userPassCap, userBudget, userRenewables, planeMadeImmediately);



    }
}
