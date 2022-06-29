package com.butler.createacar;

import com.butler.challenge2Car.Car;

import java.util.Scanner;

public class CarCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to the Car Creator.\n");

        // Only allowed to create one car, then program will end

        System.out.println("Please enter the make of your car: ");
        String userInputMake = scanner.nextLine();
        System.out.println("Please enter the model of your car: ");
        String userInputModel = scanner.nextLine();

        Car userCar = new Car(userInputMake, userInputModel, 0, 0);
        System.out.println("Your new car:" + userCar);
    }
}
