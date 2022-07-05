package com.butler.asktheuser;

public class Quiz {
    private byte userAge;
    private short birthYear;
    private int desiredIncome;
    private float hourlyRate;
    private long amznCap;
    private double mathQuestion;
    private boolean hasDog;
    private String roleModel;

    public Quiz(byte userAge, short birthYear, int desiredIncome, float hourlyRate, long amznCap, double mathQuestion, boolean hasDog, String roleModel) {
        this.userAge = userAge;
        this.birthYear = birthYear;
        this.desiredIncome = desiredIncome;
        this.hourlyRate = hourlyRate;
        this.amznCap = amznCap;
        this.mathQuestion = mathQuestion;
        this.hasDog = hasDog;
        this.roleModel = roleModel;
    }

    public byte getUserAge() {
        return userAge;
    }

    public void setUserAge(byte userAge) {
        this.userAge = userAge;
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        this.birthYear = birthYear;
    }

    public int getDesiredIncome() {
        return desiredIncome;
    }

    public void setDesiredIncome(int desiredIncome) {
        this.desiredIncome = desiredIncome;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public long getAmznCap() {
        return amznCap;
    }

    public void setAmznCap(long amznCap) {
        this.amznCap = amznCap;
    }

    public double getMathQuestion() {
        return mathQuestion;
    }

    public void setMathQuestion(double mathQuestion) {
        this.mathQuestion = mathQuestion;
    }

    public boolean isHasDog() {
        return hasDog;
    }

    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }

    public String getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(String roleModel) {
        this.roleModel = roleModel;
    }
}
