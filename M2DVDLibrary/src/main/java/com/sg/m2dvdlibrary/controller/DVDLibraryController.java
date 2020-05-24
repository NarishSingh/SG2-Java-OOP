package com.sg.m2dvdlibrary.controller;
import com.sg.m2dvdlibrary.dao.DVDLibraryDAOException;
import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.service.ServiceDAO;
import com.sg.m2dvdlibrary.ui.DVDLibraryView;

//TODO can only import the service layer
import java.util.List;

public class DVDLibraryController {
    
    private ServiceDAO service;
    private DVDLibraryView view;

    /*DEPENDENCY INJECTION*/
    public DVDLibraryController(ServiceDAO service, DVDLibraryView view) {
        this.service = service;
        this.view = view;
    }

    /**
     * App controller
     */
    public void run() {
        boolean editLibrary = true;
        int menuSelection = 0;

        try {
            while (editLibrary) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1: {
                        createDVD();
                        break;
                    }
                    case 2: {
                        removeDVD();
                        break;
                    }
                    case 3: {
                        editDVD();
                        break;
                    }
                    case 4: {
                        listLibrary();
                        break;
                    }
                    case 5: {
                        viewDVD();
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

    /**
     * Display banners for DVD entry creation. Construct new DVD obj and fill
     * fields from user inputs. Add to library
     *
     * @throws DVDLibraryDAOException if unable to write to library
     */
    private void createDVD() throws DVDLibraryDAOException {
        view.displayNewDVDInfo();
        DVD newDVD = view.getNewDVDInfo();
        service.addDVD(newDVD.getTitle(), newDVD);
        view.displayNewDVDSuccessBanner();
    }

    /**
     * Display banners for DVD entry removal. Get title of DVD from user and
     * remove from library HashMap
     *
     * @throws DVDLibraryDAOException if unable to read from or write to library
     */
    private void removeDVD() throws DVDLibraryDAOException {
        view.displayRemoveDVDBanner();
        String dvdTitle = view.getDVDTitle();
        DVD removedDVD = service.removeDVD(dvdTitle);
        view.displayRemoveResult(removedDVD);
    }

    /**
     * Display banners for DVD entry editing. Get title of DVD, copy obj and
     * then get the new info for entry. Add edited entry to HashMap, overwriting
     * the obj value at that key
     *
     * @throws DVDLibraryDAOException if unable to read from or write to library
     */
    private void editDVD() throws DVDLibraryDAOException {
        view.displayEditDVDBanner();
        String dvdTitle = view.getDVDTitle();
        if (service.getDVD(dvdTitle) != null) {
            DVD editedDVD = service.getDVD(dvdTitle);
            view.editDVDEntry(editedDVD);
            service.addDVD(dvdTitle, editedDVD); //will overwrite the value in HashMap
            view.displayEditDVDSuccessBanner();
        } else {
            view.displayEditDVDFailBanner();
        }
    }

    /**
     * Display banners for DVD library titles listing. Retrieve and display
     * titles from key set of library HashMap
     *
     * @throws DVDLibraryDAOException if cannot read from library
     */
    private void listLibrary() throws DVDLibraryDAOException {
        view.displayDisplayLibraryBanner();
        List<DVD> dvdList = service.getLibrary();
        if (!dvdList.isEmpty()) {
            view.displayLibrary(dvdList);
        } else {
            view.displayLibraryEmptyBanner();
        }

    }

    /**
     * Display banners for DVD entry viewing. Get title from user, then retrieve
     * and display DVD obj
     *
     * @throws DVDLibraryDAOException if cannot read from library
     */
    public void viewDVD() throws DVDLibraryDAOException {
        view.displayDisplayDVDBanner();
        String dvdTitle = view.getDVDTitle();
        DVD dvd = service.getDVD(dvdTitle);
        view.getDVDEntry(dvd);
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
