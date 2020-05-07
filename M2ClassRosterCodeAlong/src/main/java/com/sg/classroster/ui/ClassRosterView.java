/*
handles UI logic
 */
package com.sg.classroster.ui;

public class ClassRosterView {

    private UserIO io = new UserIOImpl();

    public int printMenuGetSelection() {
        io.print("Main Menu");
        io.print("1 | List Student IDs");
        io.print("2 | Create New Student");
        io.print("3 | View a Student");
        io.print("4 | Remove a Student");
        io.print("5 | Exit");

        return io.readInt("Please select from the above", 1, 5);
    }
}
