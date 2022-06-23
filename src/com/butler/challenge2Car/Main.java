package com.butler.challenge2Car;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car("Camaro 2SS", "Chevy", 10000, 0.10F);
//        Car car2 = new Car("Mustang GT", "Ford", 30000, 0.50F);
//        Car car3 = new Car("Hellcat", "Dodge", 100, 0.90F);

//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);

        // BONUS
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();


        car1.setMake("Camaro2SS");
        car1.setModel("Chevy");
        car1.setMileage(10000);
        car1.setGasTankPercent(0.10F);

        car2.setMake("Mustang GT");
        car2.setModel("Ford");
        car2.setMileage(30000);
        car2.setGasTankPercent(0.50F);

        car3.setMake("Hellcat");
        car3.setModel("Dodge");
        car3.setMileage(100);
        car3.setGasTankPercent(0.90F);

        String[] cars = { car1.toCarString(), car2.toCarString(), car3.toCarString() };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
//        car2.toCarString();
//        car3.toCarString();
    }
}
