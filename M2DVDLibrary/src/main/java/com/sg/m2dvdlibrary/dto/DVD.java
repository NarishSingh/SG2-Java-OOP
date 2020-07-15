package com.sg.m2dvdlibrary.dto;

public class DVD {

    /*fields*/
    private String title;
    private String releaseDate;
    private String director;
    private String studio;
    private String mpaaRating;
    private String userRating;
    private boolean borrowed;

    /*ctor*/
    public DVD(String title) {
        this.title = title;
        borrowed=false;
    }

    /*getter/setters*/
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    /*read only - getter*/
    public String getTitle() {
        return title;
    }

}
