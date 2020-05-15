package com.sg.simplecalc.ui;

import com.sg.simplecalc.dto.Calculation;

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
        io.print("Calculations:");
        io.print("1 | Addition | +");
        io.print("2 | Subtraction | -");
        io.print("3 | Multiplication | *");
        io.print("4 | Division | /");
        io.print("5 | Remainder of Division | %");
        io.print("6 | Exponent | ^");
        io.print("7 | Exit");

        return io.readInt("Action", 1, 7);
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

    /*1 - (+)*/
    public void displayAddBanner() {
        io.print("===Addition===");
    }

    /*2 - (-)*/
 /*3 - (*)*/
 /*4 - (/)*/
 /*5 - (%)*/
 /*6 - (^)*/
 /*7 - (SQRT)*/
 /*8 - EXIT*/
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
