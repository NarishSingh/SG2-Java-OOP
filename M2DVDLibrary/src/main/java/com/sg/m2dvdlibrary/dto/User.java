/*
User, who can loan DVD's
 */
package com.sg.m2dvdlibrary.dto;

import java.util.*;

public class User {

    private String name;
    private String password;
    private boolean borrowed;
    private boolean loggedIn;
    private List<DVD> titlesBorrowed = new ArrayList<>();

    /*ctor*/
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.loggedIn = false;
    }

    /*getter/setter*/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; //FIXME how would I be able to have this as write only?
    }
    
    
    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /*read only*/
    public String getName() {
        return name;
    }

}
