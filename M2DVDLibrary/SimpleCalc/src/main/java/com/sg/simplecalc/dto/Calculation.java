/*
Calculation object
 */
package com.sg.simplecalc.dto;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public class Calculation {

    /*fields*/
    private long timestampID;
    private double firstNum;
    private double secondNum;
    private String operation;
    private double result;

    /*ctor*/
    public Calculation(long timestampID) {
        this.timestampID = timestampID;
    }
    
    public Calculation(double firstNum, double secondNum, String operation) {
        this.timestampID = System.currentTimeMillis();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
    }

    /*getter/setters*/
    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    /*read-only*/
    public long getTimestampID() {
        return timestampID;
    }

}
