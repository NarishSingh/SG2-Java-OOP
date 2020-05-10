/*
implementation of dao
uses a HashMap to store the roster
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.*;
import java.util.*;

public class ClassRosterDaoImpl implements ClassRosterDao {

    private Map<String, Student> students = new HashMap<>();
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    @Override
    public Student addStudent(String studentID, Student student) throws ClassRosterDaoException {
        loadRoster();
        Student newStudent = students.put(studentID, student);
        writeRoster();

        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException {
        loadRoster();
        return new ArrayList(students.values());
    }

    @Override
    public Student getStudent(String studentID) throws ClassRosterDaoException {
        loadRoster();
        return students.get(studentID);
    }

    @Override
    public Student removeStudent(String studentID) throws ClassRosterDaoException {
        loadRoster();
        Student removedStudent = students.remove(studentID);
        writeRoster();
        return removedStudent;
    }

    /*Data (Un)Marshalling*/
    /**
     * translate a delimited line of text into a student obj
     *
     * @param studentAsText {String} delimited by ::
     * @return {Student} obj with all fields filled
     */
    private Student unmarshallStudent(String studentAsText) {
        String[] studentTokens = studentAsText.split(DELIMITER);

        String studentID = studentTokens[0];
        Student studentFromFile = new Student(studentID);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);

        return studentFromFile;
    }

    /**
     * Read in a file and construct Student objects from lines delimited by ::,
     * throws exception if file cannot be written to
     *
     * @throws ClassRosterDaoException {IOException} if cannot write to file
     */
    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException("Couldn't load roster data into memory", e);
        }

        String currentLine;
        Student currentStudent;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine);

            students.put(currentStudent.getStudentID(), currentStudent);
        }

        scanner.close();
    }

    /**
     * Marshal data from a Student obj to text
     *
     * @param aStudent {Student} obj with all fields filled for a Student on
     *                 roster
     * @return {String} the Student obj as a delimited string, can be written to
     *         file
     */
    private String marshallStudent(Student aStudent) {
        String studentAsText = aStudent.getStudentID() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();

        return studentAsText;
    }

    /**
     * Writes all students in roster to a ROSTER_FILE using loadRoster()
     *
     * @throws ClassRosterDaoException {IOException} if an error occurs writing
     *                                 file
     */
    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterDaoException("Could not save student data.", e);
        }

        String studentAsText;
        List<Student> studentList = new ArrayList(students.values());

        for (Student currentStudent : studentList) {
            studentAsText = marshallStudent(currentStudent);
            out.println(studentAsText);
            out.flush();
        }

        out.close();
    }
}
