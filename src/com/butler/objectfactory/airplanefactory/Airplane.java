package com.butler.objectfactory.airplanefactory;

public class Airplane {

    // Model name, tail number, passenger capacity, plane value, gas tank percent, is flying
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private int marketValue;
    private double gasTankPercent;
    private boolean isFlying;

    public Airplane(String modelName, String tailNumber, short passengerCap, int marketValue, double gasTankPercent, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTankPercent = gasTankPercent;
        this.isFlying = isFlying;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public double getGasTankPercent() {
        return gasTankPercent;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airplane{");
        sb.append("modelName='").append(modelName).append('\'');
        sb.append(", tailNumber='").append(tailNumber).append('\'');
        sb.append(", passengerCap=").append(passengerCap);
        sb.append(", marketValue=").append(marketValue);
        sb.append(", gasTankPercent=").append(gasTankPercent);
        sb.append(", isFlying=").append(isFlying);
        sb.append('}');
        return sb.toString();
    }
}
