/*
This is the orchestrator of the application. It knows what needs to be done, 
when it needs to be done, and what component can do the job.
 */
package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoImpl;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOImpl;
import java.util.List;

public class ClassRosterController {

    //TODO all javadoc for controller
    private ClassRosterView view = new ClassRosterView();
    private ClassRosterDao dao = new ClassRosterDaoImpl();
    private UserIO io = new UserIOImpl();
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        while (keepGoing) {
            menuSelection = getMenuSelection();
            
            switch (menuSelection) {
                case 1: {
                    listStudents();
                    break;
                }
                case 2: {
                    createStudent();
                    break;
                }
                case 3: {
                    viewStudent();
                    break;
                }
                case 4: {
                    removeStudent();
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
    
    private void createStudent() {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentID(), newStudent);
        view.displayCreateSuccessBanner();
    }
    
    private void listStudents() {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    public void viewStudent() {
        view.displayDisplayStudentBanner();
        String studentID = view.getStudentIDChoice();
        Student student = dao.getStudent(studentID);
        view.displayStudent(student);
    }
    
    private void removeStudent() {
        view.displayRemoveStudentBanner();
        String studentID = view.getStudentIDChoice();
        Student removedStudent = dao.removeStudent(studentID);
        view.displayRemoveResult(removedStudent);
    }
}
