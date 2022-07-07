package com.butler.objectfactory.songfactory;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the song database!\n\n");
        System.out.println("Enter the songs you'd like to store below:\n");

        // Declare variables and call UI method to read input
        String userTitle = UI.readString("What is the title of this song?");
        String userArtist = UI.readString("Who is the artist?");
        String userGenre = UI.readString("What genre is this song part of?");
        short year = UI.readShort("What year did this song release in?", (short)0, (short)2022);
        boolean wentPlatinum = UI.readBoolean("Did this song go platinum in any country?");
        int streams = UI.readInt("How many plays does this song have on YouTube?", (short)0, 2_100_000_000);
        int seconds = UI.readInt("How long is this song in seconds?", 0, 1_000_000);

        // Create instance of new object
        Song enteredSong = new Song(userTitle, userArtist, userGenre, year, wentPlatinum, streams, seconds);

        // Report data
        System.out.println(enteredSong);
    }
}
