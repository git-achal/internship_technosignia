package com.studentmanagementbasic.studentmngt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentmanagementbasic.studentmngt.entity.Student;
import com.studentmanagementbasic.studentmngt.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get Student By Id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id,
                                 @RequestBody Student student) {

        return service.updateStudent(id, student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {

        service.deleteStudent(id);

        return "Student Deleted Successfully";
    }

}
