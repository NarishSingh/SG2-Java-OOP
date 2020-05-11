package com.sg.m2dvdlibrary.controller;

import com.sg.m2dvdlibrary.ui.DVDLibraryView;
import com.sg.m2dvdlibrary.ui.UserIO;
import com.sg.m2dvdlibrary.ui.UserIOImpl;

public class DVDLibraryController {

    private UserIO io = new UserIOImpl();
    //TODO add dao var
    private DVDLibraryView view;

    //TODO add ctor
    public void run() {
        boolean editLibrary = true;
        int menuSelection = 0;

        //TODO encapsulate in try-catch w app specific exception
        while (editLibrary) {
            menuSelection = view.printMenuGetSelection();

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
                    //exit
                    break;
                }
                default:
                    throw new AssertionError();
            }
        }
    }
}
