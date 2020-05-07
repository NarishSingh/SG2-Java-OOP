/*
This is the orchestrator of the application. It knows what needs to be done, 
when it needs to be done, and what component can do the job.
 */
package com.sg.classroster.controller;

import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOImpl;

public class ClassRosterController {

    private ClassRosterView view = new ClassRosterView();
    private UserIO io = new UserIOImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        while (keepGoing) {
            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1: {
                    io.print("LIST STUDENTS");
                    break;
                }
                case 2: {
                    io.print("CREATE STUDENT");
                    break;
                }
                case 3: {
                    io.print("VIEW STUDENT");
                    break;
                }
                case 4: {
                    io.print("REMOVE STUDENT");
                    break;
                }
                case 5: {
                    keepGoing = false;
                    break;
                }
                default: {
                    io.print("Unknown command...");
                }
            }

            io.print("Good Bye!");
        }
    }

    private int getMenuSelection() {
        return view.printMenuGetSelection();
    }
}
