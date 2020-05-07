/*
handles UI logic
 */
package com.sg.classroster.ui;

import com.sg.classroster.dto.Student;
import java.util.List;

public class ClassRosterView {

    private UserIO io = new UserIOImpl();
    
    /**
     * Print UI Menu and get selection
     *
     * @return {int} 1-5 for menu choice
     */
    public int printMenuGetSelection() {
        io.print("Main Menu");
        io.print("1 | List Student IDs");
        io.print("2 | Create New Student");
        io.print("3 | View a Student");
        io.print("4 | Remove a Student");
        io.print("5 | Exit");

        return io.readInt("Please select from the above", 1, 5);
    }

    /*2 - Create Student*/
    /**
     * Get user input to construct and fill the fields of a Student object
     *
     * @return {Student} a Student object with all fields
     */
    public Student getNewStudentInfo() {
        String studentID = io.readString("Please enter Student ID: ");
        String firstName = io.readString("Please enter first name: ");
        String lastName = io.readString("Please enter last name: ");
        String cohort = io.readString("Please enter last name: ");
        Student currentStudent = new Student(studentID);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }

    /**
     * Display opening Create Student banner for UI
     */
    public void displayCreateStudentBanner() {
        io.print("===Create Student===");
    }

    /**
     * Display closing Create Student banner for UI showing that obj was created
     * successfully
     */
    public void displayCreateSuccessBanner() {
        io.readString("Student create. Press ENTER to continue.");
    }

    /*1 - List Students*/
    /**
     * Display all students
     *
     * @param studentList {List} the class roster
     */
    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList) {
            String studentInfo = String.format("#%s : %s %s", currentStudent.getStudentID(), currentStudent.getFirstName(), currentStudent.getLastName());
            io.print(studentInfo);
        }

        io.readString("Please hit enter to continue.");
    }

    /**
     * Display All Student banner for UI
     */
    public void displayDisplayAllBanner() {
        io.print("===Display All Students===");
    }

    /*3 - Display Student*/
    /**
     * Display Display Student banner for UI
     */
    public void displayDisplayStudentBanner() {
        io.print("===Display Student===");
    }

    /**
     * Get user input for an ID corresponding to a student on roster
     *
     * @return {String} user's inputted student ID
     */
    public String getStudentIDChoice() {
        return io.readString("Please enter the Student ID: ");
    }
    
    /**
     * Display single student
     * @param student {Student} 
     */
    public void displayStudent(Student student){
        if (student!=null) {
            io.print(student.getStudentID());
            io.print(student.getFirstName() + " " + student.getLastName());
            io.print(student.getCohort());
            io.print("");
        } else{
            io.print("No such student");
        }
        
        io.readString("Press ENTER to continue.");
    }
    
    /*4 - Remove student*/
    public void displayRemoveStudentBanner(){
        io.print("===Remove Student===");
    }
    
    public void displayRemoveResult(Student studentRecord){
        if (studentRecord!=null) {
            io.print("Student successfully removed");
        } else {
            io.print("No such student.");
        }
        
        io.readString("Press ENTER to continue.");
    }
}
