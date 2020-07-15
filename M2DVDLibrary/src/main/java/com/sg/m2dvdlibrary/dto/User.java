/*
User, who can loan DVD's
 */
package com.sg.m2dvdlibrary.dto;

import java.util.*;

public class User {

    private String name;
    private String password;
    private boolean loggedIn;
    private Map<String, DVD> titlesBorrowed = new HashMap<>();

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

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public Map<String, DVD> getTitlesBorrowed() {
        return titlesBorrowed;
    }

    public void setTitlesBorrowed(Map<String, DVD> titlesBorrowed) {
        this.titlesBorrowed = titlesBorrowed;
    }

    /*read only*/
    public String getName() {
        return name;
    }

    /*DVD borrowing/returning*/
    public void borrowDVD(String title, DVD borrowing){
        titlesBorrowed.put(title, borrowing);
    }
    
    public void returnDVD(String title){
        titlesBorrowed.remove(title);
    }
    
    public Set<String> borrowList(){
        return titlesBorrowed.keySet();
    }
}
