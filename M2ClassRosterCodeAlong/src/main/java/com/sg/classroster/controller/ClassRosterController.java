/*
This is the orchestrator of the application. It knows what needs to be done, 
when it needs to be done, and what component can do the job.
 */
package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoException;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOImpl;
import java.util.List;

public class ClassRosterController {

//    private ClassRosterView view = new ClassRosterView();
//    private ClassRosterDao dao = new ClassRosterDaoImpl();
    private UserIO io = new UserIOImpl();
    private ClassRosterView view;
    private ClassRosterDao dao;

    /*ctors using dependency injection*/
    public ClassRosterController(ClassRosterView view, ClassRosterDao dao) {
        this.view = view;
        this.dao = dao;
    }

    /**
     * App controller - control method calls based on user inputs
     */
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
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
                        unknownCommand();
                    }
                }
                
                exitMessage();
            }
        } catch (ClassRosterDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    /**
     * Get user input for Menu
     *
     * @return {int} 1-5 for menu actions
     */
    private int getMenuSelection() {
        return view.printMenuGetSelection();
    }

    /**
     * Display banners for student obj creation. Construct new Student obj and
     * fill fields. Add to class roster
     *
     * @throws ClassRosterDaoException
     */
    private void createStudent() throws ClassRosterDaoException {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentID(), newStudent);
        view.displayCreateSuccessBanner();
    }

    /**
     * Display banners for class roster listing. Retrieve and display class
     * roster from values in students HashMap DAO.
     *
     * @throws ClassRosterDaoException
     */
    private void listStudents() throws ClassRosterDaoException {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }

    /**
     * Display banners for student view listing. Get user input for the
     * student's ID, then retrieve and display their info
     *
     * @throws ClassRosterDaoException
     */
    public void viewStudent() throws ClassRosterDaoException {
        view.displayDisplayStudentBanner();
        String studentID = view.getStudentIDChoice();
        Student student = dao.getStudent(studentID);
        view.displayStudent(student);
    }

    /**
     * Display banners for removing a student from roster. Get user input for
     * the student's ID, then remove from students HashMap DAO
     *
     * @throws ClassRosterDaoException
     */
    private void removeStudent() throws ClassRosterDaoException {
        view.displayRemoveStudentBanner();
        String studentID = view.getStudentIDChoice();
        Student removedStudent = dao.removeStudent(studentID);
        view.displayRemoveResult(removedStudent);
    }

    /**
     * Display banner for an invalid Menu choice
     */
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    /**
     * Display banner for exiting app
     */
    private void exitMessage() {
        view.displayExitBanner();
    }
}
