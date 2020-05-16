package com.sg.simplecalc.ui;

import com.sg.simplecalc.dto.Calculation;
import java.util.*;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public class CalcView {

    private UserIO io;

    /*ctor*/
    public CalcView(UserIO io) {
        this.io = io;
    }

    /*View Behavior*/
    /**
     * Print UI menu and get selection
     *
     * @return {int} 1-8 for menu choice
     */
    public int printMenuGetSelection() {
        io.print("===New Calculation===");
        io.print("1 | Addition | +");
        io.print("2 | Subtraction | -");
        io.print("3 | Multiplication | *");
        io.print("4 | Division | /");
        io.print("5 | Remainder of Division | %");
        io.print("6 | Exponent | ^");
        io.print("===Log===");
        io.print("7 | Calculation Log");
        io.print("8 | Clear Log");
        io.print("0 | Exit");

        return io.readInt("Action", 0, 8);
    }

    public String opAsString(int operation) {
        switch (operation) {
            case 1: {
                return "+";
            }
            case 2: {
                return "-";
            }
            case 3: {
                return "*";
            }
            case 4: {
                return "/";
            }
            case 5: {
                return "%";
            }
            case 6: {
                return "^";
            }
            default: {
                throw new IllegalArgumentException("Unknown command");
            }
        }
    }

    /*ALL*/
    public Calculation getNewCalc(int operation) {
        double a = io.readDouble("Enter first number: ");
        double b = io.readDouble("Enter second number: ");
        Calculation currentCalc = new Calculation(a, b, opAsString(operation));

        return currentCalc;
    }

    /**
     * display closing calculation success banner for UI
     */
    public void displayCalcSuccess() {
        io.readString("Computation complete. Press ENTER to continue");
    }
    
    public void displayResult(Calculation calc){
        io.print(String.valueOf(calc.getResult()));
    }

    /*1 - (+)*/
    public void displayAddBanner() {
        io.print("===Addition===");
    }

    /*2 - (-)*/
    public void displaySubtractBanner() {
        io.print("===Subtraction===");
    }

    /*3 - (*)*/
    public void displayMultiplicationBanner() {
        io.print("===Multiplication===");
    }

    /*4 - (/)*/
    public void displayDivisionBanner() {
        io.print("===Division===");
    }

    /*5 - (%)*/
    public void displayModuloBanner() {
        io.print("===Remainder of Division===");
    }

    /*6 - (^)*/
    public void displayExponentBanner() {
        io.print("===Exponent===");
    }

    /*7 - see log*/
    public void displayLogBanner() {
        io.print("===log===");
    }

    public void displayLog(List<Calculation> calcLog) {
        for (Calculation c : calcLog) {
            io.print(c.getTimestampID() + " | " + c.getFirstNum() + " "
                    + c.getOperation() + " " + c.getSecondNum() + " = " + c.getResult());
        }

        io.readString("Press ENTER to continue.");
    }

    public void displayLogEmptyBanner() {
        io.print("No calculations to show.");
    }

    /*8 - clear log*/
    public void displayClearLogBanner() {
        io.print("===Clear Log===");
    }

    public boolean getClearConfirm() {
        io.print("Clear calculation log? Please enter:");
        io.print("y - clear | n - cancel");
        String clearConfirm = io.readString("Enter: ");

        if (clearConfirm.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void displayClearSuccessBanner() {
        io.print("Log cleared successfully");
    }

    public void displayClearFailBanner() {
        io.print("Canceled. Log still viewable.");
    }

    /*0 - EXIT*/
    /**
     * Display Exit banner in UI
     */
    public void displayExitBanner() {
        io.print("***Thank you***");
    }

    /*EXCEPTION/ERROR HANDLING*/
    /**
     * Display Unknown Command banner in UI
     */
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command...");
    }

    /**
     * Display error message for issues with IO
     *
     * @param errorMsg {String} error message to user
     */
    public void displayErrorMessage(String errorMsg) {
        io.print("===Error===");
        io.print(errorMsg);
    }
}
