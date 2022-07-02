package com.butler.asktheuser;

import java.util.Scanner;

public class UserInterface {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        askUserName();
    }

    private static void askUserName() {
        System.out.print("What is your name? \n Name: ");
        String userName = scanner.nextLine();
        System.out.println("Your name: " + userName);
    }
}
