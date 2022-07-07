package com.butler.objectfactory.playerfactory;

public class Player {

    // String playerName, String club, float totalPoints, byte goals, byte assists, boolean isInjured

    private String playerName;
    private String club;
    private float totalPoints;
    private byte goals;
    private byte assists;
    private boolean isInjured;

    public Player(String playerName, String club, float totalPoints, byte goals, byte assists, boolean isInjured) {
        this.playerName = playerName;
        this.club = club;
        this.totalPoints = totalPoints;
        this.goals = goals;
        this.assists = assists;
        this.isInjured = isInjured;
    }
    // GETTERS
    public String getPlayerName() {
        return playerName;
    }

    public String getClub() {
        return club;
    }

    public float getTotalPoints() {
        return totalPoints;
    }

    public byte getGoals() {
        return goals;
    }

    public byte getAssists() {
        return assists;
    }

    public boolean isInjured() {
        return isInjured;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("playerName='").append(playerName).append('\'');
        sb.append(", club='").append(club).append('\'');
        sb.append(", totalPoints=").append(totalPoints);
        sb.append(", goals=").append(goals);
        sb.append(", assists=").append(assists);
        sb.append(", isInjured=").append(isInjured);
        sb.append('}');
        return sb.toString();
    }
}
