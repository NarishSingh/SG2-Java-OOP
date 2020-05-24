//TODO javadoc
package com.sg.m2dvdlibrary.dao;

import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.dto.User;
import java.util.List;

public interface UserAccountDAO {
    
    User addUser(String name, User user) throws UserAccountDAOException;
    
    User removeUser(String name, User user) throws UserAccountDAOException;
    
    boolean logIn(String name, String password) throws UserAccountDAOException; //aka get user

    void borrowDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException;
    
    void returnDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException;
    
    List<DVD> currentlyBorrowed(User account) throws UserAccountDAOException;
}
