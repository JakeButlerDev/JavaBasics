package com.butler.objectfactory.clubfactory;

import java.util.ArrayList;

public class Player {

    private byte age;
    private double weightInPounds;
    private short heightInInches;
    private String fullName;
    private String knownAsName;
    private ArrayList<String> previousClubs;
    private short careerGoals;
    private short careerAssists;


    public Player(byte age, double weightInPounds, short heightInInches, String fullName, String knownAsName, ArrayList<String> previousClubs, short careerGoals, short careerAssists) {
        this.age = age;
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
        this.fullName = fullName;
        this.knownAsName = knownAsName;
        this.previousClubs = previousClubs;
        this.careerGoals = careerGoals;
        this.careerAssists = careerAssists;

    }

    public byte getAge() {
        return age;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public short getHeightInInches() {
        return heightInInches;
    }

    public String getFullName() {
        return fullName;
    }

    public String getKnownAsName() {
        return knownAsName;
    }

    public ArrayList<String> getPreviousClubs() {
        return previousClubs;
    }

    public short getCareerGoals() {
        return careerGoals;
    }

    public short getCareerAssists() {
        return careerAssists;
    }
}
