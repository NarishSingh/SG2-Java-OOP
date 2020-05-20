package com.sg.m2dvdlibrary.dao;

import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.dto.User;
import java.io.*;
import java.util.*;

public class UserAccountDAOImpl implements UserAccountDAO {

    private final String ACCOUNT_LIST = "dvdLibAccounts.txt";
    private final String DELIMITER = "::";
    private Map<String, User> accounts = new HashMap<>();

    @Override
    public User addUser(String name, User user) throws UserAccountDAOException {
        loadAccountList();
        User newUser = accounts.put(name, user);

        //TODO experiment with a way to generate a new log file for a new user
//        File file=new File("${name} DVDList.txt"); //FIXME is this how to do regular expressions
        writeAccountList();

        return newUser;
    }

    @Override
    public User removeUser(String name, User user) throws UserAccountDAOException {
        loadAccountList();
        User removedUser = accounts.remove(name);
        writeAccountList();

        //TODO delete user's DVD log
        return removedUser;
    }

    //TODO maybe instead of string password, do a bool if login correct?
    @Override
    public boolean logIn(String name, String password) throws UserAccountDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DVD borrowDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException {
        //TODO requires the user log file
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DVD returnDVD(User account, DVD dvdBorrowed) throws UserAccountDAOException {
        //TODO requires the user log file
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DVD> currentlyBorrowed(User account) throws UserAccountDAOException {
        //TODO requires the user log file
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*Data (Un)marshalling*/
    private User unmarshallUser(String userAsText) {
        String[] userTokens = userAsText.split(DELIMITER);

        String userName = userTokens[0];
        User userFromFile = new User(userTokens[1], userTokens[2]);

        userFromFile.setBorrowed(Boolean.parseBoolean(userTokens[3]));
        userFromFile.setLoggedIn(Boolean.parseBoolean(userTokens[4]));

        return userFromFile;
    }

    private String marshallUser(User aUser) {
        String userAsTest = aUser.getName() + DELIMITER;
        userAsTest += aUser.getPassword() + DELIMITER;
        userAsTest += aUser.isBorrowed() + DELIMITER;
        userAsTest += aUser.isLoggedIn();

        return userAsTest;
    }

    private void loadAccountList() throws UserAccountDAOException {
        Scanner sc;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(ACCOUNT_LIST)));
        } catch (FileNotFoundException e) {
            throw new UserAccountDAOException("Couldn't load account list.", e);
        }

        String currentLine;
        User currentUser;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentUser = unmarshallUser(currentLine);

            accounts.put(currentUser.getName(), currentUser);
        }

        sc.close();
    }

    private void writeAccountList() throws UserAccountDAOException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ACCOUNT_LIST));
        } catch (IOException e) {
            throw new UserAccountDAOException("Could not save account list to file", e);
        }

        String userAsText;
        List<User> userList = new ArrayList(accounts.values());

        for (User currentUser : userList) {
            userAsText = marshallUser(currentUser);
            out.println(userAsText);
            out.flush();
        }

        out.close();
    }
}
