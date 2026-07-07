package com.studentmanagementbasic.studentmngt.service;

import java.util.List;

import com.studentmanagementbasic.studentmngt.entity.Student;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Integer id);

    Student updateStudent(Integer id, Student student);

    void deleteStudent(Integer id);

}
