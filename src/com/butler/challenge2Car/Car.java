package com.butler.challenge2Car;

public class Car  {
    // Initialize fields
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }
    // BONUS
    // Define Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public Integer getMileage() { return mileage;}
    public Float getGasTankPercent() { return gasTankPercent;}

    // Define Setters

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return ("Make:" + getMake() + " " + "Model:" + getModel() + " " + "mileage:" + getMileage() + " " + "gasTankPercent:" + getGasTankPercent());
    }


}
