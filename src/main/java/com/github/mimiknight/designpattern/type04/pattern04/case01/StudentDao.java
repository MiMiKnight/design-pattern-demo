package com.github.mimiknight.designpattern.type04.pattern04.case01;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}
