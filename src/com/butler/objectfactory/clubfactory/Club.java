package com.butler.objectfactory.clubfactory;

public class Club {

    // String name, String[] playerList, short yearFounded, byte goalsScored, byte goalsAgainst, int stadiumCap

    private String name;
    private StringBuilder playerList;
    private short yearFounded;
    private byte goalsScored;
    private byte goalsAgainst;
    private int stadiumCap;

    public Club(String name, StringBuilder playerList, short yearFounded, byte goalsScored, byte goalsAgainst, int stadiumCap) {
        this.name = name;
        this.playerList = playerList;
        this.yearFounded = yearFounded;
        this.goalsScored = goalsScored;
        this.goalsAgainst = goalsAgainst;
        this.stadiumCap = stadiumCap;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public StringBuilder getPlayerList() {
        return playerList;
    }

    public short getYearFounded() {
        return yearFounded;
    }

    public byte getGoalsScored() {
        return goalsScored;
    }

    public byte getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getStadiumCap() {
        return stadiumCap;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", playerList=" + playerList +
                ", yearFounded=" + yearFounded +
                ", goalsScored=" + goalsScored +
                ", goalsAgainst=" + goalsAgainst +
                ", stadiumCap=" + stadiumCap +
                '}';
    }
}
