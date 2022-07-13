package com.butler.objectfactory.clubfactory;

import com.butler.objectfactory.UI;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create new instance of ArrayList
        ArrayList<Club> league = new ArrayList<>();
        // Welcome message
        System.out.println("Welcome to the soccer club directory.\n\n");
        System.out.println("Enter the new club below:\n");


        while (true) {

            System.out.println("HOME PAGE\n\n" + "-".repeat(20));
            System.out.println("1) Enter data for a new club.");
            System.out.println("2) Edit data for an existing club.");       // NOT FUNCTIONAL YET
            System.out.println("3) View the list of all entered clubs.");
            System.out.println("4) Exit this program.");


            byte menuChoice = UI.readByte("Enter your choice: \n", (byte)0, (byte)4 );

            if (menuChoice == 4) {
                break;
            } else if (menuChoice == 3) {       // Report data
                if (league.size() == 0) {
                    System.out.println("No clubs currently in database.");
                    continue;
                }
                System.out.println("/".repeat(15));
                System.out.println("CLUB DATABASE");
                for (int i = 0; i < league.size(); i++) {
                    System.out.println(i + 1 + ": " + league.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
            }
//            ^ else if (menuChoice == 2) {
//                ???
            // Display text file or mySQL db with stored data
//            }
              else {
                  Club enteredClub = createClub();
                  league.add(enteredClub);
            }


            System.out.println("Thank you for using the Custom Club Database. 'Til next time!");
        }



    }

    private static Club createClub() {

        // Declare variables and call UI method to read input
        String name = UI.readString("Enter the club name.");
        // Needed to use StringBuilder to dynamically add strings depending on number of players
        StringBuilder players = UI.readStringList();
        short year = UI.readShort("Enter the year this club was founded.", (short)1800, (short)2022);
        byte goalsScored = UI.readByte("Enter how many goals this club has scored in its current season.", (byte)0, (byte)127);
        byte goalsAgainst = UI.readByte("Enter how many goals have been scored against this club in its current season.", (byte)0, (byte)127);
        int stadiumCap = UI.readInt("How many people can the club's stadium hold?", 100, 120_000);


        // Return new instance of object
        return new Club(name, players, year, goalsScored, goalsAgainst, stadiumCap);

    }
}
