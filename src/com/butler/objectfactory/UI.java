package com.butler.objectfactory;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    // one method for each type of data
    // all static methods
    // take in a question, return a piece of data of the specific type requested

    private static final Scanner scanner = new Scanner(System.in);


//    public static String readString(String question) {
//        System.out.println(question);
//        String input = scanner.nextLine();
//        if (input.trim().equals("")) {      // Recursive looping
//            return readString(question);
//        } else return input;
//    }

    public static char readChar(String question) {
        while (true) {          // Incremental looping
            System.out.println(question);
            String input = scanner.nextLine().trim();
            if (input.length() == 1)
                return input.charAt(0);
            else if (input.equals("")) {
                System.out.println("\nYou can not leave input blank.");
            } else {
                System.out.println("\nYou must only input one character.");
            }
        }
    }


    public static String readString(String question) {
        while (true) {          // Incremental looping
            System.out.println(question);
            String input = scanner.nextLine().trim();
            if (!input.equals("")) {
                return input;
            }
            }
        }


    public static StringBuilder readStringList() {
        // Could this be done with a Stack??    https://www.geeksforgeeks.org/stack-class-in-java/
        // Or String Builder
        // Try ArrayList next time
        System.out.println("How many players play for the club?");
        byte players = scanner.nextByte();
        scanner.nextLine();
        // Create instance of StringBuilder Class
        StringBuilder playerList = new StringBuilder();
        for (int i = 0; i < players; i++) {
                System.out.println("What is this player's name?");
                String player = scanner.nextLine();
                // Entered player stored as new String in list
                playerList.append(player);
                if (player.trim().equals(""))
                    System.out.println("Enter a valid name.");
            }
        // ERROR HANDLING?? DEVELOP
        return playerList;
    }

//    public static ArrayList<String> readArrayList(String value) {
//
//        while(true) {
//            try {
//                System.out.println("Enter your " + value);
//                ArrayList<String> input = new ArrayList<>();
//                int i = 0;
//                ArrayList<String> input[i] = scanner.nextLine();
//                return input;
//            }
//        }
//    }

    public static ArrayList<String> readListOfStrings(String question, int min, int max) {

        ArrayList<String> responses = new ArrayList<>();
        System.out.println(question);
        System.out.println("Please enter at least " + min + " inputs, and at most " + max + " inputs.");

        for (int i = 0; i < max; i++) {

            String userInput = readString("\n(" + (i+1) + "/" + max + ")");
            responses.add(userInput);
            if (responses.size() == max) {
                System.out.println("Max number of inputs have been recorded.");
            } else if (responses.size() >= min && !readYesOrNo("Would you like to add more inputs?")) break;

        }

        System.out.println("Your responses have been recorded.");
        return responses;


    }

    public static boolean readYesOrNo(String question) {

        while (true) {

            String userInput = readString(question + "\n(y/n): ");
            char selection = userInput.toLowerCase().charAt(0);
            if (selection == 'y') return true;
            if (selection == 'n') return false;
            System.out.println("Input must be y or n.");

        }

    }

    public static boolean readBoolean(String question) {
        while (true) {
            try  {
                System.out.print(question + "\n(true/false)");
                boolean input =  scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be true or false.");
                scanner.nextLine();
            }

        }
    }

    public static Integer readInt(String question, int min, int max) {
        while (true) {
            try  {
                System.out.print(question + "\n("+min+"-"+max+"): ");
                int input =  scanner.nextInt();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }
    }

    public static short readShort(String question, short min, short max) {
        while (true) {
            try  {
                System.out.print(question + "\n("+min+"-"+max+"): ");
                short input =  scanner.nextShort();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }
    }

    public static double readDouble(String question, double min, double max) {
        while (true) {
            try  {
                System.out.print(question + "\n("+min+"-"+max+"): ");
                double input =  scanner.nextDouble();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }
    }

    public static byte readByte(String question, byte min, byte max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + "-" + max + "): ");
                byte input = scanner.nextByte();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }

    }

    public static long readLong(String question, long min, long max) {
        while (true) {
            try  {
                System.out.print(question + "\n("+min+"-"+max+"): ");
                long input =  scanner.nextLong();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }
    }

    public static float readFloat(String question, float min, float max) {
        while (true) {
            try  {
                System.out.print(question + "\n("+min+"-"+max+"): ");
                float input =  scanner.nextFloat();
                scanner.nextLine();
                if (input <= max && input >= min)
                    return input;
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max + ".");
                scanner.nextLine();
            }

        }
    }


}







/* OOP NOTES

Before OOP, we had Procedural Programming which divided a program into a set of functions. These functions can be interdependent, and if one breaks they all collapse.

In OOP, we group like data together and call them Objects. When we write code in OOP, functions have fewer parameters and are easier to maintain.

ENCAPSULATION
Reduce complexity & increase reusability


ABSTRACTION
When the complexity of how a problem is solved is hidden, only necessary information is shown.
Reduce complexity & isolate impact of change


INHERITANCE
Eliminate redundant code


POLYMORPHISM
Refactor complex switch/case statements


 */
