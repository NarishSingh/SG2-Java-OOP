/*
exception
 */
package com.sg.simplecalc.dao;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public class CalcDAOException extends Exception {

    public CalcDAOException(String message) {
        super(message);
    }

    public CalcDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
