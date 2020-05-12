package com.sg.m2dvdlibrary.controller;

import com.sg.m2dvdlibrary.dao.DVDLibraryDAO;
import com.sg.m2dvdlibrary.dao.DVDLibraryDAOException;
import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.ui.DVDLibraryView;
import com.sg.m2dvdlibrary.ui.UserIO;
import com.sg.m2dvdlibrary.ui.UserIOImpl;
import java.util.List;

public class DVDLibraryController {

    private UserIO io = new UserIOImpl();
    private DVDLibraryDAO dao;
    private DVDLibraryView view;

    public DVDLibraryController(DVDLibraryDAO dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean editLibrary = true;
        int menuSelection = 0;

        //TODO encapsulate in try-catch w app specific exception
        try {
            while (editLibrary) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1: {
                        //add
                        break;
                    }
                    case 2: {
                        //remove
                        break;
                    }
                    case 3: {
                        //edit
                        break;
                    }
                    case 4: {
                        //list all
                        break;
                    }
                    case 5: {
                        //view dvd info
                        break;
                    }
                    case 6: {
                        editLibrary = false;
                        break;
                    }
                    default: {
                        unknownCommand();
                    }
                }

                exitMessage();
            }
        } catch (DVDLibraryDAOException e) {
            view.displayErrorMessage(e.getMessage());
        }

    }

    /**
     * Get input for menu choice
     *
     * @return {int} 1-6 for menu actions
     */
    private int getMenuSelection() {
        return view.printMenuGetSelection();
    }



    private void editDVD() throws DVDLibraryDAOException {
        view.displayEditDVDBanner();
        String dvdTitle = view.getDVDTitle();
        DVD editedDVD = dao.getDVD(dvdTitle);
        view.editDVDEntry(editedDVD);
        dao.addDVD(dvdTitle, editedDVD); //will overwrite the value in HashMap
        view.displayEditDVDSuccessBanner();
    }

    private void listLibrary() throws DVDLibraryDAOException {
        view.displayDisplayLibraryBanner();
        List<DVD> dvdList = dao.getLibrary();
        view.displayLibrary(dvdList);
    }

    //TODO finish the rest of controller methods
    
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
