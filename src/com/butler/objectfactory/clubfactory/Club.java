package com.butler.objectfactory.clubfactory;

import com.butler.objectfactory.UI;

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
                "Club name: '" + name + "\n" +
                ", Team Roster: " + playerList + "\n" +
                ", Year founded: " + yearFounded + "\n" +
                ", Goals Scored: " + goalsScored + "\n" +
                ", Goals Against: " + goalsAgainst + "\n" +
                ", Maximum stadium seating: " + stadiumCap + "\n" +
                '}';
    }

    public static Club createClub() {

        // Declare variables and call UI method to read input
        String name = UI.readString("Enter the club name.");
        // Needed to use StringBuilder to dynamically add strings depending on number of players
        StringBuilder players = UI.readStringList();
        short year = UI.readShort("Enter the year this club was founded.", (short)1800, (short)2022);
        byte goalsScored = UI.readByte("Enter how many goals this club has scored in its current season.", (byte)0, (byte)127);
        byte goalsAgainst = UI.readByte("Enter how many goals have been scored against this club in its current season.", (byte)0, (byte)127);
        int stadiumCap = UI.readInt("How many people can the club's stadium hold?", 100, 120_000);

        // ^ This data is not accessible to each other, aka year data for specific club could not be used in conjunction with goals against.
        // The workaround for this would be to create a blank default constructor in another method of this class:
        // public Club() {
        //
        //    }
        // Then at the beginning of this method we could create the instance of that blank Club:
        //        Club newClub = new Club();
        // One issue with this method is now any Class can access this default constructor, potentially misusing it
        // We can get around this by making the default constructor private

        // Return new instance of object
        return new Club(name, players, year, goalsScored, goalsAgainst, stadiumCap);

    }
}
