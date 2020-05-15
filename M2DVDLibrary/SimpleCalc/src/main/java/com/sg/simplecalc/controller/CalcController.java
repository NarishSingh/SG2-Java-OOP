package com.sg.simplecalc.controller;

import com.sg.simplecalc.dao.CalcDAO;
import com.sg.simplecalc.dao.CalcDAOException;
import com.sg.simplecalc.dto.Calculation;
import com.sg.simplecalc.ui.CalcView;
import com.sg.simplecalc.ui.UserIO;

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
                        //-
                        break;
                    }
                    case 3: {
                        //*
                        break;
                    }
                    case 4: {
                        // /
                        break;
                    }
                    case 5: {
                        //%
                        break;
                    }
                    case 6: {
                        //^
                        break;
                    }
                    case 7: {
                        //sqrt
                        break;
                    }
                    case 8: {
                        //exit
                        break;
                    }
                    default:{
                        unknownCommand();
                    }       
                }
            }
        } catch (CalcDAOException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    
    private void addNum() throws CalcDAOException{
        view.displayAddBanner();
        Calculation newCalc=view.getNewCalc(1);
        //TODO dao - log calculation
        view.displayCalcSuccess();
    }
    
    
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
