/*
This is the error class for our application. It extends Exception.
 */
package com.sg.classroster.dao;

public class ClassRosterDaoException extends Exception {

    public ClassRosterDaoException(String message) {
        super(message);
    }

    public ClassRosterDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
