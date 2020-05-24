package com.sg.m2dvdlibrary.service;

import com.sg.m2dvdlibrary.dao.DVDLibraryDAOException;
import com.sg.m2dvdlibrary.dao.UserAccountDAOException;
import com.sg.m2dvdlibrary.dto.DVD;
import com.sg.m2dvdlibrary.dto.User;
import java.io.*;
import java.util.*;


public class ServiceDAOImpl implements ServiceDAO {

    /*DVD*/
    private Map<String, DVD> library = new HashMap<>();
    public static final String LIBRARY_FILE = "dvdlibrary.txt";
    public static final String DELIMITER = "::";

    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryDAOException {
        loadLibrary();
        DVD newDVD = library.put(title, dvd);
        writeLibrary();

        return newDVD;
    }

    @Override
    public List<DVD> getLibrary() throws DVDLibraryDAOException {
        loadLibrary();
        
        return new ArrayList(library.values());
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryDAOException {
        loadLibrary();
        
        return library.get(title);
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryDAOException {
        loadLibrary();
        DVD removedDVD = library.remove(title);
        writeLibrary();

        return removedDVD;
    }

    /*USER*/
    private final String ACCOUNT_LIST = "dvdLibAccounts.txt";
    private Map<String, User> accounts = new HashMap<>();

    @Override
    public User addUser(String name, User user) throws UserAccountDAOException {
        loadAccountList();
        User newUser = accounts.put(name, user);

        //TODO experiment with a way to generate a new log file for a new user
//        File file=new File(String.format("%sDVDList.txt", name)); //FIXME is this how to do regular expressions
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
    /*DVD*/
    /**
     * translate a delimited line of text from LIBRARY_FILE into a DVD obj
     *
     * @param dvdAsText {String} delimited by ::
     * @return {DVD} obj with all fields filled
     */
    private DVD unmarshallDVD(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String dvdTitle = dvdTokens[0];
        DVD dvdFromFile = new DVD(dvdTitle);

        dvdFromFile.setReleaseDate(dvdTokens[1]);
        dvdFromFile.setDirector(dvdTokens[2]);
        dvdFromFile.setStudio(dvdTokens[3]);
        dvdFromFile.setMpaaRating(dvdTokens[4]);
        dvdFromFile.setUserRating(dvdTokens[5]);

        return dvdFromFile;
    }

    /**
     * Read in a file and construct DVD obj from delimited lines of text
     *
     * @throws DVDLibraryDAOException if file cannot be read from
     */
    private void loadLibrary() throws DVDLibraryDAOException {
        Scanner sc;

        try {
            sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDAOException("Couldn't load library into memory...", e);
        }

        String currentLine;
        DVD currentDVD;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentDVD = unmarshallDVD(currentLine);

            library.put(currentDVD.getTitle(), currentDVD);
        }

        sc.close();
    }

    /**
     * Marshall data from a DVD obj to text
     *
     * @param aDVD {DVD} obj with all fields from library
     * @return {String} the DVD obj as delimited line of text
     */
    private String marshallDVD(DVD aDVD) {
        String dvdAsText = aDVD.getTitle() + DELIMITER;
        dvdAsText += aDVD.getReleaseDate() + DELIMITER;
        dvdAsText += aDVD.getDirector() + DELIMITER;
        dvdAsText += aDVD.getStudio() + DELIMITER;
        dvdAsText += aDVD.getMpaaRating() + DELIMITER;
        dvdAsText += aDVD.getUserRating();

        return dvdAsText;
    }

    /**
     * Writes all DVD's in library to LIBRARY_FILE
     *
     * @throws DVDLibraryDAOException {IOException} if cannot write to .txt file
     */
    private void writeLibrary() throws DVDLibraryDAOException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDAOException("Could not save DVD library data...", e);
        }

        String dvdAsText;
        List<DVD> dvdList = new ArrayList(library.values());

        for (DVD currentDVD : dvdList) {
            dvdAsText = marshallDVD(currentDVD);
            out.println(dvdAsText);
            out.flush();
        }

        out.close();
    }
    
    /*USER*/
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
