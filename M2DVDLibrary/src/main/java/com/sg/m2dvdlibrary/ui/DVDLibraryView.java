package com.sg.m2dvdlibrary.ui;

public class DVDLibraryView {
    
    private UserIO io;

    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    
    /**
     * Print UI menu and get selection
     * 
     * @return {int} 1-6 for menu choice
     */
    public int printMenuGetSelection(){
        io.print("Menu");
        io.print("1 | Add DVD");
        io.print("2 | Remove DVD");
        io.print("3 | Edit DVD Info");
        io.print("4 | List all DVD's");
        io.print("5 | View DVD Info");
        io.print("6 | Exit Program");
        
        return io.readInt("Action: ", 1, 5);
    }
}
