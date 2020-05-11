/*
Your DVD data transfer object should have the following fields:

Title
Release date
MPAA rating
Director's name
Studio
User rating or note (allows the user to enter additional information, e.g., "Good family movie")
 */
package com.sg.m2dvdlibrary.dto;

public class DVD {

    /*fields*/
    private String title;
    private String releaseDate;
    private String director;
    private String studio;
    private String mpaaRating;
    private String userRating;

    /*ctor*/
    public DVD(String title) {
        this.title = title;
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

    /*read only - getter*/
    public String getTitle() {
        return title;
    }

}
