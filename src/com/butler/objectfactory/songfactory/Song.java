package com.butler.objectfactory.songfactory;

public class Song {

    // String title, String artist, String genre, short year, boolean wentPlatinum, int spotifyStreams, int seconds

    private String title;
    private String artist;
    private String genre;
    private short year;
    private boolean wentPlatinum;
    private int youtubeStreams;
    private int seconds;

    public Song(String title, String artist, String genre, short year, boolean wentPlatinum, int youtubeStreams, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.wentPlatinum = wentPlatinum;
        this.youtubeStreams = youtubeStreams;
        this.seconds = seconds;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public short getYear() {
        return year;
    }

    public boolean isWentPlatinum() {
        return wentPlatinum;
    }

    public int getYoutubeStreams() {
        return youtubeStreams;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", wentPlatinum=" + wentPlatinum +
                ", spotifyStreams=" + youtubeStreams +
                ", seconds=" + seconds +
                '}';
    }
}
