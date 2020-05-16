package com.sg.simplecalc.controller;

import com.sg.simplecalc.dao.CalcDAO;
import com.sg.simplecalc.dao.CalcDAOException;
import com.sg.simplecalc.dto.Calculation;
import com.sg.simplecalc.ui.CalcView;
import com.sg.simplecalc.ui.UserIO;
import java.util.*;

/**
 * Practice with MVC
 *
 * @author Narish Singh
 */
public class CalcController {

    private UserIO io;
    private CalcDAO dao;
    private CalcView view;

    public CalcController(CalcDAO dao, CalcView view) {
        this.dao = dao;
        this.view = view;
    }

    /**
     * App controller
     */
    public void run() {
        boolean calculating = true;
        int menuSlct = 0;

        try {
            while (calculating) {
                menuSlct = getMenuSelection(); //uses view to get user input

                switch (menuSlct) {
                    case 1: {
                        addNum();
                        break;
                    }
                    case 2: {
                        subtractNum();
                        break;
                    }
                    case 3: {
                        multiplyNum();
                        break;
                    }
                    case 4: {
                        divideNum();
                        break;
                    }
                    case 5: {
                        moduloNum();
                        break;
                    }
                    case 6: {
                        exponentNum();
                        break;
                    }
                    case 7: {
                        listLog();
                        break;
                    }
                    case 8: {
                        clearCalcLog();
                        break;
                    }
                    case 0: {
                        calculating = false;
                        break;
                    }
                    default: {
                        unknownCommand();
                    }
                }

                exitMessage();
            }
        } catch (CalcDAOException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    /*1 - (+)*/
    private void addNum() throws CalcDAOException {
        view.displayAddBanner();
        Calculation newCalc = view.getNewCalc(1);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*2 - (-)*/
    private void subtractNum() throws CalcDAOException {
        view.displaySubtractBanner();
        Calculation newCalc = view.getNewCalc(2);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*3 - (*)*/
    private void multiplyNum() throws CalcDAOException {
        view.displayMultiplicationBanner();
        Calculation newCalc = view.getNewCalc(3);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*4 - (/)*/
    private void divideNum() throws CalcDAOException {
        view.displayDivisionBanner();
        Calculation newCalc = view.getNewCalc(4);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*5 - (%)*/
    private void moduloNum() throws CalcDAOException {
        view.displayModuloBanner();
        Calculation newCalc = view.getNewCalc(5);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*6 - (^)*/
    private void exponentNum() throws CalcDAOException {
        view.displayModuloBanner();
        Calculation newCalc = view.getNewCalc(6);
        dao.performCalc(newCalc);
        view.displayResult(newCalc);
        dao.logCalc(newCalc.getTimestampID(), newCalc);
        view.displayCalcSuccess();
    }

    /*7 - log*/
    private void listLog() throws CalcDAOException {
        view.displayLogBanner();
        List<Calculation> calcList = dao.getLog();
        if (!calcList.isEmpty()) {
            view.displayLog(calcList);
        } else {
            view.displayLogEmptyBanner();
        }
    }

    /*8 - clear log*/
    private void clearCalcLog() throws CalcDAOException {
        view.displayClearLogBanner();
        if (view.getClearConfirm()) {
            dao.clearLog();
            view.displayClearSuccessBanner();
        } else {
            view.displayClearFailBanner();
        }
    }

    /*VIEW/UI ONLY METHODS*/
    /**
     * Get input for menu choice
     *
     * @return {int} 1-6 for menu actions
     */
    private int getMenuSelection() {
        return view.printMenuGetSelection();
    }

    /**
     * Display banner for an invalid Menu choice
     */
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    /**
     * Display banner for exiting app
     */
    private void exitMessage() {
        view.displayExitBanner();
    }
}
