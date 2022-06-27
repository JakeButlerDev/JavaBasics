package com.butler.sayhello;

import java.util.Scanner;
import com.butler.challenge3.NameGenerator;

public class Main {
    public static void main(String[] args) {
        // Call methods
        whatIsYourName();
        whatIsYourFullName();
    }

    public static void whatIsYourName () {
        // Create instance of Scanner to get input
        Scanner scanner = new Scanner(System.in);
        // Ask for input
        System.out.println("Enter your name: ");
        // Assign input to field
        String name = scanner.next();
        // Output statement
        System.out.println("Hello, nice to meet you " + name.trim());
    }

    public static void whatIsYourFullName () {
        // Create instance of Scanner to get input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input, store in fields
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine().trim();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine().trim();

        // Call NameGenerator and create a new instance of it
        NameGenerator myName = new NameGenerator();
        // Output statement
        System.out.println("It is so nice to formally meet you " + myName.generateFullName(firstName, lastName));
    }
}
