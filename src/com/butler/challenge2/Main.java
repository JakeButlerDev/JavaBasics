package com.butler.challenge2;

public class Main {
    public static void main(String[] args) {
        String firstName = "Jake";
        String lastName = "Butler";

        System.out.println(createFullName("First", "Last"));
    }

    private static String createFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
