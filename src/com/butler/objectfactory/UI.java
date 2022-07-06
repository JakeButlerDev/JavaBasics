package com.butler.objectfactory;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class UI {
    // one method for each type of data
    // all static methods
    // take in a question, return a piece of data of the specific type requested

    private static final Scanner scanner = new Scanner(System.in);

    // String, int, double, short, boolean

//    public static String readString(String question) {
//        System.out.println(question);
//        String input = scanner.nextLine();
//        if (input.trim().equals("")) {      // Recursive looping
//            return readString(question);
//        } else return input;
//    }

    public static String readString(String question) {
        while (true) {          // Incremental looping
            System.out.println(question);
            String input = scanner.nextLine();
            if (!input.trim().equals(""))
                return input;
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
}
