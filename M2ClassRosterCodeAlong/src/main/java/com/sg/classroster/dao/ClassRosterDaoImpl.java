/*
implementation of dao
uses a HashMap to store the roster
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.util.*;

public class ClassRosterDaoImpl implements ClassRosterDao {

    private Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentID, Student student) {
        Student prevStudent=students.put(studentID, student);
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentID) {
        return students.get(studentID);
    }

    @Override
    public Student removeStudent(String studentID) {
        Student removedStudent=students.remove(studentID);
        return removedStudent;
    }

}
