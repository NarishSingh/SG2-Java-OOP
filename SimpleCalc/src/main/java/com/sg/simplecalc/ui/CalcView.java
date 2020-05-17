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
    
    public CalcView(UserIO io) {
        this.io = io;
    }

    /*View Behavior*/
    /**
     * Print UI menu and get selection
     *
     * @return {int} 0-8 for menu choice
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

        return io.readInt("Action: ", 0, 8);
    }

    /**
     * Convert numerical input to String
     * @param operation {int} user's menu selection
     * @return {String} the operation to be stored in Calculation obj's
     */
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
    /**
     * Get numbers for a new Calculation obj
     * @param operation {int} fill in operation field of obj from user's menu selection
     * @return {Calculation} obj with all fields filled sans the result
     */
    public Calculation getNewCalc(int operation) {
        double a = io.readDouble("Enter first number: ");
        double b = io.readDouble("Enter second number: ");
        Calculation currentCalc = new Calculation(a, b, opAsString(operation));

        return currentCalc;
    }

    /**
     * Display result as string
     * @param calc {Calculation} obj whose result is to be printed to console
     */
    public void displayResult(Calculation calc){
        io.print(String.valueOf(calc.getResult()));
    }
    
    /**
     * display closing calculation success banner for UI
     */
    public void displayCalcSuccess() {
        io.readString("Computation complete. Press ENTER to continue");
    }

    /*1 - (+)*/
    /**
     * display opening Addition banner for UI
     */
    public void displayAddBanner() {
        io.print("===Addition===");
    }

    /*2 - (-)*/
    /**
     * display opening Subtraction banner for UI
     */
    public void displaySubtractBanner() {
        io.print("===Subtraction===");
    }

    /*3 - (*)*/
    /**
     * display opening Multiplication banner for UI
     */
    public void displayMultiplicationBanner() {
        io.print("===Multiplication===");
    }

    /*4 - (/)*/
    /**
     * display opening Division banner for UI
     */
    public void displayDivisionBanner() {
        io.print("===Division===");
    }

    /*5 - (%)*/
    /**
     * display opening Modulo banner for UI
     */
    public void displayModuloBanner() {
        io.print("===Remainder of Division===");
    }

    /*6 - (^)*/
    /**
     * display opening Exponent banner for UI
     */
    public void displayExponentBanner() {
        io.print("===Exponent===");
    }

    /*7 - see log*/
    /**
     * display opening Log banner for UI
     */
    public void displayLogBanner() {
        io.print("===Log===");
    }

    /**
     * Display calculation log
     * @param calcLog {List} List of all Calculation obj
     */
    public void displayLog(List<Calculation> calcLog) {
        for (Calculation c : calcLog) {
            io.print(c.getTimestampID() + " | " + c.getFirstNum() + " "
                    + c.getOperation() + " " + c.getSecondNum() + " = " + c.getResult());
        }

        io.readString("Press ENTER to continue.");
    }

    /**
     * Display closing Log banner 
     */
    public void displayLogEmptyBanner() {
        io.print("No calculations to show.");
        io.readString("Press ENTER to continue.");
    }

    /*8 - clear log*/
    /**
     * Display opening Clear Log banner
     */
    public void displayClearLogBanner() {
        io.print("===Clear Log===");
    }

    /**
     * Get confirmation to clear log, and clear if so
     * @return {boolean} indicating if log has been cleared
     */
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

    /**
     * Display closing Clear banner if successfully cleared
     */
    public void displayClearSuccessBanner() {
        io.print("Log cleared successfully");
        io.readString("Press ENTER to continue.");
    }

    /**
     * Display closing Clear banner if unsuccessfully cleared
     */
    public void displayClearFailBanner() {
        io.print("Canceled. Log still viewable.");
        io.readString("Press ENTER to continue.");
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
