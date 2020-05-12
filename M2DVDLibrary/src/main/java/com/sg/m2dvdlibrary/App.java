/*
In this assessment, you will create a program that stores information about a DVD collection. The program must do the following:

-Allow the user to add a DVD to the collection
-Allow the user to remove a DVD from the collection
-Allow the user to edit the information for an existing DVD in the collection
-Allow the user to list the DVDs in the collection
-Allow the user to display the information for a particular DVD
-Allow the user to search for a DVD by title
-Load the DVD library from a file
-Save the DVD library back to the file when the program completes
-Allow the user to add, edit, or delete many DVDs in one session
 */
package com.sg.m2dvdlibrary;

import com.sg.m2dvdlibrary.controller.DVDLibraryController;
import com.sg.m2dvdlibrary.dao.DVDLibraryDAO;
import com.sg.m2dvdlibrary.dao.DVDLibraryDAOImpl;
import com.sg.m2dvdlibrary.ui.DVDLibraryView;
import com.sg.m2dvdlibrary.ui.UserIO;
import com.sg.m2dvdlibrary.ui.UserIOImpl;

public class App {

    public static void main(String[] args) {
        UserIO io = new UserIOImpl();
        DVDLibraryView v = new DVDLibraryView(io);
        DVDLibraryDAO dao = new DVDLibraryDAOImpl();
        DVDLibraryController c = new DVDLibraryController(dao, v);

        c.run();
    }

}
