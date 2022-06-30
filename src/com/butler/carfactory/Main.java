package com.butler.carfactory;

import java.util.Scanner;
import com.butler.challenge2Car.Car;

public class Main {


    public static void main(String[] args) {
        createACar();
        createACarObject();
    }

    public static void createACar () {
//        Create a method called “createACar” in your Main class.
//        This method should take in three user inputs: make, model, and owner.
//                Once the inputs have been received by the program, output the statement
//      “ <owner> owns the car <make> <model>.”
//        In your output <owner>, <make>, and <model> should be replaced by the data received from the user.


                Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the following details of your car: \n");

        System.out.print("Enter make below \n Make: ");
        String make = scanner.nextLine().trim();

        System.out.print("Enter model below \n Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter owner of car below \n Owner: ");
        String owner = scanner.nextLine();

        System.out.println(owner + " owns the car " + make + " " + model + ".");
    }

    public static void createACarObject () {
//        Create a method call “createACarObject” in your Main class
//        This method should take four user inputs: make, model, mileage, and gasTankPercentage.
//        Once the inputs have been received by the program, create a new instance of the Car class.
//        Then output a sentence that contains the make, model, mileage and gasTankPercentage
//
//
//        BONUS: get the user inputs for mileage and percent to not break the program when a string value is given as input.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me some details about this car.");
        System.out.print("Enter the make below \n Make: ");
        String make = scanner.nextLine().trim();

        System.out.print("Enter the model below \n Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter the mileage below \n Mileage: ");
        int mileage = scanner.nextInt();

        System.out.print("Enter the gas tank percentage below \n Gas Tank Percentage: ");
        float gasTankPercentage = scanner.nextFloat();

        Car userCar = new Car(make, model, mileage, gasTankPercentage);
        System.out.println(userCar.toString());
    }
}
