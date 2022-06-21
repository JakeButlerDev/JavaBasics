package com.butler.challenge3;

public class Main {
    public static void main(String[] args) {
        String firstName = "Jake";
        String lastName = "Butler";

        NameGenerator nameGen = new NameGenerator();
        // If not static, must create an instance of that class
        // If the method is static, you can just call the class

        String generatedFullName = nameGen.generateFullName("Lionel", "Messi");
        System.out.println(generatedFullName);
    }
}
