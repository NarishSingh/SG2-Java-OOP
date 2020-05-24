/*
this is going to replace all dao calls in the controller
will also run verification

this will connect the 2 DTO's and their respective DAO's
*/
package com.sg.m2dvdlibrary.service;

import com.sg.m2dvdlibrary.dao.DVDLibraryDAO;
import com.sg.m2dvdlibrary.dao.DVDLibraryDAOException;
import com.sg.m2dvdlibrary.dao.UserAccountDAO;
import com.sg.m2dvdlibrary.dao.UserAccountDAOException;
import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.dto.User;
import java.util.List;

public interface ServiceDAO {
    
    /*DVD*/
    /**
     * Add or edit a DVD entry to library associated w title. If a DVD exists
     * with this title already, it will return that same obj, otherwise null
     *
     * @param title {String} title associated with DVD
     * @param dvd   {DVD} DVD object
     * @return {DVD} obj for the associated/added title, null otherwise
     * @throws DVDLibraryDAOException
     */
    DVD addDVD(String title, DVD dvd) throws DVDLibraryDAOException;

    /**
     * List DVD's in library
     *
     * @return {List} library of DVD objects
     * @throws DVDLibraryDAOException if cannot load LIBRARY_FILE
     */
    List<DVD> getLibrary() throws DVDLibraryDAOException;

    /**
     * Gets DVD obj associated with title
     *
     * @param title {String} title of DVD object to retrieve
     * @return {DVD} the DVD objected associated with title
     * @throws DVDLibraryDAOException if cannot load LIBRARY_FILE
     */
    DVD getDVD(String title) throws DVDLibraryDAOException;

    /**
     * Removes DVD obj associated with title, returns null if no such DVD is in
     * library
     *
     * @param title {String} the title of DVD to be removed from library
     * @return {DVD} DVD obj removed, or null if nothing could be removed
     * @throws DVDLibraryDAOException if library cannot be loaded or written to
     */
    DVD removeDVD(String title) throws DVDLibraryDAOException;
    
    /*USER*/
    User addUser(String name, User user) throws UserAccountDAOException;
    
    User removeUser(String name, User user) throws UserAccountDAOException;
    
    boolean logIn(String name, String password) throws UserAccountDAOException; //aka get user
    
    DVD borrowDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException;
    
    DVD returnDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException;
    
    List<DVD> currentlyBorrowed(User account) throws UserAccountDAOException;
}
