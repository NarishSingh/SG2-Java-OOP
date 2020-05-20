/*
User Account DAO exception handling
*/
package com.sg.m2dvdlibrary.dao;

public class UserAccountDAOException extends Exception {
    public UserAccountDAOException(String message){
        super(message);
    }
    
    public UserAccountDAOException(String message, Throwable cause){
        super(message, cause);
    }
}
