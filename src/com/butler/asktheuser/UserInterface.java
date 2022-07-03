package com.butler.asktheuser;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values

public class UserInterface {

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BYTE
        System.out.print("What is your age?\n Age: ");
        byte userAge = scanner.nextByte();
        System.out.println("Your age is " + userAge + ".");
        scanner.nextLine();

        // SHORT
        System.out.print("What year were you born?\n Year: ");
        short birthYear = scanner.nextShort();
        System.out.println("You were born in " + birthYear + ".");
        scanner.nextLine();

        // INT
        System.out.print("What would you like your annual income to be?\n Income: ");
        int annualIncome = scanner.nextInt();
        System.out.println("Your desired annual income is " + annualIncome + ".");
        scanner.nextLine();

        // FLOAT
        System.out.print("What is your hourly pay rate?\n Pay rate: ");
        float hourlyRate = scanner.nextFloat();
        System.out.println("Your hourly rate is: $" + hourlyRate + ".");
        scanner.nextLine();

        // LONG
        System.out.println("What is the current market cap of Amazon?\n Market cap: ");
        long amznMarketCap = scanner.nextLong();
        System.out.println("The current market cap of Amazon is " + amznMarketCap + ".");
        scanner.nextLine();

        // DOUBLE
        System.out.println("What is 11 divided by 3? \n Answer: ");
        double mathAnswer = scanner.nextDouble();
        System.out.println("11 divided by 3 equals " + mathAnswer + ".");
        scanner.nextLine();

        // BOOLEAN
        System.out.println("True or false, you have a dog.\n True/False: ");
        boolean userDog = scanner.nextBoolean();
        if (userDog == true)
            System.out.println("True, you have a dog.");
        else
            System.out.println("False, you do not have a dog.");

        // STRING
        System.out.println("Who is your role model?\n Role Model: ");
        String roleModel = scanner.nextLine().trim();
        System.out.println("Your role model is " + roleModel + ".");

//        askUserName();
    }

//    private static void askUserName() {
//        System.out.print("What is your name? \n Name: ");
//        String userName = scanner.nextLine();
//        System.out.println("Your name: " + userName);
//    }
}
